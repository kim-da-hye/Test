//이름,수학점수,영어점수로 문자열 배열이 있을때
//객체로 만들어서 이름을 ArrayList로 정의
//각 학생의 평균을 구해라

//문제를 푸는 순서
//1.Student라는 class만들기
//2.StudentTask라는 class만들기(main에서 부르는 함수들을 제공)
//3.main에서는
//1)문자열 배열을 읽어서 StudentTask의 메소드를 이용해서 ( StudentTask안에서 ArrayList 생성)
//2)출력
//3)평균 계산
//4)평균 출력
package app07_average_api;



public class AverageApp {
	
	static String[] data= {"shin, 100, 90", "lee, 90, 20", "kim, 80, 70", "park, 100, 99"};
	public static void main(String[] args) {
		System.out.println("test");
		StudentTask st=new StudentTask();
		
		//1. data를 읽어서 추가
		st.add(data);
		//2. 학생들의  정보 출력
		st.print();
		//3. 평균 계산
		st.setAvg();
		//4. 평균 출력
		st.printAvg();
	}

}
