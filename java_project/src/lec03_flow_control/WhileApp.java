//제어문:while,break,continue
//While:무한반복
//break:반복문 없음
//continue:반복문 이하 문장 스킵,즉 반복문의 맨 위로감
package lec03_flow_control;

public class WhileApp {

	public static void main(String[] args) {
		//while(조건식){조건문이 참일때 수행}
		//10번의 알람이 울리게 프로그램
		int i=10;
		while(i<10) {
			System.out.println(i+"번째 알람입니다");	
			i++;//조건식을 변경시켜야하는 문장이 반드시 필요함
				}
		System.out.println(i );
		//continue,break
		i=0;
		while(true) {
		i++;//continue보다 아래로 가면 수행이안되므로 무한 반복
			if(i%3==0)//3의 배수일때
				continue;//스킵: 아래 문장을 수행하지 않음
			System.out.println(i+"번째 알람입니다" );
			if(i>10) 
				break;//반복문 탈출. 무한반복문에서는 반드시 break해줘야함
			
			
		}
		
		//do while 적어도 한번은 실행됨. 조건문 아래 있으니깐
		i=0;
		do {
			System.out.println(i+"번째 알람입니다" );
			i++;
		}while(i<10);
	}

}
