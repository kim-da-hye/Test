//shopping mall management program
//���� ����
//1.��ǰ:��ǰ��,�������� ����
//2.īƮ:īƮ ���̵�,������ ����Ʈ(��ǰ, ����),������ �� ����

//��� ����
//1. ��ǰ����Ʈ ���(��ǰ: ��ǰ��, ����)
//2. ��ǰ����Ʈ ���
//3. ����ڰ� ������ ��ǰ����Ʈ(string)�� īƮ(class)�� ��´�.
//4. īƮ�� ��� ��ǰ���� ����Ѵ�.
//5. ����ں��� īƮ�� ��� ��ǰ������ ����ϰ�, �Ѹ��⵵ ����Ѵ�. ���
package app09_online_market_map;

public class MarketApp {
	
	static String[] productDB= {"skirt,2000,large","pants,1000,medium","socks,5000,medium",
			"shirt,3000,small","slacks,7000,large","hood,9000,small"};
	static String[][]cartDB= {{"skirt,2","pants,3"},{"socks,2","shirt,4"},
			{"hood,1","slacks,5"},{"socks,10","slacks,5","pants,7"}};
	public static void main(String[] args) {
		ProductTask pt=new ProductTask();
		//1.���
		pt.add(productDB);
		//2.���
		pt.print();
		
		CartTask ct=new CartTask();
		//3.cartlist�� ���
		ct.add(cartDB);
		//4.���
		ct.print();
		//5.����� ���
		ct.totalAmount(pt);
		//6.����� ���
		ct.printAmount();
		
		
	}

}
