package java6_project;


class SuperObj { //����Ŭ���� ����
		 int x = 5;
		 public void dispX() { //���� �޼ҵ� ����
			 System.out.println("\n���� Ŭ���� ");
			 System.out.println("x = " + x); // 5�� ǥ���Ѵ�.
		 } 
	}
		 class ThisObj extends SuperObj { // SuperObj�� ��� //����Ŭ���� ����
		 int x = 10;
		 public void dispX() { // �޼ҵ��� �������̵� //���� �޼ҵ� ����
		 int x = 20;
		 	System.out.println("���� Ŭ���� ");
		 	System.out.println("x = " + x); // 20�� ǥ���Ѵ�.
		 	System.out.println("this.x = " + this.x); // 10�� ǥ���Ѵ�.
		 super.dispX(); // ���� Ŭ������ �޼ҵ��� ȣ��
		 }
	 }
		 class OverridingEx3 {
		 public static void main(String args[]) {
			 System.out.println("-->Overriding �޼ҵ� ��� �ǽ�(3)<--");
			 
		 ThisObj obj = new ThisObj(); // ��ü ����
		 obj.dispX(); // ��ü�� �޼ҵ��� ȣ��
		 	System.out.println();
		 }
	}

