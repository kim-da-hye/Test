//�����޿�������α׷�
//1.��������
//2.�������
//3.�޿����

package app08_empolyee_abstract;


public class EmployeeApp {//�̸�,�ټӿ���,����/���Ǽ�,�μ�
	static String[][] db= {{"shin","3","10","Research"},
			{"kim","3","5","Marketing"},
			{"Lee","2","4","Research"},
			{"Park","10","8","Marketing"},
	};
	
	public static void main(String[] args) {
		EmployeeTask et= new EmployeeTask();
		
		
		//1.���� ����
		et.makeList(db);
		//2.�������
		et.printList();
		//3.�޿����
		et.calculateSalary();
		
	}

}
