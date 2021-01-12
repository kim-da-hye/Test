//싱글톤 디자인
//클래스의 인스턴스를 생성하는 디자인 패턴의 하나로
//하나의 메모리를 생성해서 이를 공유하고자 할 때 사용하는 패턴,
//getInstance() 메서드를 통해서 객체를 인스턴스화한다.(생성자를 사용하지 못함. new를 사용하지 못함.)
package lec11_coding_style;
//싱글톤 정의
class SingleTon{
	private static SingleTon instance; //private이므로 클래스 외부에서 접근불가
	int shareVar=1;
	private SingleTon() {} //private이므로 클래스 외부에서 접근불가
	public static SingleTon getInstance() {
		if(instance==null) {
			instance= new SingleTon();
		}
		return instance;
		
	}
}

public class SingleTonApp {

	public static void main(String[] args) {
		SingleTon singleton1=SingleTon.getInstance();
		System.out.println(singleton1);
		SingleTon singleton2=SingleTon.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton2.shareVar);
		singleton1.shareVar=4;
		System.out.println(singleton2.shareVar);

	}

}
