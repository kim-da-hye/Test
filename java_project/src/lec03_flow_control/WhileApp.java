//���:while,break,continue
//While:���ѹݺ�
//break:�ݺ��� ����
//continue:�ݺ��� ���� ���� ��ŵ,�� �ݺ����� �� ���ΰ�
package lec03_flow_control;

public class WhileApp {

	public static void main(String[] args) {
		//while(���ǽ�){���ǹ��� ���϶� ����}
		//10���� �˶��� �︮�� ���α׷�
		int i=10;
		while(i<10) {
			System.out.println(i+"��° �˶��Դϴ�");	
			i++;//���ǽ��� ������Ѿ��ϴ� ������ �ݵ�� �ʿ���
				}
		System.out.println(i );
		//continue,break
		i=0;
		while(true) {
		i++;//continue���� �Ʒ��� ���� �����̾ȵǹǷ� ���� �ݺ�
			if(i%3==0)//3�� ����϶�
				continue;//��ŵ: �Ʒ� ������ �������� ����
			System.out.println(i+"��° �˶��Դϴ�" );
			if(i>10) 
				break;//�ݺ��� Ż��. ���ѹݺ��������� �ݵ�� break�������
			
			
		}
		
		//do while ��� �ѹ��� �����. ���ǹ� �Ʒ� �����ϱ�
		i=0;
		do {
			System.out.println(i+"��° �˶��Դϴ�" );
			i++;
		}while(i<10);
	}

}
