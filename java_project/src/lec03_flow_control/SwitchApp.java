//���:switch
package lec03_flow_control;

public class SwitchApp {

	public static void main(String[] args) {
		int mileage=2000;
		int degit=mileage /1000;
		
		System.out.println(degit );
		
		//switch(�����Ǵ� ����)
		switch(degit) {
		case 3://digit==3
		System.out.println("���ϸ����� 3000�̻��Դϴ�. ���� ���μ�Ƽ�� ��밡���մϴ�" );
		break;//switch����  ���� ����
		case 2://digit==2
			System.out.println("���ϸ����� 2000�̻��Դϴ�. ���� ��밡���մϴ�" );
			break;//switch���� ���� ����
		default://�׹ۿ�
			System.out.println("���ϸ����� 2000�� �ȵǳ׿�. 2000�̻� ���� ��밡���մϴ�" );
		}
		
	}

}
