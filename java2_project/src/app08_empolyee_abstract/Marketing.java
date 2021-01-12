//������ ����
//1.���Ǽ� numOfContracts
//��� employee
//������
//�޼��� �������̵�:������� =�ټӿ���*30+numOfContracts*100

package app08_empolyee_abstract;

public class Marketing extends Employee {

	int numOfContracts;
	//private String name;
	//private int years;
	public Marketing() {}
	public Marketing(String name, int years, int numOfContracts) {
		super(name,years);//super():�θ��� ������
		this.numOfContracts=numOfContracts;
		
	}
	
	//����� Ŭ������ �߻�޼��带 �������̵带 �ؾ���(�����ؾ���)
	@Override
	int calculateSlary() {
		return (super.years*30 + numOfContracts*100);
	}
	String info() {
		return super.info()+String.format("%3d", numOfContracts);
	}

}
