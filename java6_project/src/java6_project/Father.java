package java6_project;


	class Father { //����Ŭ���� ����
		 void show(String str) { //���� �޼ҵ� ����
		 System.out.println("show(String str) ���� " + str);
	}
		 }
		 class Son extends Father { //���� Ŭ���� ����
		 void show() { //���� �޼ҵ� ����
		 System.out.println("����Ŭ������ �޼ҵ� show() ����");
	     }
	}
		
	class OverridingEx2 {
	  public static void main(String args[]) {
		System.out.println("-->Overriding �޼ҵ� ��� �ǽ�(2)<--");
		
		Son over = new Son(); //��ü ����
		over.show("���� Ŭ���� ȣ��");
		over.show();
		System.out.println();
		}
	}
