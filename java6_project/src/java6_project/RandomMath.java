//Math를 이용한 Random 값 출력 실습
package java6_project;

public class RandomMath {

	public static void main(String[] args) {
		
		System.out.println("-->Math를 이용한 Random 값 실습 출력");
		//range:0.0~1.0(exclusive)
		double randomValue =Math.random(); // Math의 random() 함수로 값을 산출
		int intValue =(int)(randomValue * 100)+1; // 100이하로 정수로 변환
		System.out.println(intValue); //값 출력
		System.out.println();

	}

}
