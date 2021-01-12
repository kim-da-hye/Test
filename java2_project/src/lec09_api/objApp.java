//API:Application Programming Interface
//�����ڵ��� ���� �⺻������ �����ϴ� Ŭ����(import�ʿ����)
//System.out.println() �޼������ java.lang ��Ű���� ���������� ������ API����
//��������Ʈ: https://docs.oracle.com/javase/8/docs/api/

//object Ŭ����: ��� Ŭ������ ����, �ֻ����θ�
//����������� 11���� �޼��尡 ����
//extends�� ��� �ڵ����� ��ӵ�
//�ֿ� �޼����;
//clone():�ν��Ͻ� ����, �ʵ尪�� ����(���� ����)
//equals():�⺻������==�͵��ϰ�ü�� �ּҰ��� ������true
//���� Ŭ������ ����� ��� �������� ��������(������ ������)���ϱ����ؼ�override �������
//hashcode():�ؽ��ڵ带 ��ȯ�ϴ� �޼���
//�ؽ��ڵ�: ��ü�� �����ϴ� ������ ������ ��ü�� �޸𸮹����� �̿��Ͽ� �ؽ��ڵ带 ���� (�޺��� �ּҿ� ���ٰ� �����)
//hashmap ���� �ΰ�ü�� �������� �Ǵ��Ҷ� �ؽ��ڵ带 ����ϱ� ������
//toString(): ��ü�� �ּҸ�string ���� ��ȯ ��Ű���� Ŭ�������ּ� (16����)
//printlnȣ���Ҷ� toString ()��ȯ���� ���
//��Ŭ���� ���� ����ؼ� override�Ҷ� hashcode(),toString(),equals()����

package lec09_api;
//extends����� �ڵ����� Object����ӵ�

class ObjectChild{
	
	String name;
	int score;
	
	ObjectChild(){}
	ObjectChild(String name,int score){
		this.name=name;
		this.score=score;
	}
}

public class objApp {
		static void objectChildMethod() {
			ObjectChild child1=new ObjectChild("shin",90);//child1��child2�� ��ü�� �ٸ���
			ObjectChild child2=new ObjectChild("shin",90);
			ObjectChild child3=child1; //��ü�� ����
			System.out.println(child1);//toString()�� �Ҹ� override ���߱� ������ ObjectŬ������ �޼��尡 �Ҹ�
			String name1=new String("shin");
			String name2=new String("shin");
			System.out.println(name1);
			
			//hashcode():�޸��� �ּҷ� �ؼ��ص� �� �̰� ������ ��ü�� ���ٰ� �����
			System.out.println(Integer.toHexString(child1.hashCode()));
			System.out.println(child1==child2); //false ��ü�� �ٸ��ϱ�
			System.out.println(child1==child3); //true ��ü�� �����ϱ�
			System.out.println(child1.equals(child2));//false==�Ͱ���(object�� �޼����̹Ƿ�)
			System.out.println(child1.equals(child3));//true ��ü�� �����Ƿ� ==�ص� ����
			
			
			System.out.println(name1 == name2); //false��ü�� �ٸ��ϱ�
			System.out.println(name1.equals(name2)); //������ ��true(equal()�� override�����Ƿ�)
		}

	
static void overrideChildMethod() {
	
		OverrideChild child1=new OverrideChild("shin",90);//child1��child2�� ��ü�� �ٸ���
		OverrideChild child2=new OverrideChild("shin",90);
		OverrideChild child3=child1; //��ü�� ����
		System.out.println(child1);//toString()�� �Ҹ� override ���߱� ������ ObjectŬ������ �޼��尡 �Ҹ�
		String name1=new String("shin");
		String name2=new String("shin");
		System.out.println(name1);
		
		//hashcode():�޸��� �ּҷ� �ؼ��ص� �� �̰� ������ ��ü�� ���ٰ� �����
		System.out.println(Integer.toHexString(child1.hashCode()));
		System.out.println(child1==child2); //false ��ü�� �ٸ��ϱ�
		System.out.println(child1==child3); //true ��ü�� �����ϱ�
		System.out.println(child1.equals(child2));//true.equals()�� override�����Ƿ�
		System.out.println(child1.equals(child3));//true��ü�� �����Ƿ� ==�ص�����.
		
		
		System.out.println(name1 == name2); //false��ü�� �ٸ��ϱ�
		System.out.println(name1.equals(name2)); //������ ��true(equal()�� override�����Ƿ�)
	
}

	public static void main(String[] args) {
		//objectChildMethod();
		overrideChildMethod();
	}

}
