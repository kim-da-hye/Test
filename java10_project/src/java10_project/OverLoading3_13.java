package java10_project;
class Father{
	void show(String str) {
		System.out.println("show(String str)수행"+str);
	}
}

class Son extends Father{
	void show() {
		System.out.println("하위 클래스의 메소드 show() 수행");
	}
}

public class OverLoading3_13{

	public static void main(String[] args) {
		Son over=new Son();
		over.show("상위 클래스 호출");
		over.show();

	}

}
