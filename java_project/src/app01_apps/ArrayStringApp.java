//String�迭 �Է�.���
//����: ����ڷκ��� ��ȭ��ȣ�κ��� ����� �̸��� �������� �Է¹ް��� �Ѵ�
//1. ũ�Ⱑ 10��StringŸ���� �迭�� �����ϰ�
//2. ����ڿ��� �̸����� ������ ������ �Է¹޴´�.
//3. 10���� ū ��� ����ڿ��� 10�̳��� �Է��϶�� �޼����� ����ϰ� �ٽ� �Է¹޴´�.
//4. 10�� ���ų� �� ���� ��� �̸��� ����ڰ� ������ ������ŭ �Է¹޴´�.
//5. ����� ����� ��¹޴´�
package app01_apps;

import java.util.Scanner;

public class ArrayStringApp {
	static final int MAX=10; //final: ����� ���. ������ ��. ����� �ѱ������� ����.

	public static void main(String[] args) {
		String[] phonebookname=new String[MAX];
		Scanner sc =new Scanner (System. in);
		int count=0;
		//count�� �Է¹޴´�. ����ڰ� 10���� ū ���� �Է¹����� �ٽ� �Է¹޴´�.
		while(true) {
			System.out.println("������ ������ �Է��ϼ���");
			count=sc.nextInt();
			//count�� �Է¹ް� 10���� ������ Ż��
			if(count<MAX) {
				System.out.println(count+"�� �ԷµǾ����ϴ�");
			break;
	}
			//�ƴϸ� 10�̳��� �Է��϶�� �޼��� ���
			else {
				System.out.println("10�̳��� �Է��ϼ���");
			}	
		}
		sc.nextLine();//���ۿ���enter�Һ�
		
		//count������ŭ �̸��� �Է�for��
		for(int i=0;i<count;i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String name=sc.nextLine();
			phonebookname[i]=name;
		}
		//���for��
		System.out.println("��ȭ��ȣ�� �̸��� ������ �����ϴ�");
		for(int i=0;i<count;i++) {
			System.out.println(phonebookname[i]);
		}
		//���α׷��� ����Ǿ����� ���
		System.out.println("���α׷��� �����մϴ�");
		
	
		
		
	}

}
