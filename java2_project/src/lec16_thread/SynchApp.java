//Synchronized : 동기화. 
//멀티스레드는 메모리를 공유하므로 스레드간 작업을 서로 간섭을 할 수가 있음. 
//즉, 공통의 메서드에 대하여 한 스레드각 작업을 하고 있는 동안 다른 스레드의 접근을 막는 것. 
//자원공유시 부작용을 방지 
package lec16_thread;

//스레드를 정의 : interface를 이용해서 
class TicketThread implements Runnable  {
	Ticket ticket = new Ticket(); 
	@Override
	public void run() {
		ticket.ticketing();
	}
}

//자원
class Ticket {
	//변수
	int ticketNumber =1; 
	//생성자
	Ticket(){}
	//ticketNumber가 0으로 만들기 전에 3개의 thread가 동시에 접근하므로 문제가 생김.
	//synchronized를 사용하여 동시에 접근을 막는다.  
	public synchronized void ticketing() {
		if (ticketNumber > 0)  {
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 성공");
			ticketNumber --;
		} else {
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 실패");
		}
		System.out.println(Thread.currentThread().getName()+"가 티케팅한 후에 티켓수 : "+ ticketNumber);
	}
}

public class SynchApp {

	public static void main(String[] args) {
		//스레드 객체 생성
		TicketThread ticketThread = new TicketThread();
		Thread t1 = new Thread(ticketThread, "A"); 
		Thread t2 = new Thread(ticketThread, "B"); 
		Thread t3 = new Thread(ticketThread, "C");
		t1.start(); 
		t2.start(); 
		t3.start(); 

	}

}

