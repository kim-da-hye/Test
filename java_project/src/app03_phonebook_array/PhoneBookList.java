package app03_phonebook_array;

import java.util.Scanner;

public class PhoneBookList {
	//�������
	PhoneBook[] phoneList;
	final int MAX=10;
	int count=0;
	
	//������
	PhoneBookList(){
	phoneList=new PhoneBook[MAX];
	phoneList[count++]=new PhoneBook("kim","01035623984");
	phoneList[count++]=new PhoneBook("da","01035723978");
	phoneList[count++]=new PhoneBook("hye","01044623454");
	phoneList[count++]=new PhoneBook("kim dahye","01074623984");
	}
	
	 void addPhoneBook() {
		Scanner sc =new Scanner (System. in);
		System.out.println("�̸��� �Է��ϼ���");
	    String name=sc.nextLine();
	    System.out.println("��ȣ�� �Է��ϼ���");
	    String number=sc.nextLine();
	    PhoneBook pb=new PhoneBook(name,number);
	    phoneList[count++]=pb;
		
		
	}
	void printPhoneBook() {
		for(int i=0; i<count;i++) {
			System.out.println(i +" ");
			phoneList[i].info();
			
		}
	}
	void delPhoneBook() {
		Scanner sc =new Scanner (System. in);
		System.out.println("����� ���� �ε����� �Է��ϼ���");
		int num=Integer.parseInt(sc.nextLine());
		if(num>=count) {
			System.out.println("��ȣ�� �������� �ʽ��ϴ�");
			
		}else {
			for(int i=num; i<count-1;i++) {
				phoneList[i]=phoneList[i+1];
			}
			count--;
		}
		
	}
}
