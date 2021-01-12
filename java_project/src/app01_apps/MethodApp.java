//전화번호 하나를 입력받는 프로그램을 작성하고자 한다.
//메인 메뉴를 출력하고 사용자가 메뉴를 선택했을때 그 기능을 수행하는 프로그램을 작성하세요.
//각각의 기능은 main에서 하지말고 모두 method로 구현하세요.

package app01_apps;

import java.util.Scanner;

public class MethodApp {
	static String read_number() {
		Scanner sc =new Scanner (System. in);
		String phonebookNumber=sc.nextLine();
		return phonebookNumber;
	}

	static void print_number(String phonebookNumber) {
		System.out.println(phonebookNumber);
	}
	public static void main(String[] args) {
		int input=0;
		Scanner sc =new Scanner (System. in);
		String phonebookNum="";
		while(true) {
			System.out.println("1.입력2.출력9.프로그램 종료");
			input=sc.nextInt();
			if(input==9)break;
			switch(input) {
			case 1:
				phonebookNum=read_number();
				break;
			case 2:
				print_number(phonebookNum);
				break;
				default :
				System.out.println("메뉴를 다시 선택하세요");
				break;
			}
		}System.out.println("프로그램을 종료합니다");
	}

}
