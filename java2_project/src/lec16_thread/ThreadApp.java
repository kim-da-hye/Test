//���μ��� : ���α׷��� �����Ű�� �޸𸮰� �Ҵ�Ǿ� ����Ǵ� �� �̷��� �������� ���α׷�. �޸𸮰�������.  
//������ : �ϳ��� ���μ��� �ȿ��� �ϳ��� ���� �ϴ� ��ü. �����尣�� �޸𸮸� ������. 
//��Ƽ������ : �ϳ��� ���μ��� �ȿ��� �ΰ��� �̻��� ���� �ϴ� ��
//�̱۽����� : ���θ� ���� ���. 
//�����带 ����� ���
//1. Thread Ŭ������ ��ӹ޴� ��� 
//2. Runnable �������̽��� �����ϴ� ��� (���߻���� �ϴ� ��� �ʿ�)

package lec16_thread;

//1. Thread�� ��ӹ޴� ���
//run()�� override�ϸ� �ȴ�. 
class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i=0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+"������ ������"+i);
		}
	}
}
//2. Interface�� �����ϴ� ���
class Thread2 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+"���ʺ� ������"+i);
		}
	}
}

public class ThreadApp {
	public static void main(String[] args) {
		//��ü ����#1  : class����� ���
		Thread1 thread1 = new Thread1();
		thread1.setName("threadClass");
		thread1.setPriority(1);
		System.out.println("thread1 �켱����: "+ thread1.getPriority());
		//start()�� ȣ���ϸ� run()�� ȣ���. 
		thread1.start();//�����尡 �����
		
		//��ü ����#2 : interface����� ���: interface��ü�� ������ �Ŀ� �̸� ����Ͽ� threadŬ������ ���� 
		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2, "ThreadInterface");
		//�켱������ �������� �ʴ� ��� 
		System.out.println("thread2 �켱����: "+ thread.getPriority());
		thread.start(); //�����尡 �����
		
		for (int i=0; i<100; i++) {
			System.out.println("�����Լ� ������"+i);
		}
	}

}
