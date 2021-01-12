package app06_product_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

class ProductTask {
	//멤버 변수
	ArrayList<Product> productList=new ArrayList<>();
	//생성자
	ProductTask(){
		Car car1=new Car(2000,"Sonata","Hyundai",3000,2015);
		Car car2=new Car(3000,"Grandeur","Hyundai",5000,2017);
		
		productList.add(car1);
		productList.add(new CellPhone(80,"iphone11","Apple",8,64));
		productList.add(car2);
		productList.add(new CellPhone(100,"V50thinQ","LG",10,64));
		
	}
	
	int getNumber(String text) {
		System.out.println(text);
		Scanner sc =new Scanner (System. in);
		int num=Integer.parseInt(sc.nextLine());
		return num;
	}String getString(String text) {
		System.out.println(text);
		Scanner sc =new Scanner (System. in);
		return sc.nextLine();
	}
	
	public void buyProduct() {
		int menu=getNumber("1.차 2.휴대폰");
		int price =getNumber("가격을 입력하세요");
		String model=getString("모델을 입력하세요");
		String maker=getString("브랜드를 입력하세요");
		if(menu==1) { //create car
		   int engine=getNumber("배기량을 입력하세요");
		   int year=getNumber("연식을 입력하세요");
		   Car car=new Car(price,model,maker,engine,year);
		   
		}else if(menu==2) { //create cellphone
			int size= getNumber("액정크기를 입력하세요");
			int capacity =getNumber("메모리 용량를 입력하세요");
			CellPhone cellPhone=new CellPhone(price,model,maker,size,capacity);
			productList.add(cellPhone);
		}
	}

	public void cellProduct() {
		Scanner sc =new Scanner (System. in);
		System.out.println("판매하고자 하는 serial 번호를 입력하세요");
		String serialNum=sc.nextLine();
		boolean found =false;
		for(Product p: productList) {
			if(p.getSerialNum().equals(serialNum)) {
				found=true;
				productList.remove(p);
				System.out.println("제품이 판매되어 재고리스트에 삭제됩니다.");
				break;
			}
	  }
		if(! found) {
			for(Product p:productList) {
				System.out.println("요청하신 serial 번호가 존재하지 않습니다.");
			}
		}
	}

	public void printProduct() {
		for(Product p :productList) {
			System.out.println(p.info());
		}
	}
}
