//생성자constructor:인스터스를 생성할때 자동으로 호줄되는 메서드
//형식:리터값이 없고 리턴타입도 없고 클래스이름과 같아야함 변환타입을 붙여주지않음
//메서드의 일종이므로 오버로딩 가능 즉 같은 이름으로 여러 생성자가능
//주의:사용자 생성자를 만드는 경우 기본 생성자를 꼭 만들어 줄것
package lec05_class;

class Phone{
	//초기값을 주지않는 경우 기본값으로 자동으로 초기화가 됨
	String model;
	int price=0;
	String color="없음";
	
	//기본생성자
	//프로그래머가 생성자를 만들지 않는 경우 컴파일러가 자동으로 추가해줌
	//프로그래머가(뭔가) 생성자를 만드는 경우 컴파일러가 자동으로 추가해주지않음
	//명시적으로 추가해줘야 에러 방지
	Phone(){
		
	}
	Phone(String model,int price){
		this.model=model;
		this.price=price;
	}
	Phone(String model,int price,String color){
		this.model=model;
		this.price=price;
		this.color=color;
	}
	void info() {
		System.out.println("모델:"+model);
		System.out.println("가격:"+price);
		System.out.println("색깔:"+color);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		Phone phone1=new Phone();//기본 생정자
		Phone phone2=new Phone("iphone6",90);
		Phone phone3=new Phone("galaxy-note",110,"silver");
		phone1.info();
		phone2.info();
		phone3.info();
	}

}
