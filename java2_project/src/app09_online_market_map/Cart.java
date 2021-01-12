//카트
//1. 카트아이디: 유일, 고유한 값.       static을 이용해서                  :id
//2. 상품 리스트: 상품과 갯수의 쌍             :itemList
//3. 카트에 담긴 물건의 총가격                     :totalAmount
//생성자
//toString()
package app09_online_market_map;


class Cart implements Comparable<Cart>{
	static int count=0;
	String id;
	ItemList itemList;
	int totalAmount;
	
	//생성자
	public Cart() {}
	public Cart(ItemList itemList) {
		this.id=Integer.toString(count++);
		this.itemList=itemList;
	}
	@Override
	public String toString() {
		return String.format("%4s", id) +itemList.toString();
	}
	public void totalAmount(ProductTask pt) {
		totalAmount= itemList.totalAmount(pt);
	}
	public void printAmount() {
		System.out.println(String.format("%10d", totalAmount) + toString() );
	}
	@Override
	public int compareTo(Cart o) {
		return o.totalAmount-totalAmount;
	}
}

