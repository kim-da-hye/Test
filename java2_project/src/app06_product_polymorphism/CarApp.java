//��ǥ: ����� Ȱ���ؼ� ���� �ذ�
//Car Management Program (�ڵ��� �߰� �ŷ� ����Ʈ)
//�޴�: while(true)
//1.����  buyCar()  
//2.�Ǹ� sellCar()
//3.���  printCar()
//9.���α׷� ���� break;

//1�ܰ�:product class�� �����ϰ� �׽�Ʈ
//2�ܰ�:Car class�� �����ϰ� �׽�Ʈ
//3�ܰ�:�޴�Ʋ�� ���α׷���(����)
//4�ܰ�:��� ����

package app06_product_polymorphism;

import java.util.Scanner;

class CarApp {
	
			
	static void test() {
        //product ��ü ���� 2��
		//(int price, String model, String maker)
		Product product1=new Product(2000,"Sonata","Hyundai");
		Product product2=new Product(3000,"Genesis","Hyundai");
		
		//Product�� ������ ���
		//toString():print�� �� �ڵ� ȣ���
		System.out.println(product1.toString());
		System.out.println(product2);
		
	
}
	static void printMenu() {
		System.out.println("1.����  2.�Ǹ� 3.��� 9.���α׷� ���� ");
	}
	
	public static void main(String[] args) {
		CarTask carTask=new CarTask();
		//test();
		while(true) {
			printMenu();
			Scanner sc =new Scanner (System. in);
			System.out.println("�޴� ��ȣ�� �Է��ϼ���");
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
		System.out.println("���α׷��� �����մϴ�");
	}

}
