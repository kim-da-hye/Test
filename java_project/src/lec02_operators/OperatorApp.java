//������
//����: ���,����, ��,��,����Ʈ, ����, ����

package lec02_operators;

public class OperatorApp {

	public static void main(String[] args) {

	//��������� :+,-, *, /(������), % (������) 
//	System.out.println(10+3);
//	System.out.println(10-3);
//	System.out.println(10*3);
//	System.out.println(10/3);
//	System.out.println(10%3);
//		
//	//���������� :++,--
//	int count=0;
//	System.out.println(++count);//���� ������ ���ϱ� 1 
//	System.out.println(count++);//���� ������ ���ϱ� 1
//	System.out.println(--count);//���� ������ ����  1
//	System.out.println(count--);//���� ������ ���� 1
//		
//	//�񱳿����� :==, !=, <, >, <=, >= ����� true /false
//	System.out.println(1==2); //==:������ true 
//	System.out.println(1!=2); //==:�ٸ��� true 
//	System.out.println(1<2); //< :������  true 
//	System.out.println(1>=2); 
//		
	//��������: &&, ||, ! 
	boolean flag = true;
	System.out.println(!flag); //! :not ����
	System.out.println(!flag && flag ); //&& : and :�Ѵ� ���϶��� ��.
	System.out.println(!flag || flag ); //|| : or : �Ѵٰ����϶��� ����
	
	//���Կ�����  = += -= *= /= %=
	int num=10;
	System.out.println(num+=5); //num = num+5
	num +=5;		
	System.out.println(num);

	//���ڿ��� ���� : ����
	System.out.println("�ڸ���"+"it��ī����");
	System.out.println("�ڸ���"+"it��ī����"+num);
//	System.out.println("�ڸ���"+"it��ī����", num);ERROR 
	
	//��Ʈ ������ : &,|, ~, ^ 
	//���� ������ :if������ ���� �Ǵ�
	boolean result=17>10? true : false;
	System.out.println(result);
	
//	���� ����
	result= 17>10;
	System.out.println(result);
	
//	max�����ϴ»��׿�����
//	3�׿������� ����
//	���ǽ�? ���϶��� ���๮ : �����϶��� ���๮
	int a=1;
	int b=10;
	int max= a>b? a : b;
	System.out.println("�ִ밪�� "+max+"�Դϴ�");
	
	
	
		
	}

}
