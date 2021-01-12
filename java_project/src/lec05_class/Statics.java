//변수의 종류:전역변수(global)와 지역변수(local)
//전역변수: 클래스안에서 어디서나 통용.멤버변수
//멤버변수의 종류:
//1. 인스턴스 변수:인스턴스 명으로 접근. 각 인스턴스마다 존재하는 변수
//2. static변수:클래스 명으로 접근 클래스에 하나 존재하는 변수

//지역변수:메서드(함수)안에 선언된 변수. 메서드안에서만 통용. 
//자동 초기화가 되지 않으므로 면시적으로 초기화 해야함.

//같은 방식으로 메서드로 클래스 메서드와 인스턴스 메서드가 있음

package lec05_class;

//클래스 정의
class Customer{
	//클래스 변수:모든 인스턴스가 공유하는 변수
	//static을 붙여주면됨 인스턴스 없이 사용가능 클래스명으로 접근
	static int amountTotal;
	
	//인스턴스 변수 인스턴스 마다 가지는 고유한 변수 인스턴스명으로만 접근 가능
	int amount;
	
	//클래스 메서드(인스턴스 없이 사용가능)
	static void currentAmount() {
		System.out.println("현재상황"+ amountTotal);
	}
	//인스턴스 메서드
	void buy(int price) {
		//amount는 멤버 변수이므로 글로벌 변수. 따라서 클래스 내에서 아무데서나 호출 가능
		//price는 지역변수이므로buy()함수내에서만 통용
		int a=3;//a는 지역변수buy()함수내에서만 통용
		amount +=price;
		amountTotal +=price;
	}
	//인스턴스 메서드
	void info() {
		System.out.println("구매액은"+ amount);
	}
}

public class Statics {

	public static void main(String[] args) {
		//인스턴스 생성전에 접근할 수 있는 변수, 메서드
		//클래스 변수, 클래스 메서드
		Customer.currentAmount();
		System.out.println(Customer.amountTotal);
		
		//인스턴스 변수나 인스턴스 메서드는 생성해야 접근 가능
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		
		
		System.out.println(customer1.amount);
		System.out.println(customer1.amountTotal);//변수이름으로 접근해도 에러는 나오지 않음
	    customer1.buy(5000);
	    customer1.info();
	    Customer.currentAmount();
	    
	    customer2.buy(3000);
	    customer2.info();
	    Customer.currentAmount();
	}

}
