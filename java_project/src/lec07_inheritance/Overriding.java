//오버라이딩 Overriding:자손클래스가 부모로부터 물려받은 메서들르 재정의 하는것(변경)
package lec07_inheritance;

//부모클래스
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

//자식 클래스
class Vip extends User{
	String name;
	Vip(){}
	Vip(String myId,String name){
		id=myId;
		this.name=name;
		registered=true;
		
	}

//오버라이딩: 메서드의 이름이 같은 경우를 말함
void info() {
	System.out.println("_______________");
	System.out.println("VIP name: "+name);
	System.out.println("Id: "+id);
	System.out.println("registered: "+registered);
	}
}
public class Overriding {

	public static void main(String[] args) {
      //객체 생성
		User user=new User();
		Vip vip=new Vip("bigShopper","김다혜");
		user.registered("normal");
		user.info();
		vip.info();
		
		
	}

}
