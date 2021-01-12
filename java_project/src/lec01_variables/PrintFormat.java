package lec01_variables;

public class PrintFormat {

	public static void main(String[] args) {
		//Escape Sequence(character):출력시 특정한 기능 수행
		//#1 줄바꿈
		System.out.println("Hello\nWorld");
		//#2 tap
		System.out.println("Hello\nWorld");
		
		//format string
		//%d: 정수값 (byte, int, short, long)
		//%f: 실수값 (float, double)
		//%c: char 문자하나
		//%s: string 문자열(문자 2개 부터)
		//%n newline
		System.out.printf("%d %f %n",10,10.2 );
		//자리수 지정
		//%10d 전체 자리수 10자리
		//%10.2f 전제차리수 10자리 소수점 이하 자리수2
		System.out.printf("%10d %10.2f %n",100,10.2983);
		System.out.printf("%d %f %n",100,10.2983);
	}

}
