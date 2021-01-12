package java6_project;

abstract class Figure {// �߻� �޼ҵ�� Ŭ������ ��� //�߻� ���� Ŭ������ ����
	double dim1;
	double dim2;
	Figure(double a, double b) { //������ ����
		dim1 = a;
		dim2 = b;
 }
	abstract double area(); // area �߻� �޼ҵ� ����
 }

class Rectangle extends Figure { //ù ��° ���� Ŭ������ ����� ���
	Rectangle(double a, double b) { //������ ����
		super(a, b);
 }
 // �簢�� area�� override
 double area() {
	 System.out.println("�簢���� ���� area");
	 return dim1 * dim2;
 	}
 }

class Triangle extends Figure { //�� ��° ���� Ŭ������ ����� ���
	Triangle(double a, double b) { //������ ����
		super(a, b); //���� �޼ҵ��� ȣ��

	}
 // �ﰢ�� area�� override
	double area() { //�߻� �޼ҵ��� ����
		System.out.println("�ﰢ���� ���� area");
		return dim1 * dim2 / 2;

	}
}
 class AbstractEx4 {
	 public static void main(String args[]) {
		 System.out.println("-->�߻�Ŭ���� ��� �ǽ�(4)<--");
		
		 // Figure f = new Figure(10, 10); ������ ����
		 Rectangle r = new Rectangle(9, 5); //Rectangle Ŭ������ ��ü ����
		 Triangle t = new Triangle(10, 8);  //Triangle Ŭ������ ��ü ����
		 Figure figref; // ��ü�� ���� �ȵǸ� ����
		 figref = r;
		 System.out.println("Area = " + figref.area()); //area�޼ҵ��� ȣ��
		 figref = t;
		 System.out.println("Area = " + figref.area()); //area�޼ҵ��� ȣ��
		 System.out.println();

	 }
}
