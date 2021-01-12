package app06_product_polymorphism;

public class CellPhone extends Product{

	int size;
	int capacity;
	public CellPhone(int price, String model, String maker,int size,int capacity) {
		super(price, model, maker);
		this.size=size;
		this.capacity=capacity;
	}
	@Override
	public String info() {
		return super.info()+ "CellPhone [size=" + size + ", capacity=" + capacity + "]";

	}
	
	
	

}
