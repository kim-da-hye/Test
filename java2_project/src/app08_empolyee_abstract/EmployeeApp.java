//직원급여계산프로그램
//1.직원생성
//2.직원출력
//3.급여계산

package app08_empolyee_abstract;


public class EmployeeApp {//이름,근속연수,논문수/계약건수,부서
	static String[][] db= {{"shin","3","10","Research"},
			{"kim","3","5","Marketing"},
			{"Lee","2","4","Research"},
			{"Park","10","8","Marketing"},
	};
	
	public static void main(String[] args) {
		EmployeeTask et= new EmployeeTask();
		
		
		//1.직원 생성
		et.makeList(db);
		//2.직원출력
		et.printList();
		//3.급여계산
		et.calculateSalary();
		
	}

}
