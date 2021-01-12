//제어문#1  :if
package lec03_flow_control;

public class IfApp {

	public static void main(String[] args) {
		
		//	if문 #1
		int count=20;
		//형식 if(조건식) {조건식이 참일 때 수행}
		//{} :블럭 지정 
		if (count >10 ) {
			System.out.println("숫자가 10을 초과하였습니다. ");
		}
		// if else문 #2
		//형식 if(조건식) {조건식이 참일 때 수행}
		//    else { 조건식이 참이아닐 때 수행}
		count =9; 
		if (count >10 ) {
			System.out.println("숫자가 10을 초과하였습니다. ");
		} else {
			System.out.println("입력하신 숫자는:  "+ count);
			
		}
		
		//if else if 문 #3
		if(count>10) {
			System.out.println("숫자가 20을 초과하였습니다");
		}else if(count>10) {
			System.out.println("숫자가 20보다 작고 10을 초과하였습니다");
		}else {
			System.out.println("10을 초과하지 않습니다");
		}
		
		

	}

}
