//목표:제어for-반복(정해진 숫자만큼)
//이중 for문 :for문 안의 for문
//이중 for문에서 바깥 for문은 행(row)를 의미
//안쪽 for문은 열(column)을 나타낸다

package lec03_flow_control;

public class For {

	public static void main(String[] args) {
		
		//for(초기화;조건식;증감식)
		//{조건이 참인동안 실행하는 블럭}
		//증감식은 블럭이 실행된 다음에 실행된다.
		for(int i=0;i<10;i++) {
			System.out.println(i+"번째 알람입니다");
			
		}
		int k=0;
		for(; k<10;) {
			System.out.println(k+"번째 알람입니다");
			k++;
		}
		
		//이중 for문
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("(%2d,%2d)",i,j);
			}
			System.out.println();
		}
		//quiz: 구구단 출력
		for(int i=1;i<10;i++) {
			for(int j=1;j<10; j++) {
				System.out.printf("%d*%d=%2d  ",i,j,i*j);
			}
			System.out.println();
		}
	}

}
