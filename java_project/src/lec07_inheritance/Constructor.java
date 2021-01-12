//상속과 클래스
//컴파일러 작동원리 이해와 기본생성자
//자손클래스와 생서자 작업을 할 때 부모클래스의 생성자도 호출해줘야함
//자손 클래스 생성자가 부모클래스의 생성자를 부르지않는 경우 컴파일러가 자동으로 생성자
//내부에 super()를 추가하는데,이때
//부모클래스에 기본생성자가 없는 경우 에러 발생
//따라서 생성자를 만드는 경우 반드시 기본생성자를 만들어 줘야함

package lec07_inheritance;
//product 부모 클래스
class Product{
	
	int serialNumber;
	//생성자 정의
	//생성자를 아예 아무것도 안만드는 경우 컴파일러가default생성자를 만들어줌
	Product(){}//기본 생성자를 만드는 순간 에러 해결
	Product(int num){
		serialNumber=num;
	}
	}

//Phone 자식 클래스
class Phone extends Product{
	String model;
	int price;
	String color;
	//생성자 정의
	//눈에 보이지는 않으나, 부모 기본 생성자를 부르고있음 
	//따라서 부모에게 기본 생성자가 없는 경우 에러가남 
	Phone(){}
	Phone(String model,int price,String color){
		this.model=model;
		this.price=price;
		this.color=color;
	}
}
public class Constructor {

	public static void main(String[] args) {
      Phone phone=new Phone("Samsung",100,"gray");
	

}
}
