//��ȭ��ȣ �ϳ��� �Է¹޴� ���α׷��� �ۼ��ϰ��� �Ѵ�.
//���� �޴��� ����ϰ� ����ڰ� �޴��� ���������� �� ����� �����ϴ� ���α׷��� �ۼ��ϼ���.
//������ ����� main���� �������� ��� method�� �����ϼ���.

package app01_apps;

import java.util.Scanner;

public class MethodApp {
	static String read_number() {
		Scanner sc =new Scanner (System. in);
		String phonebookNumber=sc.nextLine();
		return phonebookNumber;
	}

	static void print_number(String phonebookNumber) {
		System.out.println(phonebookNumber);
	}
	public static void main(String[] args) {
		int input=0;
		Scanner sc =new Scanner (System. in);
		String phonebookNum="";
		while(true) {
			System.out.println("1.�Է�2.���9.���α׷� ����");
			input=sc.nextInt();
			if(input==9)break;
			switch(input) {
			case 1:
				phonebookNum=read_number();
				break;
			case 2:
				print_number(phonebookNum);
				break;
				default :
				System.out.println("�޴��� �ٽ� �����ϼ���");
				break;
			}
		}System.out.println("���α׷��� �����մϴ�");
	}

}
