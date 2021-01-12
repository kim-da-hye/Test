//체크카드 사용 프로그램
//통장에 잔고가 10000이 있다.(엄마 용돈)
//1. 먼저 결제할려면 금액 입력받는다.
//2. 금액이 잔고보다 크면 결제가 안되고 잔고액과 함께 "잔고가 부족하여 결제가 불가능합니다"를 출력
//3. 금액이 잔고보다 작으면 결제가 되고 잔고액만 출력
//4. 잔고가 0이면 잔액이 0임을 알려주고 프로그램 종료 

package app01_apps;

import java.util.Scanner;

public class BalanceApp {

	public static void main(String[] args) {
		int balance=10000;
		int check=0;
		Scanner sc =new Scanner (System. in);
		System.out.println("현재 통장 잔고는 "+balance+"입니다");
		while(true) {
			//1. 결제할 금액을 입력받는다
			System.out.println("결제할 금액을 입력하세요");
			check=sc.nextInt();
			//2. 금액>잔고이면
			if(balance-check<0) {
				System.out.println("잔액이 부족하여 결제가 안됩니다");
				System.out.println("현재 통장 잔고는 "+balance+"입니다");
			}else if(balance-check>0) {//3. 금액이 잔고보다 작으면 결제가 되고 잔고액만 출력	
				balance-=check;
				System.out.println("현재 통장 잔고는 "+balance+"입니다");
			}else{//4. 잔고가 0이면 잔액이 0임을 알려주고 프로그램을 종료break
				//balance-check==0
				System.out.println("현재 통장 잔고는 "+balance+"입니다");
				break;
			}
			
				
			
			}System.out.println("프로그램이 종료됩니다");
		}
		

	}


