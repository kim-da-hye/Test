//�л���� �̴� ������Ʈ
//��ǥ:Array List�� Ȱ��,����������
//�޴�:1.��� 2.��� 3.���� 9.����

//���� Ǯ�� �ܰ�
//Step1: class ����
//Step2: ���θ޴��� ����
//Step3: �޴��� ����ϰ� ����ڷκ��� �Է��� �޴´�. �Է°��� 9�̸� ���α׷� ����
//Step4: �ʱⰪ�� �ְ� ��� �޴��� ����
//Step5: �Է� �޴��� ����
//Step6: ���� �޴��� ����
package app04_school_collection;


import java.util.Scanner;

public class SchoolApp {
	

	static void printMenu() {
		System.out.println("�޴�: 1.��� 2.��� 3.���� 9.����");
	}
	static int getNumber(String message) {
		System.out.println(message);
		Scanner sc =new Scanner (System. in);
		int num=Integer.parseInt(sc.nextLine());
		
		return num;
	}
	

	public static void main(String[] args) {
		//list ��ü ����
		StudentList list=new StudentList();
		
		int menu=0;
		do {
			printMenu();//�޴� ���
			menu=getNumber("��ȣ�� �Է��ϼ���");
			if(menu==9)break;
			switch(menu) {
			case 1: //�Է�
				list.addList();
				break;
			case 2: //���
				list.printList();
				break;
			case 3: //����
				list.deleteList();
				break;
			}
		}while(true);
		System.out.println("���α׷��� �����մϴ�");
	}

}
