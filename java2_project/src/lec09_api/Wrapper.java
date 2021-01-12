//Wrapper 클래스: 자바의 기본자료형들을 객체로 다루는데 사용
//장점: 자바가 제공하는 메서드 이용 가능
//Boolean,Character,Byte,Short,Integer,Long,Double,Float
//클래스를 사용해야 하므로 객체(인스턴스)를 생성해서 사용해야함
//Autoboxing<->Autounboxing
//오토박싱:기본자료형을 자동으로 객체형 자료형으로 변환 : int->Integer
//오토언박싱:객체형 자료형으로 자동으로 기본자료형으로 변환: Integer->int
package lec09_api;

public class Wrapper {

	public static void main(String[] args) {
		//Integer 정석
		Integer objNum1=new Integer(10);
		int num1=10;
		
		//오토박싱:int->Integer 로 자동변환.  new Integer()필요없음
		Integer objNum2=100;
		
		//오토언박싱:Integer->int
		int i=objNum1;
		
		//Wrapper클래스를 사용하는 이점:메서드 사용
		//1.문자열int로 변환
		int intNum1=Integer.parseInt("100");
		//int intNum2=Integer.parseInt("100A"); ERROR!
		
		//2. character
		Character objChar='a';
		char ch=objChar;
		
		//3.모든 Wrapper클래스는 toString()제공: 기본자료형을 String으로 변환
		String str1=Character.toString('A');
		String str2=Integer.toString(100);
		
		//4.Wrapper클래스는 valueOf(기본형):String을 기본형으로 전환
		Float f1=Float.valueOf("3.14");
		Float f2=Float.parseFloat("3.14");
		Integer i1=Integer.valueOf("100");
		Integer i2=Integer.parseInt("100");
	}

}
