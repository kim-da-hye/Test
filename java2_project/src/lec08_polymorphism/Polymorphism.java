//���⼺�̶�
//�������¸� ������ ����: �������̵�,�����ε�
//���⼺�� �Ѱ��� Ÿ���� �������� ������ �ν��Ͻ��� ���� ���ִٴ� �ǹ�
//�θ�Ÿ���� ������ ��� �ڽ� �ν��Ͻ��� �����Ҽ�����

//class Person
//name,address (String type)
//������ �ΰ���(�⺻,parameter), ��¸޼���(printInfo())

package lec08_polymorphism;

import java.util.ArrayList;

class Person{
	String name;
	String address;
	
	Person(){}
	
	Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	void printInfo() {
		System.out.println("�̸�: "+name);
		System.out.println("�ּ�: "+address);
		
		
	}
}

//��ӹ޴� Student
//major �߰� (String)
//������(�⺻,parameter),learn()(�������)

class Student extends Person{
	String major;
	Student(){}
	Student (String name,String address,String major){
		super(name,address);
		this.major=major;
	}
	void learn() {
		System.out.println(major+"�� �����մϴ�.");
	}
	void printInfo() {//override
		super.printInfo();
		learn();
	}
	
}

//��ӹ޴� Teacher
//subject �߰�
//������ (�⺻,parameter),teach() (���� ���)
class Teacher extends Person{
	String subject;
	Teacher(){}
	Teacher(String name,String address,String subject){
		super(name,address);
		this.subject=subject;
	}
	void teach() {
		System.out.println(subject+"�� ����Ĩ�ϴ�");
	}
	void printInfo() { //override
		super.printInfo();
		teach();
	}
}



public class Polymorphism {
	static void printInfo(Person person) {
		//person��  student ,teacher�� ���ڷ� ���� �� �ִ�.
		//override�� �ϱ� ������ �ڽ��� �޼ҵ尡 �Ҹ�
		person.printInfo();
		
		//������ instanceof
//		if(person instanceof Student) {
//			Student s=(Student)person;
//			s.learn();
//		}
//		else if(person instanceof Teacher) {
//			((Teacher)person).teach();
//		}
	}
	
	static void printClass() {
		Person person =new Person("�����","����");
		Student student=new Student("�賲��","����","����");
		Teacher teacher=new Teacher("����ȣ","����","�߱�");
		
		//������ �θ��� ������������ �ڽ��� �ν��Ͻ��� ���� �� �� �ִ�.
		Person person1=student;
		person1.address="���";
		Person person2=teacher;
		person2.name="�����";
		
		//�ڽ� Ÿ���� ������ �θ��� �ν��Ͻ��� ���� �� �� ����.
		//�ڽ��� �Ӽ����� ������ �� ���� ������ (�θ𿡴� ���� �Ӽ��� �ڽĿ��� �ֱ� ������)
		//Student student2=person; ERROR!
		//student2.major  ERROR!
		printInfo(student);
		printInfo(teacher);
	}
	static void makeList() {
		ArrayList<Person> personList=new ArrayList<>();
		personList.add(new Student("kim","korea","computer"));
		personList.add(new Student("shin","korea","computer"));
		personList.add(new Teacher("lee","korea","art"));
		personList.add(new Teacher("John","UK","economic"));
		
		//���� for��
		for(Person p: personList) {
			p.printInfo();
		}
		
		
	}
	public static void main(String[] args) {
		//printClass();
		makeList();
		//quiz:makeList()��� �޼��带 ����
		//ArrayList�� ����ϴ�.Generic: Person type
		//Student 2���� ���� ArrayList�� add
		//Teacher 2���� ����  ArrayList�� add
		//ArraList�� �ִ� �����͸� ��� ����ϼ���
		
	}

}
