//�迭
//���� �ϳ��� ���� �����͸� �ѹ��� ����
//�迭�� ��� ������ ������ ����
//������ ������ ������ ����Ǵ� �� �ƴ϶� �ּҰ� �������� �ǹ�
//������ ������ ��: �迭, ��Ʈ��, Ŭ����
package lec04_array;

public class ArrayNum {

	public static void main(String[] args) {
		//�迭�� �ʿ��� ������ �˾ƺ���
		int member1,member2,member3,member4;
		member1=10;
		member2=20;
		member3=30;
		member4=40;
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member4);
		
		//�迭����
		//�ʱ�ȭ�� ���ϴ� ��� ���������� �⺻������ �ʱ�ȭ�� ��
		//#1
		int[]product; //�迭���� ����. ���� ����
		product=new int[10]; //���� �ǹ��� ����Ǵ� ����
		
		//�⺻�ڷ����� ��
		int num;
		num=10;
		
		//#2 ����� �ʱ�ȭ�� ���ÿ�. 0���� �ʱ�ȭ
		//10���� ���ҷ� �� �迭
		//new int [�迭�� ũ��]
		//new�� �θ��� object ����
		int[] numbers=new int[10];
		
		//#3 ����� �ʱ�ȭ�� �� ����
		int[] numbers2=new int[] {10,20,30,40};
		
		//�ε���:0���� ����
		//�迭�� ���ҿ� ����,����
		System.out.println(numbers2[0]);
		numbers2[0]=100;
		System.out.println(numbers2[0]);
		
		//for ���� ���� �迭�� ���� ����
		for(int i=0;i<numbers2.length;i++) {
			numbers2[i] +=1000;
		}
		
		
		//for ���� ���� ���
		for(int i=0;i<numbers2.length;i++) {
		System.out.printf("%d ",numbers2[i]);
		}System.out.println();
	
		//����for��:�������� �ִ�.
		for(int number: numbers2) {
		System.out.println("���� for��"+number);
		}
		//index ���� ���ǻ���:������ ����� ��Ÿ�� ����:��Ÿ���߿� �߻�
		int count=5;
		//length=4�̸�index:0,1,2,3
		System.out.println("�迭�� ũ��:"+numbers2.length);
		//ArrayIndexOutOfBoundsException
//            for(int i=0;i<count ;i++) {
//			System.out.printf("%d ",numbers2[i]);
//			}
		
	
		//������ �迭
		int [][]stock=new int[][] {{10,20,30},{20,40,50}};
		for(int i=0;i<stock.length;i++) {
			for (int j=0;j<stock[0].length;j++) {
				System.out.printf("stock[%d][%d]=%d  ",i,j,stock[i][j]);
			}
			System.out.println();
		}
		
		
		
	
	}

}
