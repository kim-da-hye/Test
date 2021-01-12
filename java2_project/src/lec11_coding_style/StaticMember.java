//��������� ũ�� ��������� �ν��Ͻ��� ����� ������.
//����޼���
//1. �����޼���
//	1)static�� �ٿ�����
//	2)�������(����/�޼���)�� JVM�� Ŭ������ load�ϴ� ������ �޸𸮰� ����(������)
//	3)���ٹ��: Ŭ������.���
//2. �ν��Ͻ��� �޼���
//	1)�ν��Ͻ������ JVM�� �����������Ҷ� �޸𸮰� �����ȴ�.(�����)
//  2)���ٹ��: �ν��Ͻ��� ����.���(��ü��������(=�ν��Ͻ��� ����) ���ٰ���
package lec11_coding_style;
class staticClass{
	
	//�ν��Ͻ��� ����
	int instanceVar;
	//��������
	static int staticVar;
	//�ν��Ͻ��� �޼���
	void instanceMethod() {
		instanceVar=10;
		staticVar=30;
		staticMethod();
	}
	static void print() {
		System.out.println("print");
	}
	//���� �޼���
	static void staticMethod() {
		//instanceVar=30;//�����޼��尡 ȣ��ɋ� �ν��Ͻ� ������ �����Ƿ� �����߻�
		staticVar=40;
		//instanceMethod();//�����޼��尡 ȣ��ɋ� �ν��Ͻ� �޼��尡 �����Ƿ� �����߻�
		
		//static method�� ȣ���
		print();
		
	}
}

public class StaticMember {

	public static void main(String[] args) {
		//static ���ȣ��
		staticClass.staticVar=20;
		staticClass.print();
		staticClass.staticMethod();
		
		//�ν��Ͻ���� ȣ�� �Ұ���. ��ü�����������(��ü=instance)
		staticClass sc=new staticClass();
		sc.instanceVar=100;
		sc.instanceMethod();
		sc.print();//warning:static member�� instance�� ���ؼ� �θ��� ���. class�̸����� �����ؾ� ���� �����.
	}

}
