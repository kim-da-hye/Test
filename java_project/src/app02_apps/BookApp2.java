//#1
//������ڷκ��� title,price,category�� �Է�
//��ü�� ����
//������ ���
//#2
//ũ�Ⱑ 10���� book�迭�� ���� ����ڿ��� ������ �Է�
//������ŭ �Է¹޾�(title,price,category)
//������ŭ ���� ���
package app02_apps;

import java.util.Scanner;

class Book{
	String title;
	int price;
	String category;
	Book(){
		
	}
	Book(String title,int price,String category) {
		//��������� ���Ҷ� this�� ����
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
		//����count�� �Է¹޴´�.��Ʈ���� �Է¹޾Ƽ� int�� ��ȯ
		System.out.println("�Է��ϰ����ϴ� å�� ������ ���ϼ���.10�� ����");
		int count=Integer.parseInt(sc.nextLine());
		
		//�ݺ��ϸ鼭 �Է��� ����
		for(int i=0;i<count;i++) {
			System.out.println("å�̸��� �Է��ϼ���");
			String title=sc.nextLine();
			System.out.println("������ �Է��ϼ���");
			int price=Integer.parseInt(sc.nextLine());
			System.out.println("�о߸� �Է��ϼ���");
			String category=sc.nextLine();
			Book book=new Book(title,price,category);
			books[i]=book;
		}
		
		//�ݺ��ϸ鼭 ���
		for(int i=0;i<count;i++) {
			books[i].info();
		}
		
		
	}

}
