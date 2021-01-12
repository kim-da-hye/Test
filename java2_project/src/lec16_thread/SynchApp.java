//Synchronized : ����ȭ. 
//��Ƽ������� �޸𸮸� �����ϹǷ� �����尣 �۾��� ���� ������ �� ���� ����. 
//��, ������ �޼��忡 ���Ͽ� �� �����尢 �۾��� �ϰ� �ִ� ���� �ٸ� �������� ������ ���� ��. 
//�ڿ������� ���ۿ��� ���� 
package lec16_thread;

//�����带 ���� : interface�� �̿��ؼ� 
class TicketThread implements Runnable  {
	Ticket ticket = new Ticket(); 
	@Override
	public void run() {
		ticket.ticketing();
	}
}

//�ڿ�
class Ticket {
	//����
	int ticketNumber =1; 
	//������
	Ticket(){}
	//ticketNumber�� 0���� ����� ���� 3���� thread�� ���ÿ� �����ϹǷ� ������ ����.
	//synchronized�� ����Ͽ� ���ÿ� ������ ���´�.  
	public synchronized void ticketing() {
		if (ticketNumber > 0)  {
			System.out.println(Thread.currentThread().getName() + "�� Ƽ���� ����");
			ticketNumber --;
		} else {
			System.out.println(Thread.currentThread().getName() + "�� Ƽ���� ����");
		}
		System.out.println(Thread.currentThread().getName()+"�� Ƽ������ �Ŀ� Ƽ�ϼ� : "+ ticketNumber);
	}
}

public class SynchApp {

	public static void main(String[] args) {
		//������ ��ü ����
		TicketThread ticketThread = new TicketThread();
		Thread t1 = new Thread(ticketThread, "A"); 
		Thread t2 = new Thread(ticketThread, "B"); 
		Thread t3 = new Thread(ticketThread, "C");
		t1.start(); 
		t2.start(); 
		t3.start(); 

	}

}

