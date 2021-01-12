package java6_project;


	class Father { //슈퍼클래스 선언
		 void show(String str) { //슈퍼 메소드 선언
		 System.out.println("show(String str) 수행 " + str);
	}
		 }
		 class Son extends Father { //서브 클래스 선언
		 void show() { //서브 메소드 선언
		 System.out.println("하위클래스의 메소드 show() 수행");
	     }
	}
		
	class OverridingEx2 {
	  public static void main(String args[]) {
		System.out.println("-->Overriding 메소드 사용 실습(2)<--");
		
		Son over = new Son(); //객체 선언
		over.show("상위 클래스 호출");
		over.show();
		System.out.println();
		}
	}
