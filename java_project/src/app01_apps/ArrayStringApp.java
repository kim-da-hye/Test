//String배열 입력.출력
//문제: 사용자로부터 전화번호로부터 사용할 이름을 여러개를 입력받고자 한다
//1. 크기가 10인String타입의 배열을 선언하고
//2. 사용자에게 이름으로 저장할 갯수를 입력받는다.
//3. 10보다 큰 경우 사용자에게 10이내로 입력하라는 메세지를 출력하고 다시 입력받는다.
//4. 10과 같거나 더 작은 경우 이름을 사용자가 지정한 갯수만큼 입력받는다.
//5. 저장된 결과를 출력받는다
package app01_apps;

import java.util.Scanner;

public class ArrayStringApp {
	static final int MAX=10; //final: 상수로 사용. 조정된 값. 변경시 한군데서만 수정.

	public static void main(String[] args) {
		String[] phonebookname=new String[MAX];
		Scanner sc =new Scanner (System. in);
		int count=0;
		//count를 입력받는다. 사용자가 10보다 큰 값을 입력받으면 다시 입력받는다.
		while(true) {
			System.out.println("저장할 갯수를 입력하세요");
			count=sc.nextInt();
			//count를 입력받고 10보다 작으면 탈출
			if(count<MAX) {
				System.out.println(count+"가 입력되었습니다");
			break;
	}
			//아니면 10이내로 입력하라는 메세지 출력
			else {
				System.out.println("10이내로 입력하세요");
			}	
		}
		sc.nextLine();//버퍼에서enter소비
		
		//count갯수만큼 이름을 입력for문
		for(int i=0;i<count;i++) {
			System.out.println("이름을 입력하세요");
			String name=sc.nextLine();
			phonebookname[i]=name;
		}
		//출력for문
		System.out.println("전화번호부 이름은 다음과 같습니다");
		for(int i=0;i<count;i++) {
			System.out.println(phonebookname[i]);
		}
		//프로그램이 종료되었음을 출력
		System.out.println("프로그램을 종료합니다");
		
	
		
		
	}

}
