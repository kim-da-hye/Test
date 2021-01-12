//enum
//상수의 그룹을 나타날때 사용
//열거된 순서에 따라서 0부터 순서값을 가짐. 차례대로 증가함
//enum열거형으로 지정된 상수는 모두 대문자로 사용(문법상의 제약은 아님)
//자바에서의 enum은 강력한 기능한 제공:변수,메서드,생성자를 추가.완전한 기능을 가진 클래스
//유용성:고유한 데이터 타입 정의 (Enumerated Date Type)
//enum은 클래스를 사용하여 내부적으로 정의되어, enum을 상속받는다.

package lec11_coding_style;

//enum정의
enum Year{
	FRESHMAN,SOPHOMORE,JUNIOR,SENIOR
}

//내부적으로
//class Year
//{
//	final int freaman=1; 이렇게 하지 말고
//	public static Year FRESHMAN=new Year(); 
//	public static Year SOPHOMORE=new Year(); 
//	public static Year JUNIOR=new Year(); 
//	public static Year SNEIOR=new Year(); 
//}

enum Major{
	MATH,ART,LAW,BIOLOGY;
}

class Student{
	String name;
	Major major;
	Year year;
	
	//생성자
	public Student() {}
	public Student(String name, Major major, Year year) {
		this.name=name;
		this.major=major;
		this.year=year;
		
	}
	@Override
	//print할때 자동으로 호출
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", year=" + year + "]";
	}
	
}

public class EnumApp {

	public static void main(String[] args) {
		Student student =new Student();
		System.out.println(student);
		Student student2 =new Student("kimdahye",Major.BIOLOGY,Year.SENIOR);
		System.out.println(student2);
		
		//enum 메서드 활용
		//values():enum안에 있는 모든 값을 반환
		Year[] years=Year.values();
		for(Year y: years) {
			System.out.println(y);
		}
		//valueof():스트링을 주면 상수의 스트링을 반환
		Year year =Year.valueOf("FRESHMAN");
		System.out.println(year);
		
		Year y=student2.year;
		switch(y) {
		case FRESHMAN:
			System.out.println("welcome to college");
			break;
		case SOPHOMORE:
			System.out.println("know how to do");
			break;
		case JUNIOR:
			System.out.println("focus on working");
			break;
		case SENIOR:
			System.out.println("ready for society");
			break;
		
		}
		//ordinal():배열의 인덱스처럼 enum상수 인덱스를 찾을수 있다.
		for(Year ye: Year.values()) {
			System.out.println(ye+": ");
			System.out.println(ye.ordinal());
		}
		makeStudent();
		
	}

	private static void makeStudent() {
		String[] DB= {"shin","MATH","JUNIOR"};
		//Student 객체를 만들어 보세요 valueof활용
		String name=DB[0];
		Major major=Major.valueOf("MATH");
		Year year=Year.valueOf("JUNIOR");
		Student student=new Student(name,major,year);
		System.out.println(student);
		
	}

}
