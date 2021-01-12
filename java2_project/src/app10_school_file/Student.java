package app10_school_file;


//김다혜,컴퓨터공학,90,20,80
public class Student implements Comparable<Student> {
	String name;
	MajorType major; //enum
	Score score;
	int avg;
	//생성자
	public Student() {}
	public Student(String name, MajorType major, Score score) {
		super();
		this.name = name;
		this.major = major;
		this.score=score;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-20s   %5d ",
				name, major, avg)+score.toString();
	}
	public void avg() {
		avg=score.getAvg();
	}
	@Override
	public int compareTo(Student o) {
		return o.avg-avg;
		
	}
	
	
}
