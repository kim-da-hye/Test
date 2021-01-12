package app06_product_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

class CarTask {
	ArrayList<Car> carList= new ArrayList<>();
	CarTask(){
	//Car객체 2개 생성
	//(int price, String model, String maker, int engine, int year)
	Car car1=new Car(2000,"Sonata","Hyundai",3000,2015);
	Car car2=new Car(3000,"Grandeur","Hyundai",5000,2017);
	
    
	carList.add(car1);
	carList.add(car2);
	}
	void printCar() {
		//향상된 for문
		for(Car c:carList) {
		//System.out.println(c.toString());
			System.out.println(c); //주소
			System.out.println(c.info()); //내용
		}
	}
	int getNumber(String text) {
		System.out.println(text);
		Scanner sc =new Scanner (System. in);
		int num=Integer.parseInt(sc.nextLine());
		return num;
	}
	String getString(String text) {
		System.out.println(text);
		Scanner sc =new Scanner (System. in);
		return sc.nextLine();
	}
	void buyCar() {
		int price=getNumber("가격을 입력하세요");
		String model=getString("모델을 입력하세요");
		String maker=getString("브랜드를 입력하세요");
	    int engine=getNumber("배기량을 입력하세요");
	    int year=getNumber("연식를 입력하세요");
		Car car1=new Car(price,model,maker,engine,year);
		carList.add(car1);
		
	}	
	void sellCar() {
		Scanner sc =new Scanner (System. in);
		System.out.println("판매하고자 하는 serial 번호를 입력하세요");
		String serialNum=sc.nextLine();
		boolean found =false;
		for(Car c: carList) {
			if(c.getSerialNum().equals(serialNum)) {
				found=true;
				carList.remove(c);
				System.out.println("제품이 판매되어 재고리스트에 삭제됩니다.");
				break;
			}
		}
		if(! found) {
			System.out.println("요청하신 serial 번호가 존재하지 않습니다.");
		}
	}
}
