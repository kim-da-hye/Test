//Math�� �̿��� Random �� ��� �ǽ�
package java6_project;

public class RandomMath {

	public static void main(String[] args) {
		
		System.out.println("-->Math�� �̿��� Random �� �ǽ� ���");
		//range:0.0~1.0(exclusive)
		double randomValue =Math.random(); // Math�� random() �Լ��� ���� ����
		int intValue =(int)(randomValue * 100)+1; // 100���Ϸ� ������ ��ȯ
		System.out.println(intValue); //�� ���
		System.out.println();

	}

}
