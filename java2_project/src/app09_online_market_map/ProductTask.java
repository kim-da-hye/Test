package app09_online_market_map;

import java.util.HashMap;
import java.util.Set;

public class ProductTask {
	HashMap<ProductType, Product> productList;
	
	//생성자
	ProductTask(){
		 productList=new HashMap<>();
	}
	
	public void add(String[] productDB) {
		// {"skirt,2000,large","pants,1000,medium","socks,5000,medium",
		//	"shirt,3000,small","slacks,7000,large","hood,9000,small"};
		for(String s: productDB) {
			//System.out.println(s);
			String[] columns=s.split(",");
			String name=columns[0].trim();
			int price=Integer.parseInt(columns[1].trim());
			String size=columns[2].trim();
			ProductType type=ProductType.valueOf(name);
			productList.put(type,new Product(name,price,size));
		}
		
	}

	public void print() {
		System.out.println("상품 리스트입니다");
		//향상된 for문 사용 HashMap
		Set<ProductType> keys= productList.keySet();
		//System.out.println(keys);
		for(ProductType key: keys) {
			System.out.print(key.getName());
			System.out.println(" "+productList.get(key));
		}
	}

}
