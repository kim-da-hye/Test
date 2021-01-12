//employApp���� ȣ���ϴ� ��ɸ� �����ϴ� class
//�� class���� �����ؾ��ϴ� ������ Ÿ��:ArrayList�� ����
package app08_empolyee_abstract;
//String[][] db= {{"shin","3","10","Research"},
//{"kim","3","5","Marketing"},
//{"Lee","2","4","Research"},
//{"Park","10","8","Marketing"},

import java.util.ArrayList;

public class EmployeeTask {
    //��� ����
	ArrayList<Employee> employeeList;
	//������
	public EmployeeTask() {
		employeeList=new ArrayList<>();
		
	}
	public void makeList(String[][] db) {
		//���� for��
		//for���� ���鼭 �����ð� ������ Ŭ������ ���� employeeList�� �߰�
		for(String[] line: db) {
			if(line[3].equals("Marketing")) {
				//��ü�� �����
				Marketing m= new Marketing(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				//employeeList�� �߰�
				employeeList.add(m);
			}else {
				//��ü�� �����
				//employeeList�� �߰�
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
