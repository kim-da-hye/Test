//��ǥ:�޼���
//�޼����? �Լ���� �Ҹ��� Ư�� �۾� ����
//�Է°��� �޾Ƽ� ���ο��� ó���ϱ⵵ �ϰ�, �Ӱ��� ����ϱ⵵ �ϰ�, ��ȯ�ϱ⵵ ��
package lec05_class;

import java.util.Scanner;

public class Methods {
	
	//�޼��� ����
	//����: ��ȯ ���� �޼��� ��(�ް� ���� Ʋ)
	//Ÿ��1: �ްԺ����� �ְ� ��ȯ���� �ִ� ���
	static int sum(int a,int b)//�ްԺ�����,�� ���� parameter
	{
		return a+b;
	}
	//Ÿ��2:��ȯ���� ���� �ްԺ����� ���� ���
	//void:��ȯ���� ���� ���
	static void printhelp() {
		System.out.println("�� ������ ���� ���ϴ� ���α׷��̴�.");
	}
	//Ÿ��3:��ȯ���� ���� �ްԺ����� �ִ� ���
	static void printMessage(String message) {
		System.out.println(message);
	}
	//Ÿ��4:��ȯ���� �ְ� �ްԺ����� �ִ°��
	static int getNumber() {
		Scanner sc =new Scanner (System. in);
		System.out.println("������ �Է��ϼ���");
		int number=sc.nextInt();
		return number;
	}
	//���ε� �޼��� ���� �ϳ�: ���α׷��� ��Ʈ������Ʈ(������)
	public static void main(String[] args) {
		//�޼��� ȣ��
		printhelp();
		int num1=getNumber();
		int num2=getNumber();
		int total=sum(num1,num2);
		String message="����:"+ total;
		printMessage(message);

	}

}
