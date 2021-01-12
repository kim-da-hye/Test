package java6_project;

import java.util.Scanner;

interface Caculator { //인터페이스 슈퍼 클래스의 선언
	 int add(int a, int b);
	 int subtract(int a, int b);
	 void for_gugu(int a);
 }

class CalculatorSet implements Caculator { //인터페이스를 선언 클래스에 상속
	public int add(int a, int b) { //메소드에 대한 구현
		return a+b;
 }

	public int subtract(int a, int b) { //메소드에 대한 구현
		return a-b;
 }
	public void for_gugu(int a) { //메소드에 대한 구현
		for(int i=1; i<10; i++ ) {
			System.out.println(a + " x " + i + " = " + a*i);
		}
	}
 }
class InterfaceEx5 {
	public static void main(String[] args){
		System.out.println("-->인터페이스를이용한데이터처리사용실습<--");
		
		Scanner sc = new Scanner(System.in); //입력 scanner 객체 선언
		int menu_choice=0;
		System.out.println("메뉴 : 1.덧셈 2.뺄셈"); //입력 데이터의 처리
		System.out.print("메뉴 선택 : ");
		menu_choice = sc.nextInt();
		int x=0, y=0;
		CalculatorSet cal = new CalculatorSet();  //객체 선언

		if(menu_choice == 1) { //if문으로 입력 데이터에 대한 문장 처리
			System.out.print("두 수 입력 : ");
			x = sc.nextInt();
			y = sc. nextInt();
			System.out.println("결과값 : " + cal.add(x, y));
			cal.for_gugu(cal.add(x, y));
		}
		else if(menu_choice == 2) { //만약 1이 아니고 2번이라면
			System.out.print("두 수 입력 : ");
			x = sc.nextInt();
			y = sc. nextInt();
			System.out.println("결과값 : " + cal.subtract(x, y));
			cal.for_gugu(cal.subtract(x, y));
		}
		else { //1번과 2번도 아니면 
			System.out.println("메뉴가 없습니다.");
		}
		System.out.println();
	}
 }