//��ǥ:����for-�ݺ�(������ ���ڸ�ŭ)
//���� for�� :for�� ���� for��
//���� for������ �ٱ� for���� ��(row)�� �ǹ�
//���� for���� ��(column)�� ��Ÿ����

package lec03_flow_control;

public class For {

	public static void main(String[] args) {
		
		//for(�ʱ�ȭ;���ǽ�;������)
		//{������ ���ε��� �����ϴ� ��}
		//�������� ���� ����� ������ ����ȴ�.
		for(int i=0;i<10;i++) {
			System.out.println(i+"��° �˶��Դϴ�");
			
		}
		int k=0;
		for(; k<10;) {
			System.out.println(k+"��° �˶��Դϴ�");
			k++;
		}
		
		//���� for��
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("(%2d,%2d)",i,j);
			}
			System.out.println();
		}
		//quiz: ������ ���
		for(int i=1;i<10;i++) {
			for(int j=1;j<10; j++) {
				System.out.printf("%d*%d=%2d  ",i,j,i*j);
			}
			System.out.println();
		}
	}

}
