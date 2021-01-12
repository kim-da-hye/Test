//Thread Life cycle
//네가지 상태
//New: 인스턴스화된 상태. start()전
//Runnable: start()메서드가 호출되면 new에서 Runnable로 상태가 바뀜. 실행할 수 있는 상태로 대기되었다가
//스케줄러에 의하여 선택되면 run()메서드를 수행
//Blocked: 실행중인 스레드가sleep(),join()메서드를 호출하게되면 block상태가 됨.
//Dead: run()메서드를 완료한 상태에서 메모리가 정보가 삭제됨.

package lec16_thread;

//스레드만들기
class SleepThread extends Thread {
	@Override
	public void run() {
		System.out.println("카운트다운 10초");
		for ( int i=10; i >=0 ; i--) {
			//sleep을 호출: block상태로 만듦. 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"번");
		}
		System.out.println("종료");
	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) {
		//객체 생성
		SleepThread thread = new SleepThread();
		thread.start(); 
	}

}
