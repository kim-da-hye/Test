//스트링의 기본과 클래스 메서드
//String변수는 참조타입의 변수(주소가 저장)
//비교연산자
//주요메서드:
//concat():문자열 연결
//substring():문자열 잘라내기
package lec09_api;

public class StringAPI {

	public static void main(String[] args) {
		
		int i=0;
		//1.string변수 선언
		//인스턴스를 생성하므로 new로 생성하는 게 맞음
		String str=new String("Hello World");
		
		//2.단순 선언:"자바":리터럴을 가르킴
		String text="자바";
		
		//immutable:수정이 안됨 +연산자를 하면 새로 String을 더함
		String text2=text + str;//아예 새롭게 메모리를 할당하고 스크링을 생성. 메모리에 부하 많이감.
		
		//2.비교:equals()을 사용해서 내용을 비교
		System.out.println("hello".equals("hello"));
		
		//길이:length()
		System.out.println("Hello World".length());
		//위치:indexOf()::앞에서부터 찾는다 index는 0부터 시작
		//lastIndexOf():뒤에서부터 찾는다
		System.out.println("Hello World".indexOf("Wo"));
		System.out.println("LAST INDEX");
		System.out.println("Hello World Hello".lastIndexOf("He"));
		
		//글자변환:위치에 해당되는 글자변환
		System.out.println("Hello".charAt(0));
		
		//문자열 구분하여 배열요소로 저장:split()
		String[] textArray="hello world new year's greetings".split("  ");
		//향상된for문
		for(String t :textArray) {
			System.out.println(t+"  ");
		}
		System.out.println();
		//문자열 앞뒤 공백 제거 trim()
		//method를 연쇄적으로 사용하면 편리
		System.out.println("   angel   ".trim().equals("angel"));
		
		//변경, 대치: replace()
		System.out.println("1,000,000".replace(",", ""));
		
		//String을 int로 바꿈
		int num=Integer.valueOf("1000");
		int num2=Integer.parseInt("1000");
		System.out.println(num+num2);
		
		//int을 string으로
		String str1=String.valueOf(100);
		String str2=Integer.toString(100);
		System.out.println(str1+str2);
		
		//일부 문자열 추출:substring()
		System.out.println("HelloWorld".substring(3));
		
		//quiz:파일 이름에서 확장자만 추출
		//힌트:.을 찾는다. substring()을 사용한다.
		//"hello.world.java"에서 java만 추출하시오
		String filename= "hello.world.java";
		System.out.println(filename.lastIndexOf("."));
		int begin=filename.lastIndexOf(".");
		System.out.println(filename.substring(begin+1));
		
		//문자열 연결:concat() :문자열 새로 생김
		System.out.println("hello world".concat("Hello"));
		
		//있는지 확인:contains():대소문자 구분하므로 못찾음
		System.out.println("Hello World".contains("hello"));
		//소문자로 바꾸어준 후 있는지 확인
		System.out.println("Hello World".toLowerCase().contains("hello"));
		
		//char형 배열에 저장된 문자를 String으로 변환
		char[] chars= {'H','e','l','l','o'};
		System.out.println(chars);
		String charsString="";
		for(i=0; i<chars.length;i++) {
			charsString+=chars[i];
		}
		for(char c: chars) {
			charsString+=c;
		}
		System.out.println(charsString);
		
		//format():일정한 format으로string 을 만듬
		System.out.println(String.format("%10s %5d %5.3f", "shin", 100, 10.2));
		System.out.println(String.format("%10s %5d %5.3f", "hi", 10000, 10.2323));
		
		//시작:startswith()
		//끝:endswith()
		System.out.println("Hello World".startsWith("H"));
		System.out.println("Hello World.".endsWith("."));
		
	}

}
