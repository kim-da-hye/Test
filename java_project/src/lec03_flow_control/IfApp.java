//���#1  :if
package lec03_flow_control;

public class IfApp {

	public static void main(String[] args) {
		
		//	if�� #1
		int count=20;
		//���� if(���ǽ�) {���ǽ��� ���� �� ����}
		//{} :�� ���� 
		if (count >10 ) {
			System.out.println("���ڰ� 10�� �ʰ��Ͽ����ϴ�. ");
		}
		// if else�� #2
		//���� if(���ǽ�) {���ǽ��� ���� �� ����}
		//    else { ���ǽ��� ���̾ƴ� �� ����}
		count =9; 
		if (count >10 ) {
			System.out.println("���ڰ� 10�� �ʰ��Ͽ����ϴ�. ");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ�:  "+ count);
			
		}
		
		//if else if �� #3
		if(count>10) {
			System.out.println("���ڰ� 20�� �ʰ��Ͽ����ϴ�");
		}else if(count>10) {
			System.out.println("���ڰ� 20���� �۰� 10�� �ʰ��Ͽ����ϴ�");
		}else {
			System.out.println("10�� �ʰ����� �ʽ��ϴ�");
		}
		
		

	}

}
