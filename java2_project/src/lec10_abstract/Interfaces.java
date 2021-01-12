//�������̽�:��ü�� ��ȣ�ۿ��� ���� ������ �Ծ�
//Ŭ������ ��ü ���赵��� �������̽��� Ŭ������ ���赵
//����
//1.�߻�޼���
//2.���(final)�θ� ����
//3.����: ������� ����.

//�������̽��� Ư¡:
//1.�ڽ�Ŭ������ ��ӹ޾Ƽ� �߻�޼��带 �������̵��ؾ� ��.
//2.�ߺ������ ����(Ŭ������ ���� ��Ӹ� ��)

//�������̽��� �뵵
//1.Ŭ������ �������̽� ������ ���ÿ� �����Ҽ� �������� ���߽ð��� ����
//2.Ŭ�������� �������� ���α׷��� ����. Ŭ������ Ŭ������ �������̽��� ����

package lec10_abstract;

interface Zoomable{
	//��� �����
	//final����� ������ public static���� ��.
	public static final int RATE=2;
	int INITAL=1;
	
	//�߻�޼���
	//������ public abstract�̾�� ��. �Ⱥ��̸� �����Ϸ��� �ٿ���
	public abstract void zoomin();
	void zoomout();
}

class Rectangle implements Zoomable{
    int x1,y1,x2,y2;
    //������
    Rectangle(){
    	x1=INITAL;
    	y1=INITAL;
    	x2=INITAL;
    	y2=INITAL;
    }
    //�������̵�
	@Override
	public void zoomin() {
		x1*= RATE;
		y1*= RATE;
		x2*= RATE;
		y2*= RATE;
	}

	@Override
	public void zoomout() {}
	
}

class Circle implements Zoomable{
	int x1,y1,r;
	//������
	Circle(){
		x1=INITAL;
		y1=INITAL;
		r=INITAL;
	}
	//�������̵�
	@Override
	public void zoomin() {
		x1*= RATE;
		y1*= RATE;
		r*= RATE;
	}

	@Override
	public void zoomout() {}
	
}
public class Interfaces {
	public static void main(String[] args) {
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
		
		Zoomable zoom1=circle;
		Zoomable zoom2=new Circle();
		Zoomable zoom3=new Rectangle();
		
		
		zoomin(circle);
		zoomin(rectangle);
		
		
	}

	//interface ������ �����Ͽ� �ڽ��� ��ü�� ��´�. ������
	static void zoomin(Zoomable zoom) {
		zoom.zoomin();
	}

}
