//super��this����
//super:�θ��� instance(��ü)
//this:�ڱ� �ڽ��� instance(��ü)

package lec07_inheritance;

class Estate{
	int price;
	String address;
	void setPrice(int price) {
		this.price=price;
		//this.price:�������(�ν��Ͻ� ����),price=��������(�ŰԺ���)
	}
	//�����ε�:�ٸ� �޼���� �ν�:parameter�� �ٸ��Ƿ�
	void setPrice(int price,String address) {
		this.price=price;
		this.address=address;
	}
	
	void printInfo() {
		System.out.println("����: " +price);
		System.out.println("�ּ�: " +address);
	}
}
class House extends Estate{
	int floor;
	void setHouse(int floor,int price,String address){
		this.floor=floor;
		super.address=address; //super�� �θ� ��Ī�Ѵ�.
		setPrice(price);       //�θ��� �޼��带 �׳� �θ� �� �ִ�.
		 //super.setPrice(price); super�� ���ؼ� �θ� ���� �ִ�.
		
	}
	//�������̵�:�θ��� �޼��带 ������. �̸��� ����. parameter�� ����

void printInfo(){
	super.printInfo();//super�� �θ� ȣ��
	System.out.println(floor+"��");
	
	}
}

public class Super {

	public static void main(String[] args) {
		//��ü ���� ���� ����
		Estate estate= new Estate();
		House house=new House();
		house.setHouse(3, 1000, "�����");
		house.printInfo();
		
		//������� �޼����.���� ���� ����
		estate.setPrice(2000,"������");
		estate.printInfo();
		
		estate.setPrice(10000000);
		estate.address="��⵵";
		estate.printInfo();
		
		
		
	}

}
