//StringBuffer��StringBilder
//String�� ����Ұ�(immutable) ��ü�̹Ƿ� �ӵ��� ������ ���ڿ��� ���鶧���� �ν��Ͻ��� ����.
//String�� new������ ���� �����Ǹ� �ν��Ͻ� ���ΰ����� �����Ҽ����ٴ� �ǹ�.
//+����,concat()����� ���ο� String��ü�� new�θ��� ���ο� �޸� ������ ���.

//StringBuffer��StringBilder�� ��ü���� �����͸� ���氡��(mutable)�̹Ƿ� ���ο� ��ü�� ����������. �ӵ� ����.
//StringBuffer: ��Ƽ������ȯ�濡�� synchronizedŰ���带 ����Ҽ�����. ����ȭ�� ����. thread-safe
//StringBilder:����ȭ�� �����ȵ�. ��Ƽ������ȯ�濡�� ���ȵ�. �ӵ��� StringBuffer���� ����.


//append()
//reserve()
//insert()
//delete()
//deleteCharAt()


package lec09_api;

public class StringBufferClass {

	public static void main(String[] args) {
		//1.��ü����
		StringBuffer stringBuffer=new StringBuffer();
		
		//2.��ü����
		StringBuffer stringBuffer2=new StringBuffer("JAVA");
		System.out.println(stringBuffer2);
		System.out.println(stringBuffer2.length());
		
		//3.�߰� append()
		stringBuffer.append("World");
		System.out.println(stringBuffer);
		stringBuffer.append("World").append("to").append(" JAVA");
		System.out.println(stringBuffer);
		
		//4.���� delete():startIndex���� endIndex-1
		System.out.println(stringBuffer.delete(5, stringBuffer.length()));
		//5.�ϳ��� ���� deleteCharAt()
		System.out.println(stringBuffer.deleteCharAt(0));
		//6.�߰� insert()
		System.out.println(stringBuffer.insert(3, "Hello"));
	}

}
