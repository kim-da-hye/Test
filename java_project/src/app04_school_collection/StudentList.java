package app04_school_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

	//��� ����
     ArrayList<Student> studentList = new ArrayList<>();//�迭�� �޸� ������ �� �ʿ� ����. ����.
     
     //������
     StudentList(){
    	 //�ʱ�ȭ
    	 Student student1=new Student(20190001,"������","����");
    	 studentList.add(student1);
    	 studentList.add(new Student(20190002,"�̰���","�濵"));
    	 studentList.add(new Student(20190003,"�����","�İ�"));
    	 System.out.println(studentList);
    	 
     }
     
     int getNumber(String message) {
 		System.out.println(message);
 		Scanner sc =new Scanner (System. in);
 		int num=Integer.parseInt(sc.nextLine());
 		
 		return num;
 	}
    
     //�޼����
      String getString(String message) {
 		System.out.println(message);
 		Scanner sc =new Scanner (System. in);
 		String text=sc.nextLine();
 		
 		return text;
 	}
      
 	void printList() {
		//���� for�� ����ϱ�
		for(Student s: studentList) {
			System.out.print(s.getId()+" ");
			System.out.print(s.getName()+" ");
			System.out.print(s.getMajor());
			System.out.println();
		}
	}
	void addList() {
		int num=getNumber("id�� �Է��ϼ���");
		String name=getString("�̸��� �Է��ϼ���");
		String major=getString("������ �Է��ϼ���");
		
		studentList.add(new Student(num,name,major));
	}
	void deleteList() {
		//1.����ڿ��� ������ id�� �Է¹޴´�.(int�� ���)
		int num=getNumber("������ id�� �Է��ϼ���");
		//2.������ id�� ã�Ƽ� ������ ��� �����Ǿ����ϴ�.�� ���
		//collection�� ����for���� ����ϴ°��� ����
		boolean flag=false;
		for(Student s: studentList ) {
			if(num==s.getId()) {
				studentList.remove(s);
				System.out.println("��û�Ͻ� id�� �����Ͽ����ϴ�.");
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("id�� �������� �ʽ��ϴ�");
		}
		//3.�߸� �Էµ� ��� id�� �����ϴ�.�� ���
		
	}

}
