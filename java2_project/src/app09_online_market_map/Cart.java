//īƮ
//1. īƮ���̵�: ����, ������ ��.       static�� �̿��ؼ�                  :id
//2. ��ǰ ����Ʈ: ��ǰ�� ������ ��             :itemList
//3. īƮ�� ��� ������ �Ѱ���                     :totalAmount
//������
//toString()
package app09_online_market_map;


class Cart implements Comparable<Cart>{
	static int count=0;
	String id;
	ItemList itemList;
	int totalAmount;
	
	//������
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

