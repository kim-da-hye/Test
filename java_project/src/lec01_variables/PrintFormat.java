package lec01_variables;

public class PrintFormat {

	public static void main(String[] args) {
		//Escape Sequence(character):��½� Ư���� ��� ����
		//#1 �ٹٲ�
		System.out.println("Hello\nWorld");
		//#2 tap
		System.out.println("Hello\nWorld");
		
		//format string
		//%d: ������ (byte, int, short, long)
		//%f: �Ǽ��� (float, double)
		//%c: char �����ϳ�
		//%s: string ���ڿ�(���� 2�� ����)
		//%n newline
		System.out.printf("%d %f %n",10,10.2 );
		//�ڸ��� ����
		//%10d ��ü �ڸ��� 10�ڸ�
		//%10.2f ���������� 10�ڸ� �Ҽ��� ���� �ڸ���2
		System.out.printf("%10d %10.2f %n",100,10.2983);
		System.out.printf("%d %f %n",100,10.2983);
	}

}
