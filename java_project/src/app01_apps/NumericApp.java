//console app: 사칙연산
//정수2개를 입력 받아서 사칙연산을 수행한후 그 결과를 출력하는 프로그램
package app01_apps;

import java.util.Scanner;

public class NumericApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System. in); //객체 선언
		
	System.out.println("두 정수를 입력하시오");
	int num1=sc.nextInt(); //정수 타입으로 읽는다
	int num2=sc.nextInt();


	System.out.println("덧셈 결과: "+(num1+num2));
	System.out.println("뺄셈 결과: "+(num1-num2));
	System.out.println("곱셉 결과: "+(num1*num2));
	System.out.println("나눗셈 결과: "+(num1/num2));
	System.out.println("나머지: "+(num1%num2));
	}
}
