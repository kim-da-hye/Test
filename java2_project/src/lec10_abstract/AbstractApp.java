//�߻�Ŭ����
//�߻�޼��带 �ϳ� �̻� ���� ������ �߻�Ŭ����
//�Ѱ� �̻��� �߻� �޼��带 ���������� �߻�Ŭ������ �����ؾ���
//����:������Ŭ���ٴ� �⺻���� Ʋ�� ����

//�߻�޼����?
//����θ� �����ϰ� ������ ���� �޼���
//�߻�޼����� ������ �������̵�(�ڽ���)
package lec10_abstract;

abstract class Cellphone{
	//����������
	boolean poweron =false;
	//�߻�޼���:abstract(Ű����)
	//���� �ϸ��. �ٵ�� �ʿ����. {}����.
	abstract void poweron();
	
	
}
class Samsung extends Cellphone{

	@Override
	void poweron() {
		System.out.println("���̵� Ű�� �����ϴ�");
	}
	
}
class Iphone extends Cellphone{

	@Override
	void poweron() {
		System.out.println("Ȩ��ư�� �����ϴ�");
	}
	
}

public class AbstractApp {
	static void poweronCellphone(Cellphone c) {
		//�߻�Ŭ������ ������ �ڽ�Ŭ������ ��ü�� ���� �� �ִ�.
		c.poweron();
		
	}

	public static void main(String[] args) {
		//Cellphone cellphone=new Cellphone(); ERROR! �߻�Ŭ������ ��ü�� ����� ����.
		Iphone iphone =new Iphone();
		Samsung samsung=new Samsung();
		Cellphone cellphone1 =new Iphone();
		//�߻�Ŭ������ ������ �ڽ�Ŭ������ ��ü�� ���� �� �ִ�.
		Cellphone cellphone2 =new Samsung();
		
		poweronCellphone(samsung);
		poweronCellphone(iphone);
	}

}
