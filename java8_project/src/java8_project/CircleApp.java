package java8_project;
class Circle { 
	private int x, y, radius;
	public Circle(int x, int y, int radius) { 
		this.x = x;
		this.y = y;		
		this.radius = radius;		
	}
	public String toString() { //toString() ���
		return "Circle(" + x + "," + y + ")" + "������" + radius; 
	}
	public boolean equals(Object obj) { //equals() ���
		Circle b = (Circle)obj;
		if(x == b.x && y == b.y) 
			return true;
		else 
			return false;
	}	
}
public class CircleApp { 
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // �߽� (2,3)�� ������ 5�� ��
		Circle b = new Circle(2,3,30); // �߽� (2,3)�� ������ 30�� ��
		
		System.out.println("��a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b)) //equal() ���
			System.out.println("���� ��");
		else //�׷��� ������
			System.out.println("���� �ٸ� ��");
	}
}
