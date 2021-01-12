//������ ����:��������(global)�� ��������(local)
//��������: Ŭ�����ȿ��� ��𼭳� ���.�������
//��������� ����:
//1. �ν��Ͻ� ����:�ν��Ͻ� ������ ����. �� �ν��Ͻ����� �����ϴ� ����
//2. static����:Ŭ���� ������ ���� Ŭ������ �ϳ� �����ϴ� ����

//��������:�޼���(�Լ�)�ȿ� ����� ����. �޼���ȿ����� ���. 
//�ڵ� �ʱ�ȭ�� ���� �����Ƿ� ��������� �ʱ�ȭ �ؾ���.

//���� ������� �޼���� Ŭ���� �޼���� �ν��Ͻ� �޼��尡 ����

package lec05_class;

//Ŭ���� ����
class Customer{
	//Ŭ���� ����:��� �ν��Ͻ��� �����ϴ� ����
	//static�� �ٿ��ָ�� �ν��Ͻ� ���� ��밡�� Ŭ���������� ����
	static int amountTotal;
	
	//�ν��Ͻ� ���� �ν��Ͻ� ���� ������ ������ ���� �ν��Ͻ������θ� ���� ����
	int amount;
	
	//Ŭ���� �޼���(�ν��Ͻ� ���� ��밡��)
	static void currentAmount() {
		System.out.println("�����Ȳ"+ amountTotal);
	}
	//�ν��Ͻ� �޼���
	void buy(int price) {
		//amount�� ��� �����̹Ƿ� �۷ι� ����. ���� Ŭ���� ������ �ƹ������� ȣ�� ����
		//price�� ���������̹Ƿ�buy()�Լ��������� ���
		int a=3;//a�� ��������buy()�Լ��������� ���
		amount +=price;
		amountTotal +=price;
	}
	//�ν��Ͻ� �޼���
	void info() {
		System.out.println("���ž���"+ amount);
	}
}

public class Statics {

	public static void main(String[] args) {
		//�ν��Ͻ� �������� ������ �� �ִ� ����, �޼���
		//Ŭ���� ����, Ŭ���� �޼���
		Customer.currentAmount();
		System.out.println(Customer.amountTotal);
		
		//�ν��Ͻ� ������ �ν��Ͻ� �޼���� �����ؾ� ���� ����
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		
		
		System.out.println(customer1.amount);
		System.out.println(customer1.amountTotal);//�����̸����� �����ص� ������ ������ ����
	    customer1.buy(5000);
	    customer1.info();
	    Customer.currentAmount();
	    
	    customer2.buy(3000);
	    customer2.info();
	    Customer.currentAmount();
	}

}
