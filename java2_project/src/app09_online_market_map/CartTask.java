package app09_online_market_map;

import java.util.ArrayList;
import java.util.Collections;

class CartTask {
	ArrayList<Cart> cartList;
	public CartTask() {
		cartList=new ArrayList<>();
	}

	public void add(String[][] cartDB) {
		//cartDB= {{"skirt,2","pants,3"},{"socks,2","shirt,4"},{"hood,1","slacks,5"}};
		
		for(String[] s:cartDB) {
		ItemList itemList=new ItemList();
		itemList.add(s);
		cartList.add(new Cart(itemList));
		}
	}

	public void print() {
		System.out.println("카트 리스트입니다");
		for(Cart c: cartList) {
			System.out.println(c);
		}
	}

	public void totalAmount(ProductTask pt) {
		for(Cart c:cartList) {
			c.totalAmount(pt);
		}
	}

	public void printAmount() {
		System.out.println("TotalAmount를 포함한 카트 리스트입니다.");
		Collections.sort(cartList);
		for(Cart c:cartList) {
			c.printAmount();
		}
	}

}
