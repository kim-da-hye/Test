package lec12_utilpackage;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System. in); //keyboard ���� �ްڴٴ� �ǹ�
		//���ڿ� �Է¹��� ���: ������ü(��������):nextLine()
		System.out.println("�̸��� �Է¹�������");
		String name=sc.nextLine();
		System.out.println(name+"�� �ԷµǾ����ϴ�");
		
		//���ڿ� �Է¹��� ���: ���� ����������:next()
		System.out.println("�̸��� �Է��ϼ���");
		name=sc.next();
		System.out.println(name+"�� �ԷµǾ����ϴ�");
		
	}

}
