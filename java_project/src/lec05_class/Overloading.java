//오버로딩Overloading:다형성의 일부
//이름이 같은 메서드를 여러개 정의
//그러나, 매게변수의 갯수와 타입이 달라야함
//즉, 메게변수의갯수와 타입이 다르면 이름이 같아도 다른 메서드로 인식한다는 의미

package lec05_class;

public class Overloading {
	//#1 메서드의 정의
	static void print_greeting(String name) {
		System.out.println("반갑습니다."+name+"님이 입장하셨습니다");
	}
	//#2메서드의 정의
	static void print_greeting(int id,String name) {
		System.out.println("반갑습니다."+id+ name+"님이 입장하셨습니다");
	
	}
	public static void main(String[] args) {
		//메서드가 같음 오버로딩이 되므로
		 print_greeting("닌자거북이");
		 print_greeting(195554643,"어둠의 마법사");

	}

}
