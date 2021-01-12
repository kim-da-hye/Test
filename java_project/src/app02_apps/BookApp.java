//Book이라는 클래스 정의
//멤버변수:title,price,category
//멤버함수:register(),info()
package app02_apps;

class Book1{
	String title;
	int price;
	String category;
	
	void register(String title,int price,String category) {
		//멤버변수를 취할때this로 구분
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
		book.register("자바의 정석",30000,"IT");
		book.info();

	}

}
