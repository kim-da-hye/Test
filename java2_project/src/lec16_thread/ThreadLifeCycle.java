//Thread Life cycle
//�װ��� ����
//New: �ν��Ͻ�ȭ�� ����. start()��
//Runnable: start()�޼��尡 ȣ��Ǹ� new���� Runnable�� ���°� �ٲ�. ������ �� �ִ� ���·� ���Ǿ��ٰ�
//�����ٷ��� ���Ͽ� ���õǸ� run()�޼��带 ����
//Blocked: �������� �����尡sleep(),join()�޼��带 ȣ���ϰԵǸ� block���°� ��.
//Dead: run()�޼��带 �Ϸ��� ���¿��� �޸𸮰� ������ ������.

package lec16_thread;

//�����常���
class SleepThread extends Thread {
	@Override
	public void run() {
		System.out.println("ī��Ʈ�ٿ� 10��");
		for ( int i=10; i >=0 ; i--) {
			//sleep�� ȣ��: block���·� ����. 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"��");
		}
		System.out.println("����");
	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) {
		//��ü ����
		SleepThread thread = new SleepThread();
		thread.start(); 
	}

}
