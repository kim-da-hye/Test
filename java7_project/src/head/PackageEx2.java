//������ ������ ����� �ҽ��� package�� �ϰ� ó�� �ϴ� �ý���
package head;

import first.First;
import second.Second;
import third.Third;

class PackageEx2 {
	public static void main(String[] args) {
		System.out.println("18102039 ����� �Դϴ�!!");
		First one = new First(); //�ٸ� ���α׷��� Ŭ������ ���� ��ü�� ����
		one.�ϳ�(); //�ٸ� Ŭ���� �ȿ� �ִ� �޼ҵ� ȣ��
		Second two = new Second(); //�ٸ� ���α׷��� Ŭ������ ���� ��ü�� ����
		two.��(); //�ٸ� Ŭ���� �ȿ� �ִ� �޼ҵ� ȣ��
		Third three = new Third(); //�ٸ� ���α׷��� Ŭ������ ���� ��ü�� ����
		three.��(); //�ٸ� Ŭ���� �ȿ� �ִ� �޼ҵ� ȣ��
	}
}
