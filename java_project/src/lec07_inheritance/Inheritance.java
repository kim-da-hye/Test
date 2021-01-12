//상속 inheritance(단일 상속만 가능)
//상속이란 새로운 클래스를 작성할때 기존에 존재하는 클래스를 물려받아 이용하는것.
//부모클래스(조상클래스)
//자식클래스(자손클래스)
//모든클래스의 조상은 object

package lec07_inheritance;

//부모클래스
class Person{
	String name;//멤버변수
	//멤버 메서드
	//Person(){} 기본 생성자만 만드는 경우는 안해도 컴파일러가 자동으로 생성해줌.
	void printName() {
		System.out.println("제 이름은:" +name);
	}
}
//형식: 자식클래스 extends 부모클래스
class Child extends Person{
	String major;
	void setName(String myName) {
		//자식은 부모의 모든 속성을 물려받기 때문에. copy한것과 동일
		name=myName;
	}
	void learn() {
		System.out.println(major+"를 전공합니다.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//객체 생성
		Person person =new Person();
		Child child =new Child();
		person.printName();
		child.printName(); //정의한 적은 없지만 사용가능. 부모의 속성(변수,메서드)를 물려받기 때문에
		person.name="김다혜";
		child.major="컴공";
		person.printName();
		child.printName(); //인스턴스 변수이므로 부모와 공유하는 것은 아니다.
		child.name="김다혜2";
		child.printName();
		child.setName("김다혜3");
		child.printName();
		child.learn();
	}

}
