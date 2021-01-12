package app07_average_api;

import java.util.ArrayList;

class StudentTask {
	ArrayList<Student> studentList=new ArrayList<>();
	//data= {"shin, 100, 90", "lee, 90, 20", "kim, 80, 70", "park, 100, 99"};
	public void add(String[] data) {
		int i=0;
		for(String line:data) {
			//System.out.println(line);
			String[] columns=line.split(",");
			for(String s:columns) {
				System.out.println(s);
			}
			String name=columns[0];
			int mathScore=Integer.parseInt(columns[1].trim());
		    int engScore=Integer.parseInt(columns[2].trim());
		    Student student=new Student(name, mathScore,engScore);
		    studentList.add(student);
			}
			
			
		}

	public void print() {
		for(Student s :studentList) {
			System.out.println(s); //toString()을 override해놨기 때문에 출력을 호출하면 toString()에서 반환하는 값이 출력된다.
		}
	}

	public void setAvg() {
		for(Student s: studentList) {
			s.avg=(s.getEngScore()+s.getMathScore()) /2;
		}
	}

	public void printAvg() {
		System.out.println("------------------------------------");
		for(Student s:studentList) {
			s.printAvg();
		}
	}
}
