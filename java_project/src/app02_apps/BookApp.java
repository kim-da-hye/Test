//Book�̶�� Ŭ���� ����
//�������:title,price,category
//����Լ�:register(),info()
package app02_apps;

class Book1{
	String title;
	int price;
	String category;
	
	void register(String title,int price,String category) {
		//��������� ���Ҷ�this�� ����
		this.title=title;
		this.price=price;
		this.category=category;
		
	}
	void info() {
		System.out.println("title:  "+title);
		System.out.println("price:  "+price);
		System.out.println("catagory:  "+category);
	}
}


public class BookApp {

	public static void main(String[] args) {
		Book1 book=new Book1();
		book.register("�ڹ��� ����",30000,"IT");
		book.info();

	}

}
