//��ü�������(OPP:Object Oriented Programming)
//Ư¡:1.�߻�ȭ(abstraction),2.ĸ��ȭ(encapsulation)=����
//3.���⼺(polymorphism),4.���(inheritance)
//��ü:Object��� �繰. �Ӽ�(���� property)�� ���(�޼��� method)���� �����Ǿ� �ִ�.
//Ŭ����class:��ü ���赵,��ü�� �߻�ȭ�Ѱ�,�ڷᱸ��
//�ν��Ͻ�Instance:Ŭ������ ���� �����Ȱ�, �޸𸮿� �Ҵ�� ����


//OPP�� Ư¡1 �߻�ȭ(Abstration)

//Ŭ������ ����: �����ϰ����ϴ� ��ü�� �Ӽ��� ����� �����ϴ� ���赵
//����ڰ� ������ ������Ÿ���̶�� �Ҹ���.

package lec05_class;

class User{
	//�Ӽ�:��� ���� (�ν��Ͻ� ����):��ü���� ������ �ִ� ������ �Ӽ�(����)
	//�ʱ�ȭ�� ���ϴ� ��쿡 �ڵ����� ����Ʈ�� �ʱ�ȭ ��.��Ʈ��:null
	String id;
	boolean registered=false;
	//���(�ൿ):����Լ�(�޼���)
	void register(String myId) {
		id=myId;
		registered=true;
	}
	void info() {
		System.out.println("id:"+id+"   ��Ͽ���: "+registered);
	}
}


public class ClassApp {

	public static void main(String[] args) {
		//Ŭ���� ����
		//Ŭ���� ������ ���� ����(String,�迭).�� ,�ּҸ� ��� ����
		User user1;
		
		//#2 Ŭ�����κ��� ��ü(�ν��Ͻ�)�� ���Ӱ� ���� �ν��Ͻ��� �ּҸ� ������ ��´�.
		user1=new User();
		
		//#3 Ŭ���� ���� ����� �ʱ�ȭ�� �ѹ���
		User user2=new User();
		
		//#4 �ν��Ͻ� ������ �����ϴ� ���
		System.out.println(user1.id);
		System.out.println(user1.registered);
		
		//#5 �ν����� ������ ���� ����
		user1.id="kim2020";
		user1.registered=true;
		
		System.out.println(user1.id);
		System.out.println(user1.registered);
		
		//#6 �޼���ȣ���ϴ� ���
		user2.register("korea_academy");
		user2.info();
		
		
		
		
	} 

}
