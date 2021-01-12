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
	//��� ����
	
	//���Ͽ��� �о�� �����͸� �����ϴ� ����
	ArrayList<String> lines =new ArrayList<>();
	//ArrayList �л��� �����ϴ� ����Ʈ ����
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
			//�� �̻� ������ ���� �� br.read()�� -1�� ��ȯ��
			while((data=br.readLine())!= null) {
				//System.out.println(data);
				lines.add(new String(data));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//file�� �׻� �ݾ���� �ϹǷ� finally�� ó��
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
    //���Ͽ��� �о�� �����͸� ����Ʈ�� ��´�.
	public void addAll() {
		for(String s: lines) {
			//System.out.println(s);
			//1. split�� �ϰ� ��Ʈ�� �迭
			String[] columns=s.split(",");
			//�����,��ǻ�Ͱ���,90,20,80
			//2. ��Ʈ���迭�� student��ü�� �����.(trim���� �ڸ��鼭)
			MajorType majorType=MajorType.valueOf(columns[1].trim().toUpperCase());
			int score1=Integer.parseInt(columns[2].trim()); //workaround �밭�ڵ�
			int score2=Integer.parseInt(columns[3].trim());
			int score3=Integer.parseInt(columns[4].trim());
			Score score=new Score(score1,score2,score3);
			Student student=new Student(columns[0].trim(),majorType,score);
					
			//3. ��ü�� list�� add�Ѵ�.
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
		