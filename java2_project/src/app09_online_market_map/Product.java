package app09_online_market_map;

public class Product {
	String name;
	int price;
	String size;
	Product(){}
	Product(String name,int price,String size){
		this.name=name;
		this.price=price;
		this.size=size;
	}
	@Override
	public String toString() {
		return String.format("%10s %7d %8s", name, price, size);
	}
}
