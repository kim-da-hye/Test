//정렬 
//java.util.Collections 클래스의 static 메소드인 sort()를 이용. 
//



package lec12_collection;

import java.util.ArrayList;  //인터페이스를 구현한 클래스 
import java.util.Collections;
import java.util.Comparator;
import java.util.List; //인터페이스 

//학생: 이름, 학년, 학점. 
class Student implements Comparable<Student>{
	String name;
	int year;
	int grade;
	Student(String name, int year, int grade) {
		this.name = name;
		this.year = year;
		this.grade = grade; 
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + ", grade=" + grade + "]";
	}
	@Override
	public int compareTo(Student o) {
			return o.grade - grade;
	}
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class CompareApp {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<>(); 
		nameList.add("Kim");
		nameList.add("Aim");
		nameList.add("Lim");
		nameList.add("Zim");
		nameList.add("Sim");
		System.out.println("Sim".compareTo("Kim"));
		System.out.println("Kim".compareTo("Sim"));
		System.out.println("Kim".compareTo("Kim"));
		
		System.out.println(nameList);
		System.out.println(nameList.get(0));
		Collections.sort(nameList); 
		System.out.println(nameList);
		System.out.println(nameList.get(0));
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Kim", 1, 90));
		studentList.add(new Student("Aim", 3, 80));
		studentList.add(new Student("Zim", 2, 50));
		studentList.add(new Student("Bim", 4, 40));
		studentList.add(new Student("Lim", 1, 97));
		studentList.add(new Student("Kim", 2, 200));
		
		System.out.println("정렬 전");
		for (Student s : studentList ) {
			System.out.println(s);
		}
		Collections.sort(studentList);
		System.out.println("점수로 정렬 후 ");
		for (Student s : studentList ) {
			System.out.println(s);
		}
		
		System.out.println("이름으로 정렬");
		NameComparator nameComparator = new NameComparator();
		Collections.sort(studentList, nameComparator);
		for (Student s : studentList ) {
			System.out.println(s);
		}
	}
}
