package java6_project;

interface A { //ù��° �������̽� ���� Ŭ���� ����
	void amethod1();
	void amethod2();
 }

 interface B { //�ι�° �������̽� ���� Ŭ���� ����
	 void bmethod1();
 }

 interface C extends A, B { // �ΰ��� �������̽� ���
	 void cmethod1();
 }
class InterfaceClass implements C { //Ŭ������ ����� ���� ��� ����
	 public void amethod1() { //�޼ҵ忡 ���� ����
		 System.out.println("amethod1() �޼ҵ��� ����");
 }
public void amethod2() { //�޼ҵ忡 ���� ����
	 System.out.println("amethod2() �޼ҵ��� ����");
}
 public void bmethod1() { //�޼ҵ忡 ���� ����
	 System.out.println("bmethod1() �޼ҵ��� ����");
 }
public void cmethod1() { //�޼ҵ忡 ���� ����
	 System.out.println("cmethod1() �޼ҵ��� ����");
 	}
 }
class InterfaceEx3 {
	 public static void main(String arg[]) {
		 System.out.println("-->�������̽� ���� ��� ��� �ǽ�<--");
		 
		 InterfaceClass ic = new InterfaceClass(); //��ü ����
		 ic.amethod1();//�޼ҵ� ȣ��
		 ic.amethod2();
		 ic.bmethod1();
		 ic.cmethod1();
		 System.out.println();
	 }
 }
