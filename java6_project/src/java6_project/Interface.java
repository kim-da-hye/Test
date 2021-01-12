package java6_project;

interface A { //첫번째 인터페이스 슈퍼 클래스 선언
	void amethod1();
	void amethod2();
 }

 interface B { //두번째 인터페이스 슈퍼 클래스 선언
	 void bmethod1();
 }

 interface C extends A, B { // 두개의 인터페이스 상속
	 void cmethod1();
 }
class InterfaceClass implements C { //클래스의 선언과 최종 상속 지정
	 public void amethod1() { //메소드에 대한 구현
		 System.out.println("amethod1() 메소드의 구현");
 }
public void amethod2() { //메소드에 대한 구현
	 System.out.println("amethod2() 메소드의 구현");
}
 public void bmethod1() { //메소드에 대한 구현
	 System.out.println("bmethod1() 메소드의 구현");
 }
public void cmethod1() { //메소드에 대한 구현
	 System.out.println("cmethod1() 메소드의 구현");
 	}
 }
class InterfaceEx3 {
	 public static void main(String arg[]) {
		 System.out.println("-->인터페이스 다중 상속 사용 실습<--");
		 
		 InterfaceClass ic = new InterfaceClass(); //객체 선언
		 ic.amethod1();//메소드 호출
		 ic.amethod2();
		 ic.bmethod1();
		 ic.cmethod1();
		 System.out.println();
	 }
 }
