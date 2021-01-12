//목표 :변수, 데이터 타입, 형변환
//변수 : 데이터를 담는 메모리 공간. 값을 변경할 수 있음
//변수의 종류:기본형, 참조형
//	기본형 :정수, 실수, 문자,불린(참/거짓)
//	참조형 : 스트링(문자열), 클래스(객체)
//데이터 타입 : 어떤 형태의 데이터를 저장할 것인지 정의
//상수 : 고정된 값. final 

package lec01_variables;

public class VariableApp {

	public static void main(String[] args) {
		//변수선언과 초기화
		//변수명은 알파벳과 _, $만 가능.숫자로 시작하면 안됨. 대소문자구분.소문자로 시작. 예약어 사용불가
		//형식 : 자료형 변수명;
		// ; : 한문장의 끝(명령의 끝)
		
		int num1; //정수를 저장할 수 있는 메모리 할당
		num1= 10; //변수 초기화 : 생성된 메모리에 최초 값을 할당. 초기화 없이 사용시 에러.
		int num2=99; // 선언과 동시에 초기화 
		int num3=1, num4=1; //여러개
		
		//데이터 타입 
		//정수: byte/short/int/long
		byte b1 = 127 ;  //1byte byte메모리의 최소의 단위 : -127~ 128
		short s1 =32767 ;//2bytes  -32768 ~ 32767
		int int1 = 10000 ; //4bytes 정수타입의  default는 int임
		long long1= 1000000l; //8byte 숫자에 l을 붙임:long임을 알리기 위해 
				
		//실수
		float f1 = 98.1f; //4byte 숫자에 f를 붙임. 
		double d1 =88.2; //8byte 
		//문자
		char ch1 ='c'; //2byte unicode(영어이외의 다른 언어표현 가능)
		
		//불린
		boolean boo1 = true; //1byte
		//문자열
		String name = "it아카데미"; 
		
		//형변환: 데이터 타입이 바뀌는 것
		//자동형변환 :사이즈가 작은 데이터가 사이즈가 큰 변수에 할당될때(데이터 손실 없음.  에러안남)
		int1 = b1;
		//강제형변환:사이즈가 큰 데이터가 사이즈가 작은 변수에 할당될때(데이터 손실 있음. 컴파일 에러남)
//		b1=s1; ERROR! 
		b1=(byte)s1;
		System.out.println(b1);
		
		//상수 :모두 대문자로 표기
		final double PI = 3.14;
//		PI=3.14159; ERROR

		
		
		
		
		

	}

}
