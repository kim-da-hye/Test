//접근지정자에 따른 접근 권한 확인
//같은 패키지내에서는 public,default,protected도 됨 
//private은 안됨 (Encapsulation)

package lec06_accessModifier;

public class AccessApp {

	public static void main(String[] args) {
		//public class 접근
		PublicClass pc ;
		
		//default class 접근:같은 패키지내이므로 접근 가능
		DefaultClass dc= new DefaultClass();
		//멤버 변수 접근
		dc.defaultInt=1;
		dc.protectedInt=1;
		dc.publicInt=1;
		//dc.privateInt=1; :private 멤버변수는 접근 불가:클래스 내부에서만 접근 가능하므로
		
		//메소드 접근
		dc.defaultMethod();
		dc.protectedMethod();
		dc.publicMethod();
		//dc.protectedMethod(); :private method는 접근 불가
		
		
	}

}
