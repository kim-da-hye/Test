//���� Ŭ����:������ ���� ���� �˰���
//���ڰ�(seed ����)������ ���� ��ȯ��
//���� ���尡 ������ �׻� ���� ���� ��ȯ�ϹǷ� ������ �ƴϰ� �ǹǷ� ����!
//���������� ó�� �θ��� �ٸ����� �ֵ��� ���������� ����
//�޼���
//nextInt:������ int �� ��ȯ
//nextInt(int n):0���� ũ��n ���� ���� int �� ��ȯ
package lec12_utilpackage;

import java.util.Random;

public class RondomApp {

	public static void main(String[] args) {
		//Random():���� �ð��� ���ڰ����� �ν��Ͻ� ����
		Random rand= new Random();
		
		//Random(long seed):seed�� ���ڰ����� �ν��Ͻ� ����

		Random rand2= new Random(0);
		Random rand3= new Random(0);
		
		for(int i=0;i<5; i++) {
			System.out.println(rand.nextInt(100));//0���� ũ�� 100���� ���� ������ ����
		}
		System.out.println("���� ������ ����");
		for(int i=0;i<5; i++) {
			System.out.println(rand2.nextInt(100));//0���� ũ�� 100���� ���� ������ ����
			System.out.println(rand3.nextInt(100));//0���� ũ�� 100���� ���� ������ ����
		}
		

	}

}
