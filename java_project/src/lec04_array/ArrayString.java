//��ǥ:��Ʈ�� �迭
//��Ʈ��: ������ ����
//�迭: ������ ����

package lec04_array;

public class ArrayString {

	public static void main(String[] args) {
		//�迭 ����
		//�������� String�� ��� ����� �޸𸮸� �Ҵ��ϰ� �̸� ������ ��������
		//�ʱ�ȭ�����ʴ� ��� ���������� �ڵ����� �⺻��("")���� �ʱ�ȭ��
		String[] texts;//�迭�� �����ϴ� ���� ����
		texts=new String[10];//���� String������ ����Ǵ� ���� ����
		
		//���� ��������� �迭���� ������ �Ѳ�����
		String[] members= new String[10];
		
		//����� ���� �ʱ�ȭ�ϴ� ��� �迭�� ũ�⸦ �����ؾ���
		String[] titles= new String[] {"�ڽ���","ȣ����ǿ���","���ѻ꼺"};
		
		//�迭�� ���̿� �ε���
		System.out.println(titles.length);
		System.out.println(titles[0]);
		titles[0]="�ڹ��� ����";
		
		//���
		for(int i=0;i<titles.length;i++) {
			System.out.println(titles[i]);
		}
		//���� for��
		for(String s: titles ) {
			System.out.println(s);
		}
	}

}
