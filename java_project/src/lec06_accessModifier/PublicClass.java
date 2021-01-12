//public:접근 지정자 어디서나 접근 가능. 다른 패키지에서도 접근 가능
//멤버 접근지정자: 멤버 사용의 외부 접근을 제어
//public:어디서나 접근가능.
//protected: 같은 패키지는 되고 다른 패키지에서는 자손클래스에서만 접근 가능.
//default(접근지정자를 안붙인 경우):같은 패키지에서만 접근 가능.
//private:클래스 내부에서만 접근 가능.
//멤버 :private < default(생략형) < protected < public
package lec06_accessModifier;

public class PublicClass {
	final String ACCESS="public class can be accessible anywhere";
	int defaultInt;
	public int publicInt;
	protected int protectedInt;
	private int privateInt;
	
	void defaultMethod() {
		System.out.println("defaultMethod");
	}
	public void publicMethod() {
		System.out.println("publicMethod");
	}
	protected void protectedMethod() {
		System.out.println("protectedMethod");
	}
	private void privateMethod() {
		System.out.println("privateMethod");
	}
}
