//프로세스 : 프로그램을 실행시키면 메모리가 할당되어 실행되는 데 이렇게 실행중인 프로그램. 메모리공유안함.  
//스레드 : 하나의 프로세스 안에서 하나의 일을 하는 주체. 스레드간에 메모리를 공유함. 
//멀티스레드 : 하나의 프로세스 안에서 두가지 이상의 일을 하는 것
//싱글스레드 : 메인만 도는 경우. 
//스레드를 만드는 방법
//1. Thread 클래스를 상속받는 방법 
//2. Runnable 인터페이스를 구현하는 방법 (다중상속을 하는 경우 필요)

package lec16_thread;

//1. Thread를 상속받는 방법
//run()을 override하면 된다. 
class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i=0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+"스레드 진행중"+i);
		}
	}
}
//2. Interface를 구현하는 방법
class Thread2 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+"러너블 진행중"+i);
		}
	}
}

public class ThreadApp {
	public static void main(String[] args) {
		//객체 생성#1  : class사용한 경우
		Thread1 thread1 = new Thread1();
		thread1.setName("threadClass");
		thread1.setPriority(1);
		System.out.println("thread1 우선순위: "+ thread1.getPriority());
		//start()를 호출하면 run()이 호출됨. 
		thread1.start();//스레드가 실행됨
		
		//객체 생성#2 : interface사용한 경우: interface객체를 생성한 후에 이를 사용하여 thread클래스를 생성 
		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2, "ThreadInterface");
		//우선순위를 지정하지 않는 경우 
		System.out.println("thread2 우선순위: "+ thread.getPriority());
		thread.start(); //스레드가 실행됨
		
		for (int i=0; i<100; i++) {
			System.out.println("메인함수 진행중"+i);
		}
	}

}
