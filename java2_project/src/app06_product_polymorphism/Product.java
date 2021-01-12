//Product class ����
//1. ����� ����: count 
//2. ���� ��ȣ(����,unique): serialNum
//3. ����: price
//4. ��: model
//5. �귣��: maker
package app06_product_polymorphism;

class Product {
	
	//��� ���� ����
	//Ŭ���� ����:Ŭ������ �������� ����ϴ� ����
	static int count;
	//�ν��Ͻ� ����
	String serialNum;
	int price;
	String model;
	String maker;
	//������ ����(�⺻ ������,user-defined������) �ڵ����� ������ �� ����
	//Product() {}
	
	public Product(int price, String model, String maker) {
		super();
		this.serialNum="2020"+String.format("%02d", count);
		//String.format("%d", count): format�� �༭ ���ϴ� ������ ��Ʈ���� ����
		this.price=price;
		this.model=model;
		this.maker=maker;
		count++;
		
	}
	//getter,setter���(�ڵ����� ����)

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
