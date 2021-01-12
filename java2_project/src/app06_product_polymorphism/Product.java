//Product class 정의
//1. 재고의 갯수: count 
//2. 관리 번호(고유,unique): serialNum
//3. 가격: price
//4. 모델: model
//5. 브랜드: maker
package app06_product_polymorphism;

class Product {
	
	//멤버 변수 설정
	//클래스 변수:클래스에 공통으로 사용하는 변수
	static int count;
	//인스턴스 변수
	String serialNum;
	int price;
	String model;
	String maker;
	//생성자 정의(기본 생성자,user-defined생성자) 자동으로 생성할 수 있음
	//Product() {}
	
	public Product(int price, String model, String maker) {
		super();
		this.serialNum="2020"+String.format("%02d", count);
		//String.format("%d", count): format을 줘서 원하는 포맷의 스트링을 생성
		this.price=price;
		this.model=model;
		this.maker=maker;
		count++;
		
	}
	//getter,setter사용(자동으로 생성)

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String info() {
		return "Product [serialNum=" + serialNum + ", price=" + price + ", model=" + model + ", maker=" + maker + "]";
	}
	
	
	
}
