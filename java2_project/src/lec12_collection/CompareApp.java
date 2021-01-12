//���� 
//java.util.Collections Ŭ������ static �޼ҵ��� sort()�� �̿�. 
//



package lec12_collection;

import java.util.ArrayList;  //�������̽��� ������ Ŭ���� 
import java.util.Collections;
import java.util.Comparator;
import java.util.List; //�������̽� 

//�л�: �̸�, �г�, ����. 
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
		
		System.out.println("���� ��");
		for (Student s : studentList ) {
			System.out.println(s);
		}
		Collections.sort(studentList);
		System.out.println("������ ���� �� ");
		for (Student s : studentList ) {
			System.out.println(s);
		}
		
		System.out.println("�̸����� ����");
		NameComparator nameComparator = new NameComparator();
		Collections.sort(studentList, nameComparator);
		for (Student s : studentList ) {
			System.out.println(s);
		}
	}
}
