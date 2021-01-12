//사용자로부터 나이를 입력받은다.(정수)
//나이와 이름을 입력
//나이가 0이면 프로그램 종료
//계속 입력받는다.
package app01_apps;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {

		String name="";
		int age=0;
		Scanner sc =new Scanner (System. in);
		while(true) {
			//나이를 입력
			System.out.println("나이를 입력하세요.0을입력하면 프로그램이 종료됩니다");
			age=sc.nextInt();
			
			//나이가 0이면 반복문을 빠져나온다break
			if(age==0) break;
			
			//이름을 입력
			sc.nextLine();
			System.out.println("이름을 입력하세요");
			name=sc.nextLine();
			System.out.println("이름은"+name);
			System.out.println("나이는"+age);
			
		}
			System.out.println("프로그램을 종료합니다");

	}

}
