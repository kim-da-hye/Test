//목표: 상속을 활용해서 문제 해결
//Car Management Program (자동차 중고 거래 사이트)
//메뉴: while(true)
//1.구매  buyCar()  
//2.판매 sellCar()
//3.재고  printCar()
//9.프로그램 종료 break;

//1단계:product class를 정의하고 테스트
//2단계:Car class를 정의하고 테스트
//3단계:메뉴틀을 프로그래밍(메인)
//4단계:출력 구현

package app06_product_polymorphism;

import java.util.Scanner;

class CarApp {
	
			
	static void test() {
        //product 객체 생성 2개
		//(int price, String model, String maker)
		Product product1=new Product(2000,"Sonata","Hyundai");
		Product product2=new Product(3000,"Genesis","Hyundai");
		
		//Product의 내용을 출력
		//toString():print할 때 자동 호출됨
		System.out.println(product1.toString());
		System.out.println(product2);
		
	
}
	static void printMenu() {
		System.out.println("1.구매  2.판매 3.재고 9.프로그램 종료 ");
	}
	
	public static void main(String[] args) {
		CarTask carTask=new CarTask();
		//test();
		while(true) {
			printMenu();
			Scanner sc =new Scanner (System. in);
			System.out.println("메뉴 번호를 입력하세요");
			int menu=sc.nextInt();
			if(menu==9)break;
			switch(menu) {
			case 1:
				carTask.buyCar();
				break;
			case 2:
				carTask.sellCar();
				break;
			case 3:
				carTask.printCar();
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}

}
