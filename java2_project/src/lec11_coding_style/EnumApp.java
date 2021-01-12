//enum
//����� �׷��� ��Ÿ���� ���
//���ŵ� ������ ���� 0���� �������� ����. ���ʴ�� ������
//enum���������� ������ ����� ��� �빮�ڷ� ���(�������� ������ �ƴ�)
//�ڹٿ����� enum�� ������ ����� ����:����,�޼���,�����ڸ� �߰�.������ ����� ���� Ŭ����
//���뼺:������ ������ Ÿ�� ���� (Enumerated Date Type)
//enum�� Ŭ������ ����Ͽ� ���������� ���ǵǾ�, enum�� ��ӹ޴´�.

package lec11_coding_style;

//enum����
enum Year{
	FRESHMAN,SOPHOMORE,JUNIOR,SENIOR
}

//����������
//class Year
//{
//	final int freaman=1; �̷��� ���� ����
//	public static Year FRESHMAN=new Year(); 
//	public static Year SOPHOMORE=new Year(); 
//	public static Year JUNIOR=new Year(); 
//	public static Year SNEIOR=new Year(); 
//}

enum Major{
	MATH,ART,LAW,BIOLOGY;
}

class Student{
	String name;
	Major major;
	Year year;
	
	//������
	public Student() {}
	public Student(String name, Major major, Year year) {
		this.name=name;
		this.major=major;
		this.year=year;
		
	}
	@Override
	//print�Ҷ� �ڵ����� ȣ��
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", year=" + year + "]";
	}
	
}

public class EnumApp {

	public static void main(String[] args) {
		Student student =new Student();
		System.out.println(student);
		Student student2 =new Student("kimdahye",Major.BIOLOGY,Year.SENIOR);
		System.out.println(student2);
		
		//enum �޼��� Ȱ��
		//values():enum�ȿ� �ִ� ��� ���� ��ȯ
		Year[] years=Year.values();
		for(Year y: years) {
			System.out.println(y);
		}
		//valueof():��Ʈ���� �ָ� ����� ��Ʈ���� ��ȯ
		Year year =Year.valueOf("FRESHMAN");
		System.out.println(year);
		
		Year y=student2.year;
		switch(y) {
		case FRESHMAN:
			System.out.println("welcome to college");
			break;
		case SOPHOMORE:
			System.out.println("know how to do");
			break;
		case JUNIOR:
			System.out.println("focus on working");
			break;
		case SENIOR:
			System.out.println("ready for society");
			break;
		
		}
		//ordinal():�迭�� �ε���ó�� enum��� �ε����� ã���� �ִ�.
		for(Year ye: Year.values()) {
			System.out.println(ye+": ");
			System.out.println(ye.ordinal());
		}
		makeStudent();
		
	}

	private static void makeStudent() {
		String[] DB= {"shin","MATH","JUNIOR"};
		//Student ��ü�� ����� ������ valueofȰ��
		String name=DB[0];
		Major major=Major.valueOf("MATH");
		Year year=Year.valueOf("JUNIOR");
		Student student=new Student(name,major,year);
		System.out.println(student);
		
	}

}
