//����ڷκ��� 10���� ����(����)�� �Է¹޾� �Ʒ��� ���� Ǯ��
//#1 ����ڷκ��� ���� 10���� �������� ���(Scanner,array,for)
//#2 �ִ밪 ���ϱ�(for,if)
//#3 ū ������� �����ϱ�(���� for)
//#4 "���α׷��� �����մϴ�"����ϰ� ���α׷� ����

package app01_apps;

import java.util.Scanner;

public class ArrayNumbersApp {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System. in);
		int[]numbers=new int[10];
		//0.�Է�
		System.out.println("10���� ������ �Է��ϼ���");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		//1.���
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("%d ", numbers[i]);
		}
		for(int n: numbers) {
			System.out.printf("%d ",n);
		}
		System.out.println();
		
		//2.�ִ밪 ���ϱ�
		int max=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max)max=numbers[i];
			
		}
		
		System.out.println("�ִ밪: "+max);
		
		//3.ū ������� �����ϱ�
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				System.out.printf("i= %d,j=%d",i,j);
				if(numbers[i]<numbers[j]) {
					System.out.printf("if�� ���� i= %d,j=%d",i,j);
					int temp= numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			
			}System.out.println();
			
		}
		for(int n: numbers) {
			System.out.printf("%d ",n);
		}
		

	}

}
