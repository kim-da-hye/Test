//추상클래스
//추상메서드를 하나 이상 갖고 있으면 추상클래스
//한개 이상의 추상 메서드를 갖고있으면 추상클래스로 선언해야함
//목적:완전한클보다는 기본적인 틀을 제공

//추상메서드란?
//선언부만 정의하고 내용은 없는 메서드
//추상메서드의 목적은 오버라이딩(자식이)
package lec10_abstract;

abstract class Cellphone{
	//멤버면수선언
	boolean poweron =false;
	//추상메서드:abstract(키워드)
	//선언만 하면됨. 바디는 필요없음. {}없음.
	abstract void poweron();
	
	
}
class Samsung extends Cellphone{

	@Override
	void poweron() {
		System.out.println("사이드 키를 누릅니다");
	}
	
}
class Iphone extends Cellphone{

	@Override
	void poweron() {
		System.out.println("홈버튼을 누릅니다");
	}
	
}

public class AbstractApp {
	static void poweronCellphone(Cellphone c) {
		//추상클래스에 변수로 자식클래스의 객체를 담을 수 있다.
		c.poweron();
		
	}

	public static void main(String[] args) {
		//Cellphone cellphone=new Cellphone(); ERROR! 추상클래스는 객체를 만들수 없음.
		Iphone iphone =new Iphone();
		Samsung samsung=new Samsung();
		Cellphone cellphone1 =new Iphone();
		//추상클래스에 변수로 자식클래스의 객체를 담을 수 있다.
		Cellphone cellphone2 =new Samsung();
		
		poweronCellphone(samsung);
		poweronCellphone(iphone);
	}

}
