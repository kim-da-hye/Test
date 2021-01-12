//목표: 접근지정자 활용
//접근지정자를 이용하여 캡슐화(정보은닉) encapsulation
//멤버변수를 외부(다른 클래스)메서 직접 접근할 수 없도록 캡슐화
//단, 다른 클래스에서 접근할때 setter,getter메소드를 통해 접근 가능 하도록 한다.
//학생의 속성:
//1.학번
//2.이름
//3.전공
package app04_school_collection;

public class Student {
	private int id;//학번
	private String name;//이름
	private String major;//전공
	
	//생성자 정의
	//기본 생성자
	public Student() {}
	public Student(int id, String name, String major) {
		this.id=id;
		this.name=name;
		this.major=major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
