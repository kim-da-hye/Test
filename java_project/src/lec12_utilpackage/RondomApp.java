//랜덤 클래스:무작위 추출 내부 알고리즘
//종자값(seed 씨드)에따라서 값을 반환함
//따라서 씨드가 같으면 항상 같은 값을 반환하므로 랜덤이 아니게 되므로 주의!
//내부적으로 처음 부를때 다름값을 주도록 내부적으로 설계
//메서드
//nextInt:무작위 int 값 반환
//nextInt(int n):0보다 크고n 보다 작은 int 값 변환
package lec12_utilpackage;

import java.util.Random;

public class RondomApp {

	public static void main(String[] args) {
		//Random():현재 시간을 종자값으로 인스턴스 생성
		Random rand= new Random();
		
		//Random(long seed):seed를 종자값으로 인스턴스 생성

		Random rand2= new Random(0);
		Random rand3= new Random(0);
		
		for(int i=0;i<5; i++) {
			System.out.println(rand.nextInt(100));//0보다 크고 100보다 작은 랜덤값 생성
		}
		System.out.println("동일 난수값 생성");
		for(int i=0;i<5; i++) {
			System.out.println(rand2.nextInt(100));//0보다 크고 100보다 작은 랜덤값 생성
			System.out.println(rand3.nextInt(100));//0보다 크고 100보다 작은 랜덤값 생성
		}
		

	}

}
