package app06_product_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

class CarTask {
	ArrayList<Car> carList= new ArrayList<>();
	CarTask(){
	//Car��ü 2�� ����
	//(int price, String model, String maker, int engine, int year)
	Car car1=new Car(2000,"Sonata","Hyundai",3000,2015);
	Car car2=new Car(3000,"Grandeur","Hyundai",5000,2017);
	
    
	carList.add(car1);
	carList.add(car2);
	}
	void printCar() {
		//���� for��
		for(Car c:carList) {
		//System.out.println(c.toString());
			System.out.println(c); //�ּ�
			System.out.println(c.info()); //����
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
		int price=getNumber("������ �Է��ϼ���");
		String model=getString("���� �Է��ϼ���");
		String maker=getString("�귣�带 �Է��ϼ���");
	    int engine=getNumber("��ⷮ�� �Է��ϼ���");
	    int year=getNumber("���ĸ� �Է��ϼ���");
		Car car1=new Car(price,model,maker,engine,year);
		carList.add(car1);
		
	}	
	void sellCar() {
		Scanner sc =new Scanner (System. in);
		System.out.println("�Ǹ��ϰ��� �ϴ� serial ��ȣ�� �Է��ϼ���");
		String serialNum=sc.nextLine();
		boolean found =false;
		for(Car c: carList) {
			if(c.getSerialNum().equals(serialNum)) {
				found=true;
				carList.remove(c);
				System.out.println("��ǰ�� �ǸŵǾ� �����Ʈ�� �����˴ϴ�.");
				break;
			}
		}
		if(! found) {
			System.out.println("��û�Ͻ� serial ��ȣ�� �������� �ʽ��ϴ�.");
		}
	}
}
