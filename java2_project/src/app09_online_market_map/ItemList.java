//��ǰ ����Ʈ: ��ǰ�� ������ ��  
package app09_online_market_map;

import java.util.HashMap;
import java.util.Set;

class ItemList {
	HashMap<ProductType, Integer> itemList;
	
	public void add(String[] items) {
		//skirt,2 pant,3
		for(String item: items) {
			String[] columns=item.split(",");
			//System.out.println(columns[0]+columns[1]);
			itemList.put(ProductType.valueOf(columns[0].trim()),
					Integer.parseInt(columns[1].trim()));
		}
	}
	ItemList(){
		itemList=new HashMap<>();
	}
	@Override
	public String toString() {
		String text="";
		Set<ProductType> keys=itemList.keySet();
		for(ProductType key :keys) {
			text+=String.format("%10s %5d ", key.getName(), itemList.get(key));
		}
		return text;
	}
	public int totalAmount(ProductTask pt) {
		//{"skirt,2","pants,3"}
		int totalAmount=0;
		Set<ProductType> keys=itemList.keySet();
		for(ProductType key :keys) {
			int quantity= itemList.get(key);//����
			int price=pt.productList.get(key).price;//����
			int amount=quantity*price;
			totalAmount+=amount;
		}
		return totalAmount;
		
	}
	
}
