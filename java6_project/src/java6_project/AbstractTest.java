package java6_project;

abstract class AbstractTest{ //�߻�Ŭ���� ����
	public abstract void method1(); //�߻�޼ҵ� ����

	void method2() { //�Ϲ� �޼ҵ� ����
		System.out.println(" method2()�� ����");
 	}
 }

 class AbstractTest2 extends AbstractTest{
	 public void method1() { //���� Ŭ������ ����� ��� ����
		 System.out.println(" method1()�� ����");
 	}
 }
 class AbstractEx1 {
	 public static void main(String[] args) {
		 System.out.println("-->�߻�Ŭ���� ��� �ǽ�(2)<--");
		 
		 AbstractTest2 obj0 = new AbstractTest2(); //��ü ���� //�߻� �޼ҵ��� ���� ����
		 obj0.method1(); //�޼ҵ��� ȣ��
		 obj0.method2();
		 System.out.println();
   }
 }