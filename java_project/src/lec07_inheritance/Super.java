//super와this사용법
//super:부모의 instance(객체)
//this:자기 자신의 instance(객체)

package lec07_inheritance;

class Estate{
	int price;
	String address;
	void setPrice(int price) {
		this.price=price;
		//this.price:멤버변수(인스턴스 변수),price=지역변수(매게변수)
	}
	//오버로딩:다른 메서드로 인식:parameter가 다르므로
	void setPrice(int price,String address) {
		this.price=price;
		this.address=address;
	}
	
	void printInfo() {
		System.out.println("가격: " +price);
		System.out.println("주소: " +address);
	}
}
class House extends Estate{
	int floor;
	void setHouse(int floor,int price,String address){
		this.floor=floor;
		super.address=address; //super는 부모를 지칭한다.
		setPrice(price);       //부모의 메서드를 그냥 부를 수 있다.
		 //super.setPrice(price); super를 통해서 부를 수도 있다.
		
	}
	//오버라이딩:부모의 메서드를 재정의. 이름이 같음. parameter도 같음

void printInfo(){
	super.printInfo();//super로 부모 호출
	System.out.println(floor+"층");
	
	}
}

public class Super {

	public static void main(String[] args) {
		//객체 생성 변수 대입
		Estate estate= new Estate();
		House house=new House();
		house.setHouse(3, 1000, "서울시");
		house.printInfo();
		
		//멤버변수 메서드는.으로 접근 가능
		estate.setPrice(2000,"강원도");
		estate.printInfo();
		
		estate.setPrice(10000000);
		estate.address="경기도";
		estate.printInfo();
		
		
		
	}

}
