//OOP�� Ư¡(�߻�ȭ,����ȭ,������,���)
//���� Encapsulation
//ĸ��ȭ: ��������� Ŭ���� �ܺο��� �����Ҽ� ������ private���� ����
//��������� ���� �� �� �ִ� setter/getter�� ����� �ָ� ��.

package lec08_polymorphism;

import java.util.ArrayList;


//User
class User{
//id,nickname,email
	private String id;
	private String nickname;
	private String email;
	
	User (){}
	
	User(String id, String nickname, String email) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.email = email;
	}

	String getId() {
		return id;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	String getNickname() {
		return nickname;
	}
	
	void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	String getEmail() {
		return email;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		//user2���� �����(User class type�� ��ü�� 2�� �����)
		User user1=new User("gogo","kim","kds7767@naver.com");
		User user2=new User("back","da","stari1312@naver.com");
		//����id�� email�� �о ���
		System.out.println(user1.getId());
		System.out.println(user1.getEmail());
		
		//ArrayList�� �ְ� ����� �ϼ���.id,e-mail��
		ArrayList<User> userList= new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		
		//����for��
		for(User u:userList) {
			System.out.println(u.getId());
			System.out.println(u.getEmail());
		}
}


}
