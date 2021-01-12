package java6_project;


class SuperObj { //슈퍼클래스 선언
		 int x = 5;
		 public void dispX() { //슈퍼 메소드 선언
			 System.out.println("\n슈퍼 클래스 ");
			 System.out.println("x = " + x); // 5를 표시한다.
		 } 
	}
		 class ThisObj extends SuperObj { // SuperObj을 계승 //서브클래스 선언
		 int x = 10;
		 public void dispX() { // 메소드의 오버라이드 //서브 메소드 선언
		 int x = 20;
		 	System.out.println("서브 클래스 ");
		 	System.out.println("x = " + x); // 20을 표시한다.
		 	System.out.println("this.x = " + this.x); // 10을 표시한다.
		 super.dispX(); // 슈퍼 클래스의 메소드의 호출
		 }
	 }
		 class OverridingEx3 {
		 public static void main(String args[]) {
			 System.out.println("-->Overriding 메소드 사용 실습(3)<--");
			 
		 ThisObj obj = new ThisObj(); // 객체 선언
		 obj.dispX(); // 객체의 메소드의 호출
		 	System.out.println();
		 }
	}

