//Wait() : �����带 ����Ŵ 
//Notify() : �����带 ����
//���忡 ���� �ԱݵǸ� ����� �ϰ� ���� ���� ���� ��ٷȴٰ� �Աݵ��ڸ��� ���
package lec16_thread;

//�ڿ� resource
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
		System.out.println("�뵷�� �ԱݵǾ����ϴ�. ���� �ܾ� "+this.showMoney());
		this.notify();
	}
	synchronized void getMoney(int money) {
		while(this.money - money <0 ) {
			try {
				System.out.println("�����ܰ� ��� �����");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.money -= money; 
		System.out.println("�뵷�� ��ݵǾ����ϴ�. �����ܾ� "+this.showMoney());
	}
}
	
class Member extends Thread{
	private Account account;
	//������
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
	//������
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
		Account account = new Account(); //�ڿ��� �ϳ���. �����ϹǷ� (�޸� ����)
		Member member = new Member(account);
		member.setPriority(1);
		Sponser sponser = new Sponser(account);
		member.start(); 
		sponser.start();
		
	}

}

