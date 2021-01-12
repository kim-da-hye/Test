package app04_school_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

	//멤버 변수
     ArrayList<Student> studentList = new ArrayList<>();//배열과 달리 사이즈 줄 필요 없음. 동적.
     
     //생성자
     StudentList(){
    	 //초기화
    	 Student student1=new Student(20190001,"소유진","경제");
    	 studentList.add(student1);
    	 studentList.add(new Student(20190002,"이고은","경영"));
    	 studentList.add(new Student(20190003,"김다혜","컴공"));
    	 System.out.println(studentList);
    	 
     }
     
     int getNumber(String message) {
 		System.out.println(message);
 		Scanner sc =new Scanner (System. in);
 		int num=Integer.parseInt(sc.nextLine());
 		
 		return num;
 	}
    
     //메서드들
      String getString(String message) {
 		System.out.println(message);
 		Scanner sc =new Scanner (System. in);
 		String text=sc.nextLine();
 		
 		return text;
 	}
      
 	void printList() {
		//향상된 for문 사용하기
		for(Student s: studentList) {
			System.out.print(s.getId()+" ");
			System.out.print(s.getName()+" ");
			System.out.print(s.getMajor());
			System.out.println();
		}
	}
	void addList() {
		int num=getNumber("id를 입력하세요");
		String name=getString("이름을 입력하세요");
		String major=getString("전공을 입력하세요");
		
		studentList.add(new Student(num,name,major));
	}
	void deleteList() {
		//1.사용자에게 삭제할 id를 입력받는다.(int로 출력)
		int num=getNumber("삭제할 id를 입력하세요");
		//2.동일한 id를 찾아서 삭제한 경우 삭제되었습니다.를 출력
		//collection은 향상된for문을 사용하는것이 좋음
		boolean flag=false;
		for(Student s: studentList ) {
			if(num==s.getId()) {
				studentList.remove(s);
				System.out.println("요청하신 id를 삭제하였습니다.");
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("id가 존재하지 않습니다");
		}
		//3.잘목 입력된 경우 id가 없습니다.를 출력
		
	}

}
