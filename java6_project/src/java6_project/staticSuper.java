package java6_project;


	class staticSuper { //����Ŭ���� ����
		 static int i = 10; //static ���� ����
	   }
	 class OverridingEx4 extends staticSuper { //���� Ŭ���� ���� �� ���
	 static int i = 20; //static ���� ����
	 public static void main(String[] args) {
	 System.out.println("-->Overriding �޼ҵ� ��� �ǽ�(4)<--");
	 
	 System.out.println("i = " + i); //���� ���
	 System.out.println("����Ŭ���� i = " + staticSuper.i); //���� ���
	 System.out.println("����Ŭ���� i = " + OverridingEx4.i); //���� ���
	 System.out.println();
	 }
 }
