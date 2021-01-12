package java6_project;

abstract class AbstractTest{ //추상클래스 선언
	public abstract void method1(); //추상메소드 선언

	void method2() { //일반 메소드 선언
		System.out.println(" method2()의 구현");
 	}
 }

 class AbstractTest2 extends AbstractTest{
	 public void method1() { //메인 클래스의 선언과 상속 선언
		 System.out.println(" method1()의 구현");
 	}
 }
 class AbstractEx1 {
	 public static void main(String[] args) {
		 System.out.println("-->추상클래스 사용 실습(2)<--");
		 
		 AbstractTest2 obj0 = new AbstractTest2(); //객체 선언 //추상 메소드의 구현 선언
		 obj0.method1(); //메소드의 호출
		 obj0.method2();
		 System.out.println();
   }
 }