//목표: 참조형 변수 string 이해
//참조형 변수의 같다라는의미
//선언시 new를 사용했을때와 사용하지 않았을 때 차이
//equals():참조하고 잇는 객체의 내용이 같은지
//System.identityHashCode():참조하고 있는 객체의 주소

package lec01_variables;

public class Strings {

	public static void main(String[] args) {
		
		//String 선언 원칙:String은 인스턴스를 생성해야 하므로 new로 메모리의 공간 확보
		String str=new String("Hello World");
		
		//String 단순 버전: 기본자료형처럼 선언. 편의를 위한것임. 효과가 조금 다름.
		String text="자바";
		text="스트링은 변경할 수없는 객체이므로 문자열을 작업할때마다 인스턴스를 새로 생성하게 해야 합니다";
		
		//기본형이 같다는 의미
		int num1=10;
		int num2=10;
		System.out.println(num1==num2);
		
		//new를 사용하여 String을 생성할 때
		String angel1=new String("angel");
		String angel2=new String("angel");
		System.out.println(angel1==angel2);//주소가 다르므로 (다른 객체를 가르키므로) false
		System.out.println(System.identityHashCode(angel1));
		System.out.println(System.identityHashCode(angel2));
		System.out.println(angel1.equals(angel2));//내용이 같은지 체크하므로 true
		
		
		//단순 버전으로 String 생성할 때  
	    String name1="angel";//컴파일시 생서한 리터럴 사용(값 자체,= 상수) 사용
	    String name2="angel";//리터럴을 사용하므로 동일한 주소
	    System.out.println(name1==name2);//주소가 같으므로 (같은 객체를 가르키므로) true
	    System.out.println(System.identityHashCode(name1));
	    System.out.println(System.identityHashCode(name2));
	    System.out.println(name1.equals(name2));//내용이 같은지 체크하므로 true
	}

}
