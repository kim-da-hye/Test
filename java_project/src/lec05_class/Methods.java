//목표:메서드
//메서드란? 함수라고도 불리며 특정 작업 수행
//입력값을 받아서 내부에서 처리하기도 하고, 켤과를 출력하기도 하고, 반환하기도 함
package lec05_class;

import java.util.Scanner;

public class Methods {
	
	//메서드 정의
	//형식: 반환 파일 메서드 명(메게 변수 틀)
	//타입1: 메게변수가 있고 반환값이 있는 경우
	static int sum(int a,int b)//메게변수는,로 구분 parameter
	{
		return a+b;
	}
	//타입2:반환값이 없고 메게변수가 없는 경우
	//void:반환값이 없는 경우
	static void printhelp() {
		System.out.println("두 숫자의 합을 구하는 프로그램이다.");
	}
	//타입3:반환점이 없고 메게변수가 있는 경우
	static void printMessage(String message) {
		System.out.println(message);
	}
	//타입4:반환점이 있고 메게변수가 있는경우
	static int getNumber() {
		Scanner sc =new Scanner (System. in);
		System.out.println("정수를 입력하세요");
		int number=sc.nextInt();
		return number;
	}
	//메인도 메서드 중의 하나: 프로그램의 엔트리포인트(시작점)
	public static void main(String[] args) {
		//메서드 호출
		printhelp();
		int num1=getNumber();
		int num2=getNumber();
		int total=sum(num1,num2);
		String message="합은:"+ total;
		printMessage(message);

	}

}
