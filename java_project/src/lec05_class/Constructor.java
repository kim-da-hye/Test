//������constructor:�ν��ͽ��� �����Ҷ� �ڵ����� ȣ�ٵǴ� �޼���
//����:���Ͱ��� ���� ����Ÿ�Ե� ���� Ŭ�����̸��� ���ƾ��� ��ȯŸ���� �ٿ���������
//�޼����� �����̹Ƿ� �����ε� ���� �� ���� �̸����� ���� �����ڰ���
//����:����� �����ڸ� ����� ��� �⺻ �����ڸ� �� ����� �ٰ�
package lec05_class;

class Phone{
	//�ʱⰪ�� �����ʴ� ��� �⺻������ �ڵ����� �ʱ�ȭ�� ��
	String model;
	int price=0;
	String color="����";
	
	//�⺻������
	//���α׷��Ӱ� �����ڸ� ������ �ʴ� ��� �����Ϸ��� �ڵ����� �߰�����
	//���α׷��Ӱ�(����) �����ڸ� ����� ��� �����Ϸ��� �ڵ����� �߰�����������
	//��������� �߰������ ���� ����
	Phone(){
		
	}
	Phone(String model,int price){
		this.model=model;
		this.price=price;
	}
	Phone(String model,int price,String color){
		this.model=model;
		this.price=price;
		this.color=color;
	}
	void info() {
		System.out.println("��:"+model);
		System.out.println("����:"+price);
		System.out.println("����:"+color);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		Phone phone1=new Phone();//�⺻ ������
		Phone phone2=new Phone("iphone6",90);
		Phone phone3=new Phone("galaxy-note",110,"silver");
		phone1.info();
		phone2.info();
		phone3.info();
	}

}
