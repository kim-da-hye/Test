//��������
//����� ���
//1.�� ���� numOfPapers intŸ��
//������
//�޼ҵ� �������̵�:years * 40 + numOfPapers *10

package app08_empolyee_abstract;

public class Research extends Employee {
	int numOfPapers;

	public Research() {}
	public Research(String name, int years, int numOfPapers) {
		super(name,years);
		this.numOfPapers=numOfPapers;
	}
	@Override
	int calculateSlary() {
		
		return (super.years*40 + numOfPapers*10);
	}
	String info() {
		return super.info()+String.format("%3d", numOfPapers);
	}
}
