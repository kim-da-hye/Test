//���� ������: ���ܰ� �߻������� ���ܸ� ó������ �ʰ� �ڽ��� ȣ���� ������ ���ܸ� �ѱ�� ��
package lec13_exception;

public class ThrowsApp {

	
	public static void main(String[] args) {
		int[] numArr= {1,2,3};
		int index=4;
	    try {
			getvalue(numArr, index);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("���ܰ� �߻��Ͽ� ���α׷��� ����˴ϴ�");
		}
		
	}
	//throw Exception
	private static int getvalue(int[] arr, int index) throws Exception {
		int value =arr[index];
		return value;
	}

}
