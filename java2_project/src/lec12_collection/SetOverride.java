//collection framework���� hashcode()�� equals()�� override�ؾ��ϴ� ����
//hashcode()�ǿ������:�� ��ü�� ���� ��ü����,���ϼ�(identity)�� ���ϱ� ���Ͽ� ����ϴ¸޼��� (�ּ�like)
//equals():�������:�� ��ü�� ������ ������ ���(equality)�� ���ϱ����Ͽ�����ϴ� �޼���

//hashcode()overrider: class�� ����(key)�� ������ hashcode(��û �� ����)�� ���.
//hashcode�� �ٸ��� ������ �ٸ�.  ������ �޶� hashcode�� �������� ����.
//key a,b,c-> hashcode: 123123,234234,123123
//�ߺ��� üũ�ϴ� ����
//1. hashcode() ���� ������ equals()ȣ��
//   1.1 equals()ȣ���Ͽ� ���� ������ ����
//	 1.2 equals()ȣ���Ͽ� �ٸ��� ������ �ٸ��ɷ� ���.
//2. hashcode()�� �ٸ��� ������ �ٸ��ɷ� ���(equals() ȣ�� ����)

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
		//Book�� toString()�� override����
		HashSet<Book> bookSet=new HashSet<>();
		bookSet.add(new Book(10000,"COSMOS"));
		bookSet.add(new Book(10000,"History"));
		bookSet.add(new Book(10000,"COSMOS")); //set�� �ߺ��� �ȵǹǷ� set�ȿ��� �ߺ�üũ�� �� �ߺ��� �ȵǴ� ��� �߰�
		System.out.println(bookSet);
		
		//Book2�� Equals()�� hashcode()override����
		HashSet<Book2> bookSet2=new HashSet<>();
		bookSet2.add(new Book2(10000,"COSMOS"));
		bookSet2.add(new Book2(10000,"History"));
		bookSet2.add(new Book2(10000,"COSMOS")); //set�� �ߺ��� �ȵǹǷ� set�ȿ��� �ߺ�üũ�� �� �ߺ��� �ȵǴ� ��� �߰�
		System.out.println(bookSet2);
	}

}
