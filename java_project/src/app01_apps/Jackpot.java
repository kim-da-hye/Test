// console app: Jackpot(777)
// Jackpot이 터질때까지 slot machine 땡기기
// 목표: random app, while, break,flow control
// math.random():자동으로 초기화 됨.0~1사이의 값을 생성함
// java.util.Random():자동으로 초기화됨. 초기화 방법제공. 값범위 지정가능
// random number: 0~7까지 발생

package app01_apps;

import java.util.Random;
import java.util.Scanner;

public class Jackpot {

	public static void main(String[] args) {
		while(true) {
			System.out.println("한번 더 하시겠습니까? y:계속 n:종료");
			Scanner sc =new Scanner (System. in);
			char gostop=sc.next().charAt(0);
			if(gostop=='n')break;
			
			Random rand=new Random();
			for(int i=0; i<3; i++) {
				System.out.println(rand.nextInt(8));
			}
		}System.out.println("프로그램을 종료합니다.");
		
		
	}

}
