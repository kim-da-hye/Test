//��ǥ: ���������� Ȱ��
//���������ڸ� �̿��Ͽ� ĸ��ȭ(��������) encapsulation
//��������� �ܺ�(�ٸ� Ŭ����)�޼� ���� ������ �� ������ ĸ��ȭ
//��, �ٸ� Ŭ�������� �����Ҷ� setter,getter�޼ҵ带 ���� ���� ���� �ϵ��� �Ѵ�.
//�л��� �Ӽ�:
//1.�й�
//2.�̸�
//3.����
package app04_school_collection;

public class Student {
	private int id;//�й�
	private String name;//�̸�
	private String major;//����
	
	//������ ����
	//�⺻ ������
	public Student() {}
	public Student(int id, String name, String major) {
		this.id=id;
		this.name=name;
		this.major=major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
