//#1
//사용자자로부터 title,price,category를 입력
//객체를 생성
//내용을 출력
//#2
//크기가 10개인 book배열을 만들어서 사용자에게 갯수를 입력
//갯수만큼 입력받아(title,price,category)
//갯수만큼 내용 출력
package app02_apps;

import java.util.Scanner;

class Book{
	String title;
	int price;
	String category;
	Book(){
		
	}
	Book(String title,int price,String category) {
		//멤버변수를 취할때 this로 구분
		this.title=title;
		this.price=price;
		this.category=category;
		
	}
	void info() {
		System.out.println("title: "+title);
		System.out.println("price: "+price);
		System.out.println("catagory: "+category);
	}
}


public class BookApp2 {

	public static void main(String[] args) {
		final int MAX=10;
		
		Scanner sc =new Scanner (System. in);
		Book[] books= new Book[MAX];
		//갯수count를 입력받는다.스트링을 입력받아서 int로 변환
		System.out.println("입력하고자하는 책의 갯수를 정하세요.10개 이하");
		int count=Integer.parseInt(sc.nextLine());
		
		//반복하면서 입력을 받음
		for(int i=0;i<count;i++) {
			System.out.println("책이름을 입력하세요");
			String title=sc.nextLine();
			System.out.println("가격을 입력하세요");
			int price=Integer.parseInt(sc.nextLine());
			System.out.println("분야를 입력하세요");
			String category=sc.nextLine();
			Book book=new Book(title,price,category);
			books[i]=book;
		}
		
		//반복하면서 출력
		for(int i=0;i<count;i++) {
			books[i].info();
		}
		
		
	}

}
