//��ǥ:���⼺ ����
//Product Management Program(car,cellphone)
//�޴�:1.���� (�ڵ���,�޴���)2. �Ǹ�(�ڵ���,�޴���)3.���(�ڵ���,�޴���) 9.����
//1. CellPhone�̶�� class�����(Product���)
// ����������, �޸� �뷮(int)
//2. ProductTask���class �����(carTaskó�� Product���õ� �޼��� ����).app�� ȣ���ϴ� �޼��� ����.
//3. Appmenu�����
package app06_product_polymorphism;

import java.util.Scanner;

public class ProductApp {
static void printMenu() {
	System.out.println("1.���� (�ڵ���,�޴���) 2. �Ǹ�(�ڵ���,�޴���) 3.���(�ڵ���,�޴���) 9.����");
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
		System.out.println("���α׷��� �����մϴ�.");
	}

}
