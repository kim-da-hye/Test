//멤버변수는 크게 정적멤버와 인스턴스형 멤버로 나뉜다.
//멤버메서드
//1. 정적메서드
//	1)static을 붙여야함
//	2)정적멤버(변수/메서드)는 JVM에 클래스를 load하는 시점에 메모리가 생김(실행전)
//	3)접근방법: 클래스명.멤버
//2. 인스턴스형 메서드
//	1)인스턴스멤버는 JVM에 인터프리터할때 메모리가 생성된다.(실행시)
//  2)접근방법: 인스턴스형 변수.멤버(객체생성된후(=인스턴스가 생성) 접근가능
package lec11_coding_style;
class staticClass{
	
	//인스턴스형 변수
	int instanceVar;
	//정적변수
	static int staticVar;
	//인스턴스형 메서드
	void instanceMethod() {
		instanceVar=10;
		staticVar=30;
		staticMethod();
	}
	static void print() {
		System.out.println("print");
	}
	//정적 메서드
	static void staticMethod() {
		//instanceVar=30;//정적메서드가 호출될떄 인스턴스 변수가 없으므로 에러발생
		staticVar=40;
		//instanceMethod();//정적메서드가 호출될떄 인스턴스 메서드가 없으므로 에러발생
		
		//static method는 호출됨
		print();
		
	}
}

public class StaticMember {

	public static void main(String[] args) {
		//static 멤버호출
		staticClass.staticVar=20;
		staticClass.print();
		staticClass.staticMethod();
		
		//인스턴스멤버 호출 불가능. 객체만들기전까지(객체=instance)
		staticClass sc=new staticClass();
		sc.instanceVar=100;
		sc.instanceMethod();
		sc.print();//warning:static member를 instance를 통해서 부르는 경우. class이름으로 접근해야 옳은 방법임.
	}

}
