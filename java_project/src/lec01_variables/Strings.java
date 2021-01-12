//��ǥ: ������ ���� string ����
//������ ������ ���ٶ���ǹ�
//����� new�� ����������� ������� �ʾ��� �� ����
//equals():�����ϰ� �մ� ��ü�� ������ ������
//System.identityHashCode():�����ϰ� �ִ� ��ü�� �ּ�

package lec01_variables;

public class Strings {

	public static void main(String[] args) {
		
		//String ���� ��Ģ:String�� �ν��Ͻ��� �����ؾ� �ϹǷ� new�� �޸��� ���� Ȯ��
		String str=new String("Hello World");
		
		//String �ܼ� ����: �⺻�ڷ���ó�� ����. ���Ǹ� ���Ѱ���. ȿ���� ���� �ٸ�.
		String text="�ڹ�";
		text="��Ʈ���� ������ ������ ��ü�̹Ƿ� ���ڿ��� �۾��Ҷ����� �ν��Ͻ��� ���� �����ϰ� �ؾ� �մϴ�";
		
		//�⺻���� ���ٴ� �ǹ�
		int num1=10;
		int num2=10;
		System.out.println(num1==num2);
		
		//new�� ����Ͽ� String�� ������ ��
		String angel1=new String("angel");
		String angel2=new String("angel");
		System.out.println(angel1==angel2);//�ּҰ� �ٸ��Ƿ� (�ٸ� ��ü�� ����Ű�Ƿ�) false
		System.out.println(System.identityHashCode(angel1));
		System.out.println(System.identityHashCode(angel2));
		System.out.println(angel1.equals(angel2));//������ ������ üũ�ϹǷ� true
		
		
		//�ܼ� �������� String ������ ��  
	    String name1="angel";//�����Ͻ� ������ ���ͷ� ���(�� ��ü,= ���) ���
	    String name2="angel";//���ͷ��� ����ϹǷ� ������ �ּ�
	    System.out.println(name1==name2);//�ּҰ� �����Ƿ� (���� ��ü�� ����Ű�Ƿ�) true
	    System.out.println(System.identityHashCode(name1));
	    System.out.println(System.identityHashCode(name2));
	    System.out.println(name1.equals(name2));//������ ������ üũ�ϹǷ� true
	}

}
