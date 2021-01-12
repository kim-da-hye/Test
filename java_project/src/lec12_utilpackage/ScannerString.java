package lec12_utilpackage;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System. in); //keyboard 에서 받겠다는 의미
		//문자열 입력받은 경우: 한줄전체(공백포함):nextLine()
		System.out.println("이름을 입력받으세요");
		String name=sc.nextLine();
		System.out.println(name+"이 입력되었습니다");
		
		//문자열 입력받은 경우: 공백 이전까지만:next()
		System.out.println("이름을 입력하세요");
		name=sc.next();
		System.out.println(name+"이 입력되었습니다");
		
	}

}
