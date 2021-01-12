//학사관리 미니 프로젝트
//목표:Array List를 활용,접근지정자
//메뉴:1.등록 2.출력 3.삭제 9.종료

//문제 풀이 단계
//Step1: class 설계
//Step2: 메인메뉴를 설계
//Step3: 메뉴를 출력하고 사용자로부터 입력을 받는다. 입력값이 9이면 프로그램 종료
//Step4: 초기값을 주고 출력 메뉴를 구현
//Step5: 입력 메뉴를 구현
//Step6: 삭제 메뉴를 구현
package app04_school_collection;


import java.util.Scanner;

public class SchoolApp {
	

	static void printMenu() {
		System.out.println("메뉴: 1.등록 2.출력 3.삭제 9.종료");
	}
	static int getNumber(String message) {
		System.out.println(message);
		Scanner sc =new Scanner (System. in);
		int num=Integer.parseInt(sc.nextLine());
		
		return num;
	}
	

	public static void main(String[] args) {
		//list 객체 생성
		StudentList list=new StudentList();
		
		int menu=0;
		do {
			printMenu();//메뉴 출력
			menu=getNumber("번호를 입력하세요");
			if(menu==9)break;
			switch(menu) {
			case 1: //입력
				list.addList();
				break;
			case 2: //출력
				list.printList();
				break;
			case 3: //삭제
				list.deleteList();
				break;
			}
		}while(true);
		System.out.println("프로그램을 종료합니다");
	}

}
