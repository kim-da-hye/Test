//���� �б�->ArrayList�� ����
//csv: comma separated values ��ǥ�� �и��Ȱ��� ������ ����(�������� ����)
//�л���� ���α׷�
//�л������� ���Ͽ� ����Ǿ� �ִ�.
//0.0. �б�(���Ͽ���)
//0.1. ����Ʈ�����
//1. ���
//2. ����(option)
//3. ��հ��
//4. ����(��ճ�����������)
//5. ��ձ��� ���ļ� ���Ͽ� ����

package app10_school_file;

public class FileSchoolApp {

	public static void main(String[] args) {
		StudentsTask st=new StudentsTask(); 
		st.readFile(); //���Ͽ��� �о ��Ʈ�� ����Ʈ�� ����
		st.print(); //��Ʈ�� ����Ʈ�� ����� �����͸� ���
		st.addAll(); //��Ʈ�� ����Ʈ�� ����� ��Ʈ���� Ŭ���� ����Ʈ�� ����
		//st.printList(); //Ŭ���� ����Ʈ�� ����� ������ ���
		st.avg();       //��հ��
		//st.printList(); //Ŭ���� ����Ʈ�� ����� ������ ���
		st.sort(); //avg��.
		st.printList(); //Ŭ���� ����Ʈ�� ����� ������ ���
		st.writeFile();
	}

}
