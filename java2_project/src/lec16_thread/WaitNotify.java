//Wait() : 스레드를 대기시킴 
//Notify() : 스레드를 깨움
//통장에 돈이 입금되면 출금을 하고 돈이 없을 때는 기다렸다가 입금되자마자 출금
package lec16_thread;

//자원 resource
class Account {
	int money =0;
	int showMoney() {
		return money; 
	}
	synchronized void setMoney(int money) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.money += money; 
		System.out.println("용돈이 입금되었습니다. 현재 잔액 "+this.showMoney());
		this.notify();
	}
	synchronized void getMoney(int money) {
		while(this.money - money <0 ) {
			try {
				System.out.println("통장잔고가 없어서 대기중");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.money -= money; 
		System.out.println("용돈이 출금되었습니다. 현재잔액 "+this.showMoney());
	}
}
	
class Member extends Thread{
	private Account account;
	//생성자
	Member() {}
	Member(Account account) {
		this.account= account; 
	}
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			account.getMoney(200);
		}
	}
}
class Sponser extends Thread{
	private Account account; 
	//생성자
	Sponser() {} 
	Sponser(Account account)  {
		this.account= account; 
	}
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			account.setMoney(200);
		}
	}
	
}
	

public class WaitNotify {

	public static void main(String[] args) {
		Account account = new Account(); //자원은 하나만. 공유하므로 (메모리 공유)
		Member member = new Member(account);
		member.setPriority(1);
		Sponser sponser = new Sponser(account);
		member.start(); 
		sponser.start();
		
	}

}

