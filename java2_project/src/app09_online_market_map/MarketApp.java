//shopping mall management program
//변수 설계
//1.상품:상품명,가격으로 구성
//2.카트:카트 아이디,구매한 리스트(상품, 갯수),구매한 총 가격

//기능 설계
//1. 상품리스트 등록(상품: 상품명, 가격)
//2. 상품리스트 출력
//3. 사용자가 선택함 물품리스트(string)을 카트(class)에 담는다.
//4. 카트에 담긴 상품들을 출력한다.
//5. 사용자별로 카트에 담긴 상품매출을 계산하고, 총매출도 계산한다. 출력
package app09_online_market_map;

public class MarketApp {
	
	static String[] productDB= {"skirt,2000,large","pants,1000,medium","socks,5000,medium",
			"shirt,3000,small","slacks,7000,large","hood,9000,small"};
	static String[][]cartDB= {{"skirt,2","pants,3"},{"socks,2","shirt,4"},
			{"hood,1","slacks,5"},{"socks,10","slacks,5","pants,7"}};
	public static void main(String[] args) {
		ProductTask pt=new ProductTask();
		//1.등록
		pt.add(productDB);
		//2.출력
		pt.print();
		
		CartTask ct=new CartTask();
		//3.cartlist에 담기
		ct.add(cartDB);
		//4.출력
		ct.print();
		//5.매출액 계산
		ct.totalAmount(pt);
		//6.매출액 출력
		ct.printAmount();
		
		
	}

}
