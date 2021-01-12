//���
//1. �̸� String
//2. �ټӿ��� year int
//3. ������
//4. info():������� ���
//5. �߻�Ŭ������ �����
//6. �߻�޼��� �����:calculateSalary()
package app08_empolyee_abstract;

public abstract class Employee {
	private String name; //�ڽ� Ŭ���������� ������ �ȵ�.
	protected int years;  //�ڽ�Ŭ���������� ������ ��
	
	public Employee() {}
	public Employee(String name, int year) {
		this.name=name;
		this.years=years;
		
	}
	String info(){
		return String.format("%10s %3d",name,years);
	//System.out.printf("%10s %3d %n",name,years);
	}
	abstract int calculateSlary();

}
