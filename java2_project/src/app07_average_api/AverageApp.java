//�̸�,��������,���������� ���ڿ� �迭�� ������
//��ü�� ���� �̸��� ArrayList�� ����
//�� �л��� ����� ���ض�

//������ Ǫ�� ����
//1.Student��� class�����
//2.StudentTask��� class�����(main���� �θ��� �Լ����� ����)
//3.main������
//1)���ڿ� �迭�� �о StudentTask�� �޼ҵ带 �̿��ؼ� ( StudentTask�ȿ��� ArrayList ����)
//2)���
//3)��� ���
//4)��� ���
package app07_average_api;



public class AverageApp {
	
	static String[] data= {"shin, 100, 90", "lee, 90, 20", "kim, 80, 70", "park, 100, 99"};
	public static void main(String[] args) {
		System.out.println("test");
		StudentTask st=new StudentTask();
		
		//1. data�� �о �߰�
		st.add(data);
		//2. �л�����  ���� ���
		st.print();
		//3. ��� ���
		st.setAvg();
		//4. ��� ���
		st.printAvg();
	}

}
