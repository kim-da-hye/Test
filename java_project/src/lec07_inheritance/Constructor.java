//��Ӱ� Ŭ����
//�����Ϸ� �۵����� ���ؿ� �⺻������
//�ڼ�Ŭ������ ������ �۾��� �� �� �θ�Ŭ������ �����ڵ� ȣ���������
//�ڼ� Ŭ���� �����ڰ� �θ�Ŭ������ �����ڸ� �θ����ʴ� ��� �����Ϸ��� �ڵ����� ������
//���ο� super()�� �߰��ϴµ�,�̶�
//�θ�Ŭ������ �⺻�����ڰ� ���� ��� ���� �߻�
//���� �����ڸ� ����� ��� �ݵ�� �⺻�����ڸ� ����� �����

package lec07_inheritance;
//product �θ� Ŭ����
class Product{
	
	int serialNumber;
	//������ ����
	//�����ڸ� �ƿ� �ƹ��͵� �ȸ���� ��� �����Ϸ���default�����ڸ� �������
	Product(){}//�⺻ �����ڸ� ����� ���� ���� �ذ�
	Product(int num){
		serialNumber=num;
	}
	}

//Phone �ڽ� Ŭ����
class Phone extends Product{
	String model;
	int price;
	String color;
	//������ ����
	//���� �������� ������, �θ� �⺻ �����ڸ� �θ������� 
	//���� �θ𿡰� �⺻ �����ڰ� ���� ��� �������� 
	Phone(){}
	Phone(String model,int price,String color){
		this.model=model;
		this.price=price;
		this.color=color;
	}
}
public class Constructor {

	public static void main(String[] args) {
      Phone phone=new Phone("Samsung",100,"gray");
	

}
}
