//����ڷκ��� ���̸� �Է¹�����.(����)
//���̿� �̸��� �Է�
//���̰� 0�̸� ���α׷� ����
//��� �Է¹޴´�.
package app01_apps;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {

		String name="";
		int age=0;
		Scanner sc =new Scanner (System. in);
		while(true) {
			//���̸� �Է�
			System.out.println("���̸� �Է��ϼ���.0���Է��ϸ� ���α׷��� ����˴ϴ�");
			age=sc.nextInt();
			
			//���̰� 0�̸� �ݺ����� �������´�break
			if(age==0) break;
			
			//�̸��� �Է�
			sc.nextLine();
			System.out.println("�̸��� �Է��ϼ���");
			name=sc.nextLine();
			System.out.println("�̸���"+name);
			System.out.println("���̴�"+age);
			
		}
			System.out.println("���α׷��� �����մϴ�");

	}

}
