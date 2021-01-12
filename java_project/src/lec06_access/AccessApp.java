//목표 : import와 접근지정자 Access Modifier   
//
//다른 패키지에 있는 클래스를 사용하고 싶을 때 클래스의 이름으로 참조. 
//참조해야할 클래스가 많아지고 다양해진다면 일일이 경로를 쓰는 것이 복잡함-> 이때 경로를 생략하는 방법이 import임

//클래스 접근지정자 : 클래스  외부 접근을 제어
//public 		어디서나 접근 가능. 클래스 앞에 붙음.   
//default(접근지정자를 안붙인경우)	같은 패키지 내에서만 접근 가능
//클래스 : 생략형 < public

package lec06_access;

import lec06_accessModifier.PublicClass;
public class AccessApp {

	public static void main(String[] args) {
		//default 접근지정자의 클래스인 경우 다른 패키지에서 접근불가함. 
		//lec06_accessModifier.DefaultClass dc; ERROR! 

		//import없이 다른 패키지에 있는 클래스 사용하고자 할 때 일일이 패키지이름까지 다 써줘야 함.
		lec06_accessModifier.PublicClass fullpa = new lec06_accessModifier.PublicClass();
		
		//import를 한경우 클래스 이름만으로 접근 가능
		PublicClass pa= new PublicClass();
		pa.publicInt=1;
		//접근 불가:패키지가 다르므로
		//pa.defaultInt;같은 패키지내에서만
		//pa.protectedInt;같은 패키지내 또는 자손
	    //pa.privateInt;클래스 외부에서는 접근 불가
		

	}

}
