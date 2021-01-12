//PhoneBook추상화
//속성(멤버변수)
//1.이름
//2.전화번호

package app03_phonebook_array;

public class PhoneBook {
	//멤버 변수
	String name;
	String number;
	
	//생성자
	//기본 생성자
	
	PhoneBook(){}
	//오버로딩(다형성)
	PhoneBook(String name,String number){
		this.name=name;
		this.number=number;
	}
	void info() {
		System.out.println("name:"+name+"number:"+number);
	}
}
