package java6_project;


	class staticSuper { //슈퍼클래스 선언
		 static int i = 10; //static 변수 선언
	   }
	 class OverridingEx4 extends staticSuper { //서브 클래스 선언 및 상속
	 static int i = 20; //static 변수 선언
	 public static void main(String[] args) {
	 System.out.println("-->Overriding 메소드 사용 실습(4)<--");
	 
	 System.out.println("i = " + i); //변수 출력
	 System.out.println("슈퍼클래스 i = " + staticSuper.i); //변수 출력
	 System.out.println("서브클래스 i = " + OverridingEx4.i); //변수 출력
	 System.out.println();
	 }
 }
