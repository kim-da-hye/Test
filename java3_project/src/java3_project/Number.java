package java3_project;

import java.util.Scanner;
public class Number {

	

		public static void main(String[] args) {
			Scanner sc =new Scanner (System. in); //��ü ����
			
		System.out.println("�� ������ �Է��Ͻÿ�");
		int num1=sc.nextInt(); //���� Ÿ������ �д´�
		int num2=sc.nextInt();


		System.out.println("���� ���: "+(num1+num2));
		System.out.println("���� ���: "+(num1-num2));
		System.out.println("���� ���: "+(num1*num2));
		System.out.println("������ ���: "+(num1/num2));
		System.out.println("������: "+(num1%num2));
		
	}

}
