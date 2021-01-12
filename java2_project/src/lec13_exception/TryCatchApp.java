//����ó�� Exception Handling
//����
//1.������ ����
//2.��Ÿ�� ����
//2.1 ȸ���Ұ����� ����
//2.2 ȸ�������� ����: Exception
//���ܶ� ���α׷� �����߿� �߻��ϴ� �����߿��� ó�������Ѱ�
//����ó���� ���ܰ� �߻��Ͽ����� �̸� ������ ó���Ͽ� ���α׷��� ������������ �����ϴ� ���� ����. ��������.
//try catch //���ܸ� ó��
//finally: ���ܰ� ���� ���� ������ ����Ǵ� ����

//NullPointerException :��ü ������ ���� ����.  ��,null���� ���� ����(����)�� ��ü�� �����Ϸ��� �Ҷ� null.name
//ArrayIndexOutOfBoundsException:�迭���� �ε��� ������ �ʰ��Ͽ� ����ϴ� ��� �߻� arr[3]
//NumberFormatException:String�� int�� �ٲٴ� ��� ���ڰ� �ƴ� �ٸ� ���� String�� �ִ� ���
package lec13_exception;

import java.util.ArrayList;
import java.util.Scanner;

class ExceptionType{
	//�ڹٿ��� ���
	final static int NullPointerException=1;
	final static int ArrayIndexOutOfBoundsException=2;
	final static int NumberFormatException=3;
}
public class TryCatchApp {

	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("�޴��� �����ϼ���.1.null pointer 2. outof index 3. numberformat 9. ����");
			int menu=sc.nextInt();
			if(menu==9) break;
			switch(menu) {
			case ExceptionType.NullPointerException:
				try {
					ArrayList<Integer> list=null;
					list.add(10);
				}
				catch(NullPointerException e){
					System.out.println(e.getMessage());
					e.printStackTrace();
					System.out.println("null�� �����Ͽ� ������ �߻��Ͽ����ϴ�.");
				}
				
				break;
			case ExceptionType.ArrayIndexOutOfBoundsException:
				try {
				int[] num_array= {1,3,5};
				num_array[3]=4;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
					System.out.println("�迭 �ε����� �ʰ��Ͽ����ϴ�");
				}
				break;
			case ExceptionType.NumberFormatException:
				try {
				int num=Integer.parseInt("3ois");
				}catch(Exception e) {//NumberFormatException�� Exception�� ���
					System.out.println(e.getMessage());
					System.out.println("�������Ŀ� ���� �ʴ� ��Ʈ���Դϴ�.");
				}finally {//������ ���� �����̵� �ƴϵ�
					System.out.println("���α׷��� ��ӵ˴ϴ�.");
				}
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�");
	}

}
