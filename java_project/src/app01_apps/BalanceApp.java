//üũī�� ��� ���α׷�
//���忡 �ܰ� 10000�� �ִ�.(���� �뵷)
//1. ���� �����ҷ��� �ݾ� �Է¹޴´�.
//2. �ݾ��� �ܰ��� ũ�� ������ �ȵǰ� �ܰ�װ� �Բ� "�ܰ� �����Ͽ� ������ �Ұ����մϴ�"�� ���
//3. �ݾ��� �ܰ��� ������ ������ �ǰ� �ܰ�׸� ���
//4. �ܰ� 0�̸� �ܾ��� 0���� �˷��ְ� ���α׷� ���� 

package app01_apps;

import java.util.Scanner;

public class BalanceApp {

	public static void main(String[] args) {
		int balance=10000;
		int check=0;
		Scanner sc =new Scanner (System. in);
		System.out.println("���� ���� �ܰ�� "+balance+"�Դϴ�");
		while(true) {
			//1. ������ �ݾ��� �Է¹޴´�
			System.out.println("������ �ݾ��� �Է��ϼ���");
			check=sc.nextInt();
			//2. �ݾ�>�ܰ��̸�
			if(balance-check<0) {
				System.out.println("�ܾ��� �����Ͽ� ������ �ȵ˴ϴ�");
				System.out.println("���� ���� �ܰ�� "+balance+"�Դϴ�");
			}else if(balance-check>0) {//3. �ݾ��� �ܰ��� ������ ������ �ǰ� �ܰ�׸� ���	
				balance-=check;
				System.out.println("���� ���� �ܰ�� "+balance+"�Դϴ�");
			}else{//4. �ܰ� 0�̸� �ܾ��� 0���� �˷��ְ� ���α׷��� ����break
				//balance-check==0
				System.out.println("���� ���� �ܰ�� "+balance+"�Դϴ�");
				break;
			}
			
				
			
			}System.out.println("���α׷��� ����˴ϴ�");
		}
		

	}


