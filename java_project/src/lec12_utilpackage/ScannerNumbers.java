//Scanner클래스: 입력 기능
//File, Inputstream(키보드), String, Readable 등에서 문자 데이터를 읽어옴
package lec12_utilpackage;

import java.util.Scanner;

public class ScannerNumbers {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System. in);	
	
	//int(정수)를 입력받은 경우
	System.out.println("정수을 입력받으세요");
	int score=sc.nextInt();
	System.out.println(score+"이 입력되었습니다");
	
	//double을 입력받은 경우
	System.out.println("원주율을 입력하세요");
	double pi=sc.nextDouble();
	System.out.println(pi+"가 입력되었습니다");
	
	
	}

}
