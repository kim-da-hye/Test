//연산자
//종류: 산술,증감, 비교,논리,쉬프트, 삼항, 대입

package lec02_operators;

public class OperatorApp {

	public static void main(String[] args) {

	//산술연산자 :+,-, *, /(나눗셈), % (나머지) 
//	System.out.println(10+3);
//	System.out.println(10-3);
//	System.out.println(10*3);
//	System.out.println(10/3);
//	System.out.println(10%3);
//		
//	//증감연산자 :++,--
//	int count=0;
//	System.out.println(++count);//문장 실행전 더하기 1 
//	System.out.println(count++);//문장 실행후 더하기 1
//	System.out.println(--count);//문장 실행전 빼기  1
//	System.out.println(count--);//문장 실행후 빼기 1
//		
//	//비교연산자 :==, !=, <, >, <=, >= 결과는 true /false
//	System.out.println(1==2); //==:같으면 true 
//	System.out.println(1!=2); //==:다르면 true 
//	System.out.println(1<2); //< :작으면  true 
//	System.out.println(1>=2); 
//		
	//논리연산자: &&, ||, ! 
	boolean flag = true;
	System.out.println(!flag); //! :not 부정
	System.out.println(!flag && flag ); //&& : and :둘다 참일때만 참.
	System.out.println(!flag || flag ); //|| : or : 둘다거짓일때만 거짓
	
	//대입연산자  = += -= *= /= %=
	int num=10;
	System.out.println(num+=5); //num = num+5
	num +=5;		
	System.out.println(num);

	//문자열의 덧셈 : 연결
	System.out.println("코리아"+"it아카데미");
	System.out.println("코리아"+"it아카데미"+num);
//	System.out.println("코리아"+"it아카데미", num);ERROR 
	
	//비트 연산자 : &,|, ~, ^ 
	//삼항 연산자 :if문없이 조건 판단
	boolean result=17>10? true : false;
	System.out.println(result);
	
//	위와 동일
	result= 17>10;
	System.out.println(result);
	
//	max를구하는삼항연산자
//	3항연산자의 형식
//	조건식? 참일때의 실행문 : 거짓일때의 실행문
	int a=1;
	int b=10;
	int max= a>b? a : b;
	System.out.println("최대값은 "+max+"입니다");
	
	
	
		
	}

}
