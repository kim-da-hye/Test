//OOP의 특징(추상화,은닉화,다형성,상속)
//은닉 Encapsulation
//캡슝화: 멤버변수를 클래스 외부에서 접근할수 없도록 private으로 선언
//멤버변수를 접근 할 수 있는 setter/getter를 만들어 주면 됨.

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
		//user2명을 만들고(User class type의 객체를 2개 만들기)
		User user1=new User("gogo","kim","kds7767@naver.com");
		User user2=new User("back","da","stari1312@naver.com");
		//각각id의 email을 읽어서 출력
		System.out.println(user1.getId());
		System.out.println(user1.getEmail());
		
		//ArrayList에 넣고 출력을 하세요.id,e-mail만
		ArrayList<User> userList= new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		
		//향상된for문
		for(User u:userList) {
			System.out.println(u.getId());
			System.out.println(u.getEmail());
		}
}


}
