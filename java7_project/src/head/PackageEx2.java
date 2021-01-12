//각각의 폴더에 저장된 소스를 package로 일괄 처리 하는 시스템
package head;

import first.First;
import second.Second;
import third.Third;

class PackageEx2 {
	public static void main(String[] args) {
		System.out.println("18102039 김다혜 입니다!!");
		First one = new First(); //다른 프로그램의 클래스에 대한 객체를 정의
		one.하나(); //다른 클래스 안에 있는 메소드 호출
		Second two = new Second(); //다른 프로그램의 클래스에 대한 객체를 정의
		two.둘(); //다른 클래스 안에 있는 메소드 호출
		Third three = new Third(); //다른 프로그램의 클래스에 대한 객체를 정의
		three.셋(); //다른 클래스 안에 있는 메소드 호출
	}
}
