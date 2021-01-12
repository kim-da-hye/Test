package java8_project;

public class MyPoint { //Ŭ����  mypoint ����
	private int x, y;
	
	public MyPoint(int x, int y) { //�μ��� �ִ� ������ ����
		this.x = x;
		this.y = y;
	}
	
	public String toString() { // toString() �̿�
		
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object p) { //equals()���
		MyPoint po = (MyPoint)p;
		if(x == po.x && y == po.y)
			return true; 
		else
			return false;
	}
	public static void main(String [] args) {
		MyPoint p = new MyPoint(3, 50); //�μ��� �ִ� ��ü ����
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p); //p ���
		if(p.equals(q)) // equal()�̿�
			System.out.println("���� ��");
		else //�׷��� ������
			System.out.println("�ٸ� ��");			
	}
}
