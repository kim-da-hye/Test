//collection framework에서 hashcode()와 equals()를 override해야하는 이유
//hashcode()의원래기능:두 객체가 같은 객체인지,동일성(identity)을 비교하기 위하여 사용하는메서드 (주소like)
//equals():원래기능:두 객체의 내용이 같은지 동등성(equality)을 비교하기위하여사용하는 메서드

//hashcode()overrider: class에 내용(key)을 가지고 hashcode(엄청 긴 숫자)를 계산.
//hashcode가 다르면 내용이 다름.  내용이 달라도 hashcode가 같을때도 있음.
//key a,b,c-> hashcode: 123123,234234,123123
//중복을 체크하는 절차
//1. hashcode() 값이 같으면 equals()호출
//   1.1 equals()호출하여 값이 같으면 동일
//	 1.2 equals()호출하여 다르면 내용이 다른걸로 결론.
//2. hashcode()가 다르면 내용이 다른걸로 결론(equals() 호출 안함)

package lec12_collection;

import java.util.HashSet;

class Book{
	int price;
	String title;
	Book(){}
	Book(int price,String title){
		this.price=price;
		this.title=title;
	}
	public String toString() {
		return String.format("%6d,%10s", price,title);
	}
}
class Book2{
	int price;
	String title;
	Book2(){}
	Book2(int price,String title){
		this.price=price;
		this.title=title;
	}
	public String toString() {
		return String.format("%6d,%10s", price,title);
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book2 other = (Book2) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}

public class SetOverride {

	public static void main(String[] args) {
		//Book은 toString()만 override했음
		HashSet<Book> bookSet=new HashSet<>();
		bookSet.add(new Book(10000,"COSMOS"));
		bookSet.add(new Book(10000,"History"));
		bookSet.add(new Book(10000,"COSMOS")); //set은 중복이 안되므로 set안에서 중복체크한 뒤 중복이 안되는 경우 추가
		System.out.println(bookSet);
		
		//Book2는 Equals()와 hashcode()override했음
		HashSet<Book2> bookSet2=new HashSet<>();
		bookSet2.add(new Book2(10000,"COSMOS"));
		bookSet2.add(new Book2(10000,"History"));
		bookSet2.add(new Book2(10000,"COSMOS")); //set은 중복이 안되므로 set안에서 중복체크한 뒤 중복이 안되는 경우 추가
		System.out.println(bookSet2);
	}

}
