//목표:다향성 이해
//Product Management Program(car,cellphone)
//메뉴:1.구매 (자동차,휴대폰)2. 판매(자동차,휴대폰)3.재고(자동차,휴대폰) 9.종료
//1. CellPhone이라는 class만들기(Product상속)
// 액정사이즈, 메모리 용량(int)
//2. ProductTask라는class 만들기(carTask처럼 Product관련된 메서드 정의).app이 호출하는 메서드 제공.
//3. Appmenu만들기
package app06_product_polymorphism;

import java.util.Scanner;

public class ProductApp {
static void printMenu() {
	System.out.println("1.구매 (자동차,휴대폰) 2. 판매(자동차,휴대폰) 3.재고(자동차,휴대폰) 9.종료");
}
	public static void main(String[] args) {
		ProductTask pt=new ProductTask();
		while(true) {
			printMenu();
			Scanner sc =new Scanner (System. in);
			int menu=sc.nextInt();
			if(menu==9) break;
			switch(menu) {
			case 1:
				pt.buyProduct();
				break;
			case 2:
				pt.cellProduct();
				break;
			case 3:
				pt.printProduct();
				break;
			}
		}
		System.out.println("프로그램이 종료합니다.");
	}

}
