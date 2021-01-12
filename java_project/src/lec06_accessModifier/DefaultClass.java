//접근지정자가 없는 경우 다른 패키지에서  접근 불가(default)
package lec06_accessModifier;

class DefaultClass {
	final String ACCESS="default class is accessible within the same package";
	int defaultInt;
	public int publicInt;
	protected int protectedInt; 
	private int privateInt; 

	void defaultMethod() {
		System.out.println("private int = "+ privateInt);
	}
	public void publicMethod() {
		System.out.println("private int = "+ privateInt);
	}
	protected void protectedMethod() {
		System.out.println("private int = "+ privateInt);
	}
	private void privateMethod() {
		System.out.println("private int = "+ privateInt);
	}

}

