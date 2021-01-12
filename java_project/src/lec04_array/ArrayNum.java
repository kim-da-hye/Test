//배열
//변수 하나로 많은 데이터를 한번에 관리
//배열을 담는 변수는 참조형 변수
//참조형 변수란 변수에 저장되는 게 아니라 주소가 저장함을 의미
//참조형 변수의 예: 배열, 스트링, 클래스
package lec04_array;

public class ArrayNum {

	public static void main(String[] args) {
		//배열이 필요한 이유를 알아보자
		int member1,member2,member3,member4;
		member1=10;
		member2=20;
		member3=30;
		member4=40;
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member4);
		
		//배열선언
		//초기화를 안하는 경우 내부적으로 기본값으로 초기화가 됨
		//#1
		int[]product; //배열변수 선언. 참조 변수
		product=new int[10]; //실제 건물이 저장되는 공간
		
		//기본자료형과 비교
		int num;
		num=10;
		
		//#2 선언과 초기화를 동시에. 0으로 초기화
		//10개의 원소로 된 배열
		//new int [배열의 크기]
		//new를 부르는 object 생성
		int[] numbers=new int[10];
		
		//#3 선언과 초기화시 값 대입
		int[] numbers2=new int[] {10,20,30,40};
		
		//인덱스:0부터 시작
		//배열의 원소에 접근,변경
		System.out.println(numbers2[0]);
		numbers2[0]=100;
		System.out.println(numbers2[0]);
		
		//for 문을 통한 배열의 원소 변경
		for(int i=0;i<numbers2.length;i++) {
			numbers2[i] +=1000;
		}
		
		
		//for 문을 통한 출력
		for(int i=0;i<numbers2.length;i++) {
		System.out.printf("%d ",numbers2[i]);
		}System.out.println();
	
		//향상된for문:읽을수만 있다.
		for(int number: numbers2) {
		System.out.println("향상된 for문"+number);
		}
		//index 사용시 주의사항:범위를 벗어나면 런타임 에러:런타임중에 발생
		int count=5;
		//length=4이면index:0,1,2,3
		System.out.println("배열의 크기:"+numbers2.length);
		//ArrayIndexOutOfBoundsException
//            for(int i=0;i<count ;i++) {
//			System.out.printf("%d ",numbers2[i]);
//			}
		
	
		//다차원 배열
		int [][]stock=new int[][] {{10,20,30},{20,40,50}};
		for(int i=0;i<stock.length;i++) {
			for (int j=0;j<stock[0].length;j++) {
				System.out.printf("stock[%d][%d]=%d  ",i,j,stock[i][j]);
			}
			System.out.println();
		}
		
		
		
	
	}

}
