//�������̵� Overriding:�ڼ�Ŭ������ �θ�κ��� �������� �޼��鸣 ������ �ϴ°�(����)
package lec07_inheritance;

//�θ�Ŭ����
class User{
	String id;
	boolean registered;
	User(){}
	
	void registered(String myId) {
		id=myId;
		registered=true;
	}
	void info() {
		System.out.println("id:"+id+ " registered: " +registered);
	}
}

//�ڽ� Ŭ����
class Vip extends User{
	String name;
	Vip(){}
	Vip(String myId,String name){
		id=myId;
		this.name=name;
		registered=true;
		
	}

//�������̵�: �޼����� �̸��� ���� ��츦 ����
void info() {
	System.out.println("_______________");
	System.out.println("VIP name: "+name);
	System.out.println("Id: "+id);
	System.out.println("registered: "+registered);
	}
}
public class Overriding {

	public static void main(String[] args) {
      //��ü ����
		User user=new User();
		Vip vip=new Vip("bigShopper","�����");
		user.registered("normal");
		user.info();
		vip.info();
		
		
	}

}
