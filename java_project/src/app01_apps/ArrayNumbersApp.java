//사용자로부터 10개의 값을(정수)을 입력받아 아래의 문제 풀기
//#1 사용자로부터 받은 10개의 정수값을 출력(Scanner,array,for)
//#2 최대값 구하기(for,if)
//#3 큰 순서대로 정렬하기(이중 for)
//#4 "프로그램을 종료합니다"출력하고 프로그램 종료

package app01_apps;

import java.util.Scanner;

public class ArrayNumbersApp {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System. in);
		int[]numbers=new int[10];
		//0.입력
		System.out.println("10개의 정수를 입력하세요");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		//1.출력
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("%d ", numbers[i]);
		}
		for(int n: numbers) {
			System.out.printf("%d ",n);
		}
		System.out.println();
		
		//2.최대값 구하기
		int max=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max)max=numbers[i];
			
		}
		
		System.out.println("최대값: "+max);
		
		//3.큰 순서대로 정렬하기
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				System.out.printf("i= %d,j=%d",i,j);
				if(numbers[i]<numbers[j]) {
					System.out.printf("if문 안쪽 i= %d,j=%d",i,j);
					int temp= numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			
			}System.out.println();
			
		}
		for(int n: numbers) {
			System.out.printf("%d ",n);
		}
		

	}

}
