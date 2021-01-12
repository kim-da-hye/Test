//��� inheritance(���� ��Ӹ� ����)
//����̶� ���ο� Ŭ������ �ۼ��Ҷ� ������ �����ϴ� Ŭ������ �����޾� �̿��ϴ°�.
//�θ�Ŭ����(����Ŭ����)
//�ڽ�Ŭ����(�ڼ�Ŭ����)
//���Ŭ������ ������ object

package lec07_inheritance;

//�θ�Ŭ����
class Person{
	String name;//�������
	//��� �޼���
	//Person(){} �⺻ �����ڸ� ����� ���� ���ص� �����Ϸ��� �ڵ����� ��������.
	void printName() {
		System.out.println("�� �̸���:" +name);
	}
}
//����: �ڽ�Ŭ���� extends �θ�Ŭ����
class Child extends Person{
	String major;
	void setName(String myName) {
		//�ڽ��� �θ��� ��� �Ӽ��� �����ޱ� ������. copy�ѰͰ� ����
		name=myName;
	}
	void learn() {
		System.out.println(major+"�� �����մϴ�.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//��ü ����
		Person person =new Person();
		Child child =new Child();
		person.printName();
		child.printName(); //������ ���� ������ ��밡��. �θ��� �Ӽ�(����,�޼���)�� �����ޱ� ������
		person.name="�����";
		child.major="�İ�";
		person.printName();
		child.printName(); //�ν��Ͻ� �����̹Ƿ� �θ�� �����ϴ� ���� �ƴϴ�.
		child.name="�����2";
		child.printName();
		child.setName("�����3");
		child.printName();
		child.learn();
	}

}
