package java6_project;

import java.util.Scanner;

interface Caculator { //�������̽� ���� Ŭ������ ����
	 int add(int a, int b);
	 int subtract(int a, int b);
	 void for_gugu(int a);
 }

class CalculatorSet implements Caculator { //�������̽��� ���� Ŭ������ ���
	public int add(int a, int b) { //�޼ҵ忡 ���� ����
		return a+b;
 }

	public int subtract(int a, int b) { //�޼ҵ忡 ���� ����
		return a-b;
 }
	public void for_gugu(int a) { //�޼ҵ忡 ���� ����
		for(int i=1; i<10; i++ ) {
			System.out.println(a + " x " + i + " = " + a*i);
		}
	}
 }
class InterfaceEx5 {
	public static void main(String[] args){
		System.out.println("-->�������̽����̿��ѵ�����ó�����ǽ�<--");
		
		Scanner sc = new Scanner(System.in); //�Է� scanner ��ü ����
		int menu_choice=0;
		System.out.println("�޴� : 1.���� 2.����"); //�Է� �������� ó��
		System.out.print("�޴� ���� : ");
		menu_choice = sc.nextInt();
		int x=0, y=0;
		CalculatorSet cal = new CalculatorSet();  //��ü ����

		if(menu_choice == 1) { //if������ �Է� �����Ϳ� ���� ���� ó��
			System.out.print("�� �� �Է� : ");
			x = sc.nextInt();
			y = sc. nextInt();
			System.out.println("����� : " + cal.add(x, y));
			cal.for_gugu(cal.add(x, y));
		}
		else if(menu_choice == 2) { //���� 1�� �ƴϰ� 2���̶��
			System.out.print("�� �� �Է� : ");
			x = sc.nextInt();
			y = sc. nextInt();
			System.out.println("����� : " + cal.subtract(x, y));
			cal.for_gugu(cal.subtract(x, y));
		}
		else { //1���� 2���� �ƴϸ� 
			System.out.println("�޴��� �����ϴ�.");
		}
		System.out.println();
	}
 }