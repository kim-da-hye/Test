//ScannerŬ����: �Է� ���
//File, Inputstream(Ű����), String, Readable ��� ���� �����͸� �о��
package lec12_utilpackage;

import java.util.Scanner;

public class ScannerNumbers {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System. in);	
	
	//int(����)�� �Է¹��� ���
	System.out.println("������ �Է¹�������");
	int score=sc.nextInt();
	System.out.println(score+"�� �ԷµǾ����ϴ�");
	
	//double�� �Է¹��� ���
	System.out.println("�������� �Է��ϼ���");
	double pi=sc.nextDouble();
	System.out.println(pi+"�� �ԷµǾ����ϴ�");
	
	
	}

}
