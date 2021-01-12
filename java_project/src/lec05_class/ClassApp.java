//객체지향언어란(OPP:Object Oriented Programming)
//특징:1.추상화(abstraction),2.캡슐화(encapsulation)=은닉
//3.다향성(polymorphism),4.상속(inheritance)
//객체:Object모든 사물. 속성(변수 property)과 기능(메서드 method)으로 구성되어 있다.
//클래스class:객체 설계도,객체를 추상화한것,자료구조
//인스턴스Instance:클래스를 통해 생성된것, 메모리에 할당된 공간


//OPP의 특징1 추상화(Abstration)

//클래스의 정의: 구현하고자하는 객체의 속성과 기능을 정의하는 설계도
//사용자가 정의한 데이터타입이라고도 불린다.

package lec05_class;

class User{
	//속석:멤버 변수 (인스턴스 변수):객체마다 가지고 있는 고유한 속성(변수)
	//초기화를 안하는 경우에 자동으로 디폴트로 초기화 됨.스트링:null
	String id;
	boolean registered=false;
	//기능(행동):멤버함수(메서드)
	void register(String myId) {
		id=myId;
		registered=true;
	}
	void info() {
		System.out.println("id:"+id+"   등록여부: "+registered);
	}
}


public class ClassApp {

	public static void main(String[] args) {
		//클래스 변수
		//클래스 변수는 참조 변수(String,배열).즉 ,주소를 담는 변수
		User user1;
		
		//#2 클래스로부터 객체(인스턴스)를 새롭게 만들어서 인스턴스의 주소를 변수에 담는다.
		user1=new User();
		
		//#3 클래스 변수 선언과 초기화를 한번에
		User user2=new User();
		
		//#4 인스턴스 변수에 접근하는 방법
		System.out.println(user1.id);
		System.out.println(user1.registered);
		
		//#5 인스던스 변수의 값을 설정
		user1.id="kim2020";
		user1.registered=true;
		
		System.out.println(user1.id);
		System.out.println(user1.registered);
		
		//#6 메서드호출하는 방법
		user2.register("korea_academy");
		user2.info();
		
		
		
		
	} 

}
