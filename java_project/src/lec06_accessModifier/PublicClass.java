//public:���� ������ ��𼭳� ���� ����. �ٸ� ��Ű�������� ���� ����
//��� ����������: ��� ����� �ܺ� ������ ����
//public:��𼭳� ���ٰ���.
//protected: ���� ��Ű���� �ǰ� �ٸ� ��Ű�������� �ڼ�Ŭ���������� ���� ����.
//default(���������ڸ� �Ⱥ��� ���):���� ��Ű�������� ���� ����.
//private:Ŭ���� ���ο����� ���� ����.
//��� :private < default(������) < protected < public
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
