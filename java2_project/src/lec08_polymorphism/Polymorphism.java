//다향성이란
//여러형태를 가지는 성질: 오버라이드,오버로딩
//다향성은 한가지 타입이 여러가지 형태의 인스턴스를 가질 수있다는 의미
//부모타입의 변수에 모든 자식 인스턴스가 대입할수있음

//class Person
//name,address (String type)
//생성자 두개씩(기본,parameter), 출력메서드(printInfo())

package lec08_polymorphism;

import java.util.ArrayList;

class Person{
	String name;
	String address;
	
	Person(){}
	
	Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	void printInfo() {
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
		
		
	}
}

//상속받는 Student
//major 추가 (String)
//생성자(기본,parameter),learn()(전공출력)

class Student extends Person{
	String major;
	Student(){}
	Student (String name,String address,String major){
		super(name,address);
		this.major=major;
	}
	void learn() {
		System.out.println(major+"을 전공합니다.");
	}
	void printInfo() {//override
		super.printInfo();
		learn();
	}
	
}

//상속받는 Teacher
//subject 추가
//생성자 (기본,parameter),teach() (과목 출력)
class Teacher extends Person{
	String subject;
	Teacher(){}
	Teacher(String name,String address,String subject){
		super(name,address);
		this.subject=subject;
	}
	void teach() {
		System.out.println(subject+"를 가르칩니다");
	}
	void printInfo() { //override
		super.printInfo();
		teach();
	}
}



public class Polymorphism {
	static void printInfo(Person person) {
		//person은  student ,teacher도 인자로 받을 수 있다.
		//override를 하기 때문에 자식의 메소드가 불림
		person.printInfo();
		
		//연산자 instanceof
//		if(person instanceof Student) {
//			Student s=(Student)person;
//			s.learn();
//		}
//		else if(person instanceof Teacher) {
//			((Teacher)person).teach();
//		}
	}
	
	static void printClass() {
		Person person =new Person("김다혜","서울");
		Student student=new Student("김남길","서울","연기");
		Teacher teacher=new Teacher("박찬호","공주","야구");
		
		//다형성 부모의 참조변수에다 자식의 인스턴스를 참조 할 수 있다.
		Person person1=student;
		person1.address="경기";
		Person person2=teacher;
		person2.name="김원필";
		
		//자식 타입의 변수는 부모의 인스턴스를 참조 할 수 없다.
		//자식의 속성으로 접근할 수 없기 때문에 (부모에는 없는 속성이 자식에게 있기 때문에)
		//Student student2=person; ERROR!
		//student2.major  ERROR!
		printInfo(student);
		printInfo(teacher);
	}
	static void makeList() {
		ArrayList<Person> personList=new ArrayList<>();
		personList.add(new Student("kim","korea","computer"));
		personList.add(new Student("shin","korea","computer"));
		personList.add(new Teacher("lee","korea","art"));
		personList.add(new Teacher("John","UK","economic"));
		
		//향상된 for문
		for(Person p: personList) {
			p.printInfo();
		}
		
		
	}
	public static void main(String[] args) {
		//printClass();
		makeList();
		//quiz:makeList()라는 메서드를 만들어서
		//ArrayList를 만듭니다.Generic: Person type
		//Student 2개를 만들어서 ArrayList에 add
		//Teacher 2개를 만들어서  ArrayList에 add
		//ArraList에 있는 데이터를 모두 출력하세요
		
	}

}
