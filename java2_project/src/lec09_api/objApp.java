//API:Application Programming Interface
//개발자들을 위해 기본적으로 제공하는 클래스(import필요없음)
//System.out.println() 메서드들이 java.lang 패키지가 지본적으로 제공한 API였음
//참조사이트: https://docs.oracle.com/javase/8/docs/api/

//object 클래스: 모든 클래스의 조상, 최상위부모
//멤버변수없이 11개의 메서드가 있음
//extends가 없어도 자동으로 상속됨
//주요 메서드들;
//clone():인스턴스 복사, 필드값만 복사(얕은 복제)
//equals():기본적으로==와동일객체의 주소값비교 같으면true
//따라서 클래스를 만드는 경우 논리적으로 동등한지(내용이 같은지)비교하기위해서override 해줘야함
//hashcode():해시코드를 반환하는 메서드
//해쉬코드: 객체를 구성하는 유일한 정수값 객체의 메모리번지를 이용하여 해시코드를 만듬 (메보리 주소와 같다고 보면됨)
//hashmap 에서 두객체가 동등한지 판단할때 해시코드를 사용하기 때문에
//toString(): 객체의 주소를string 으로 반환 패키지명 클래스명주소 (16진수)
//println호출할때 toString ()반환값을 사용
//이클립스 툴을 사용해서 override할때 hashcode(),toString(),equals()생성

package lec09_api;
//extends가업어도 자동으로 Object가상속됨

class ObjectChild{
	
	String name;
	int score;
	
	ObjectChild(){}
	ObjectChild(String name,int score){
		this.name=name;
		this.score=score;
	}
}

public class objApp {
		static void objectChildMethod() {
			ObjectChild child1=new ObjectChild("shin",90);//child1와child2는 객체가 다르다
			ObjectChild child2=new ObjectChild("shin",90);
			ObjectChild child3=child1; //객체가 같다
			System.out.println(child1);//toString()이 불림 override 안했기 때문에 Object클래스의 메서드가 불림
			String name1=new String("shin");
			String name2=new String("shin");
			System.out.println(name1);
			
			//hashcode():메모리의 주소로 해석해도 됨 이게 같으면 객체가 같다고 보면됨
			System.out.println(Integer.toHexString(child1.hashCode()));
			System.out.println(child1==child2); //false 객체가 다르니깐
			System.out.println(child1==child3); //true 객체가 같으니깐
			System.out.println(child1.equals(child2));//false==와같음(object의 메서드이므로)
			System.out.println(child1.equals(child3));//true 객체가 같으므로 ==해도 같음
			
			
			System.out.println(name1 == name2); //false객체가 다르니깐
			System.out.println(name1.equals(name2)); //내용을 비교true(equal()을 override했으므로)
		}

	
static void overrideChildMethod() {
	
		OverrideChild child1=new OverrideChild("shin",90);//child1와child2는 객체가 다르다
		OverrideChild child2=new OverrideChild("shin",90);
		OverrideChild child3=child1; //객체가 같다
		System.out.println(child1);//toString()이 불림 override 안했기 때문에 Object클래스의 메서드가 불림
		String name1=new String("shin");
		String name2=new String("shin");
		System.out.println(name1);
		
		//hashcode():메모리의 주소로 해석해도 됨 이게 같으면 객체가 같다고 보면됨
		System.out.println(Integer.toHexString(child1.hashCode()));
		System.out.println(child1==child2); //false 객체가 다르니깐
		System.out.println(child1==child3); //true 객체가 같으니깐
		System.out.println(child1.equals(child2));//true.equals()를 override했으므로
		System.out.println(child1.equals(child3));//true객체가 같으므로 ==해도같음.
		
		
		System.out.println(name1 == name2); //false객체가 다르니깐
		System.out.println(name1.equals(name2)); //내용을 비교true(equal()을 override했으므로)
	
}

	public static void main(String[] args) {
		//objectChildMethod();
		overrideChildMethod();
	}

}
