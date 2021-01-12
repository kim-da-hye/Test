//employApp에서 호출하는 기능를 구현하는 class
//이 class에서 관리해야하는 데이터 타입:ArrayList로 선언
package app08_empolyee_abstract;
//String[][] db= {{"shin","3","10","Research"},
//{"kim","3","5","Marketing"},
//{"Lee","2","4","Research"},
//{"Park","10","8","Marketing"},

import java.util.ArrayList;

public class EmployeeTask {
    //멤버 변수
	ArrayList<Employee> employeeList;
	//생성자
	public EmployeeTask() {
		employeeList=new ArrayList<>();
		
	}
	public void makeList(String[][] db) {
		//향상된 for문
		//for문을 돌면서 메케팅과 연구직 클래스를 만들어서 employeeList에 추가
		for(String[] line: db) {
			if(line[3].equals("Marketing")) {
				//객체를 만든다
				Marketing m= new Marketing(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				//employeeList에 추가
				employeeList.add(m);
			}else {
				//객체를 만든다
				//employeeList에 추가
				employeeList.add(new Research(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2])));
			}
			System.out.println(line[0]+line[1]+line[2]+line[3]);
			
			System.out.println();
		}
	}

	public void printList() {
		System.out.println(String.format("%10s %3s %3s", "name","years","numOfContracts/papers"));
		for(Employee e:employeeList) {
			System.out.println(e.info());
		}
	}

	public void calculateSalary() {
		for(Employee e:employeeList) {
			System.out.println(e.info()+"  "+e.calculateSlary());
	}

 }
}
