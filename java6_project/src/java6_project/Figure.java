package java6_project;

abstract class Figure {// 추상 메소드와 클래스의 사용 //추상 슈퍼 클래스의 선언
	double dim1;
	double dim2;
	Figure(double a, double b) { //생성자 선언
		dim1 = a;
		dim2 = b;
 }
	abstract double area(); // area 추상 메소드 선언
 }

class Rectangle extends Figure { //첫 번째 서브 클래스의 선언과 상속
	Rectangle(double a, double b) { //생성자 선언
		super(a, b);
 }
 // 사각형 area의 override
 double area() {
	 System.out.println("사각형의 내부 area");
	 return dim1 * dim2;
 	}
 }

class Triangle extends Figure { //두 번째 서브 클래스의 선언과 상속
	Triangle(double a, double b) { //생성자 선언
		super(a, b); //상위 메소드의 호출

	}
 // 삼각형 area의 override
	double area() { //추상 메소드의 구현
		System.out.println("삼각형의 내부 area");
		return dim1 * dim2 / 2;

	}
}
 class AbstractEx4 {
	 public static void main(String args[]) {
		 System.out.println("-->추상클래스 사용 실습(4)<--");
		
		 // Figure f = new Figure(10, 10); 선언은 오류
		 Rectangle r = new Rectangle(9, 5); //Rectangle 클래스의 객체 선언
		 Triangle t = new Triangle(10, 8);  //Triangle 클래스의 객체 선언
		 Figure figref; // 객체가 생성 안되면 옮음
		 figref = r;
		 System.out.println("Area = " + figref.area()); //area메소드의 호출
		 figref = t;
		 System.out.println("Area = " + figref.area()); //area메소드의 호출
		 System.out.println();

	 }
}
