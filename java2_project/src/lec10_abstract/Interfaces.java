//인터페이스:객체간 상호작용을 위한 일종의 규약
//클래스가 객체 설계도라면 인터페이스는 클래스의 설계도
//구성
//1.추상메서드
//2.상수(final)로만 구성
//3.주의: 멤버변수 없음.

//인터페이스의 특징:
//1.자식클래스가 상속받아서 추상메서드를 오버라이드해야 함.
//2.중복상속이 가능(클래스는 단일 상속만 됨)

//인터페이스의 용도
//1.클래스와 인터페이스 구현을 동시에 진행할수 있음으로 개발시간이 단축
//2.클래스마다 독립적인 프로그래밍 가능. 클래스와 클래스를 인터페이스로 연결

package lec10_abstract;

interface Zoomable{
	//상수 선언부
	//final선언시 무조건 public static여야 함.
	public static final int RATE=2;
	int INITAL=1;
	
	//추상메서드
	//무조건 public abstract이어야 함. 안붙이면 컴파일러가 붙여줌
	public abstract void zoomin();
	void zoomout();
}

class Rectangle implements Zoomable{
    int x1,y1,x2,y2;
    //생성자
    Rectangle(){
    	x1=INITAL;
    	y1=INITAL;
    	x2=INITAL;
    	y2=INITAL;
    }
    //오버라이드
	@Override
	public void zoomin() {
		x1*= RATE;
		y1*= RATE;
		x2*= RATE;
		y2*= RATE;
	}

	@Override
	public void zoomout() {}
	
}

class Circle implements Zoomable{
	int x1,y1,r;
	//생성자
	Circle(){
		x1=INITAL;
		y1=INITAL;
		r=INITAL;
	}
	//오버라이드
	@Override
	public void zoomin() {
		x1*= RATE;
		y1*= RATE;
		r*= RATE;
	}

	@Override
	public void zoomout() {}
	
}
public class Interfaces {
	public static void main(String[] args) {
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
		
		Zoomable zoom1=circle;
		Zoomable zoom2=new Circle();
		Zoomable zoom3=new Rectangle();
		
		
		zoomin(circle);
		zoomin(rectangle);
		
		
	}

	//interface 변수를 선언하여 자식의 객체를 담는다. 다형성
	static void zoomin(Zoomable zoom) {
		zoom.zoomin();
	}

}
