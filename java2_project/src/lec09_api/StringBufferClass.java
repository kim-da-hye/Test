//StringBuffer와StringBilder
//String은 변경불가(immutable) 객체이므로 속도가 느려짐 문자열을 만들때마다 인스턴스를 만듬.
//String은 new연산을 통해 생성되면 인스턴스 내부공간을 변경할수없다는 의미.
//+연산,concat()실행시 새로운 String객체를 new로만들어서 새로운 메모리 공간을 사용.

//StringBuffer와StringBilder은 객체안의 데이터를 변경가능(mutable)이므로 새로운 객체를 만들지않음. 속도 빠름.
//StringBuffer: 멀티쓰레드환경에서 synchronized키워드를 사용할수있음. 동기화가 가능. thread-safe
//StringBilder:동기화가 지원안됨. 멀티쓰레드환경에서 사용안됨. 속도는 StringBuffer보다 빠름.


//append()
//reserve()
//insert()
//delete()
//deleteCharAt()


package lec09_api;

public class StringBufferClass {

	public static void main(String[] args) {
		//1.객체생성
		StringBuffer stringBuffer=new StringBuffer();
		
		//2.객체생성
		StringBuffer stringBuffer2=new StringBuffer("JAVA");
		System.out.println(stringBuffer2);
		System.out.println(stringBuffer2.length());
		
		//3.추가 append()
		stringBuffer.append("World");
		System.out.println(stringBuffer);
		stringBuffer.append("World").append("to").append(" JAVA");
		System.out.println(stringBuffer);
		
		//4.삭제 delete():startIndex부터 endIndex-1
		System.out.println(stringBuffer.delete(5, stringBuffer.length()));
		//5.하나만 삭제 deleteCharAt()
		System.out.println(stringBuffer.deleteCharAt(0));
		//6.추가 insert()
		System.out.println(stringBuffer.insert(3, "Hello"));
	}

}
