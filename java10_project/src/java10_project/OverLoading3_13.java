package java10_project;
class Father{
	void show(String str) {
		System.out.println("show(String str)����"+str);
	}
}

class Son extends Father{
	void show() {
		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
	}
}

public class OverLoading3_13{

	public static void main(String[] args) {
		Son over=new Son();
		over.show("���� Ŭ���� ȣ��");
		over.show();

	}

}
