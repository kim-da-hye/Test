package app06_product_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

class ProductTask {
	//��� ����
	ArrayList<Product> productList=new ArrayList<>();
	//������
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
		int menu=getNumber("1.�� 2.�޴���");
		int price =getNumber("������ �Է��ϼ���");
		String model=getString("���� �Է��ϼ���");
		String maker=getString("�귣�带 �Է��ϼ���");
		if(menu==1) { //create car
		   int engine=getNumber("��ⷮ�� �Է��ϼ���");
		   int year=getNumber("������ �Է��ϼ���");
		   Car car=new Car(price,model,maker,engine,year);
		   
		}else if(menu==2) { //create cellphone
			int size= getNumber("����ũ�⸦ �Է��ϼ���");
			int capacity =getNumber("�޸� �뷮�� �Է��ϼ���");
			CellPhone cellPhone=new CellPhone(price,model,maker,size,capacity);
			productList.add(cellPhone);
		}
	}

	public void cellProduct() {
		Scanner sc =new Scanner (System. in);
		System.out.println("�Ǹ��ϰ��� �ϴ� serial ��ȣ�� �Է��ϼ���");
		String serialNum=sc.nextLine();
		boolean found =false;
		for(Product p: productList) {
			if(p.getSerialNum().equals(serialNum)) {
				found=true;
				productList.remove(p);
				System.out.println("��ǰ�� �ǸŵǾ� �����Ʈ�� �����˴ϴ�.");
				break;
			}
	  }
		if(! found) {
			for(Product p:productList) {
				System.out.println("��û�Ͻ� serial ��ȣ�� �������� �ʽ��ϴ�.");
			}
		}
	}

	public void printProduct() {
		for(Product p :productList) {
			System.out.println(p.info());
		}
	}
}
