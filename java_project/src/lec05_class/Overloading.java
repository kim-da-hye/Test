//�����ε�Overloading:�������� �Ϻ�
//�̸��� ���� �޼��带 ������ ����
//�׷���, �ŰԺ����� ������ Ÿ���� �޶����
//��, �ްԺ����ǰ����� Ÿ���� �ٸ��� �̸��� ���Ƶ� �ٸ� �޼���� �ν��Ѵٴ� �ǹ�

package lec05_class;

public class Overloading {
	//#1 �޼����� ����
	static void print_greeting(String name) {
		System.out.println("�ݰ����ϴ�."+name+"���� �����ϼ̽��ϴ�");
	}
	//#2�޼����� ����
	static void print_greeting(int id,String name) {
		System.out.println("�ݰ����ϴ�."+id+ name+"���� �����ϼ̽��ϴ�");
	
	}
	public static void main(String[] args) {
		//�޼��尡 ���� �����ε��� �ǹǷ�
		 print_greeting("���ڰź���");
		 print_greeting(195554643,"����� ������");

	}

}
