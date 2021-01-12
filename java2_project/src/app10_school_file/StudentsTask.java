package app10_school_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class StudentsTask {
	//멤버 변수
	
	//파일에서 읽어온 데이터를 저장하는 변수
	ArrayList<String> lines =new ArrayList<>();
	//ArrayList 학생을 관리하는 리스트 변수
	ArrayList<Student> studentList = new ArrayList<>();
	

	public void readFile() {
		
		BufferedReader br=null;

		String basePath=System.getProperty("user.dir");
		String filePath=basePath+ File.separator+"src"+File.separator+"app10_school_file"
				+File.separator+"student.csv";
		System.out.println(filePath);
		try {
			br= new BufferedReader(new FileReader(filePath));
			
			String data;
			//더 이상 읽을게 없을 때 br.read()는 -1이 반환됨
			while((data=br.readLine())!= null) {
				//System.out.println(data);
				lines.add(new String(data));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//file은 항상 닫아줘야 하므로 finally로 처리
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
    //파일에서 읽어온 데이터를 리스트에 담는다.
	public void addAll() {
		for(String s: lines) {
			//System.out.println(s);
			//1. split을 하고 스트링 배열
			String[] columns=s.split(",");
			//김다혜,컴퓨터공학,90,20,80
			//2. 스트링배열로 student객체를 만든다.(trim으로 자르면서)
			MajorType majorType=MajorType.valueOf(columns[1].trim().toUpperCase());
			int score1=Integer.parseInt(columns[2].trim()); //workaround 대강코드
			int score2=Integer.parseInt(columns[3].trim());
			int score3=Integer.parseInt(columns[4].trim());
			Score score=new Score(score1,score2,score3);
			Student student=new Student(columns[0].trim(),majorType,score);
					
			//3. 객체를 list에 add한다.
			studentList.add(student);
			
		}
	}
	public void print() {
			for(String s: lines) {
				System.out.println(s);
			}
	}

	public void printList() {
		for(Student s:studentList ) {
			System.out.println(s);
		}
	}

	public void avg() {
		for(Student s:studentList ) {
		s.avg();
		}
		
	}

	public void sort() {
		Collections.sort(studentList);
		}

	public void writeFile() {
		BufferedWriter bw=null;

		String basePath=System.getProperty("user.dir");
		String filePath=basePath+ File.separator+"src"+File.separator+"app10_school_file"
				+File.separator+"studentAvg.csv";
		System.out.println(filePath);
		
		try {
			bw= new BufferedWriter(new FileWriter(filePath));
			for(Student s: studentList) {
				bw.write(s.toString()+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
		