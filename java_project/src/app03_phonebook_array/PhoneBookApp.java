//PhoneBook Menu
//1.PhoneBook 입력
//2.PhoneBook 출력
//3.PhoneBook 삭제
//3.프로그램 종료

package app03_phonebook_array;

import java.util.Scanner;

public class PhoneBookApp {
	//멤버변수
	
   //static:프로그래 실행과 함께 항상 메모리에 올라가 있어야함
	public static void main(String[] args) {
		PhoneBookList pbList=new PhoneBookList();
		
			while(true) {
			//로컬변수:sc
			Scanner sc =new Scanner (System. in);
			System.out.println("1.입력 2.출력 3.삭제 9.종료");
			System.out.println("원하는 메뉴를 선택하세요");
			int menu=Integer.parseInt(sc.nextLine());
			if(menu==9)break;
			switch(menu) {
			case 1: //입력
				pbList.addPhoneBook();
				pbList.printPhoneBook();
			break;
			case 2: //출력
				pbList.printPhoneBook();
			case 3: //삭제
				pbList.delPhoneBook();
				pbList.printPhoneBook();
			break; 
			}
			
		}System.out.println("프로그램 종료합니다.");
	}

}
