//�ð�ó��
//UTC:�ð�������:1970�� 1�� 1�Ϻ��� �ð�. ���н� �ð�
//UTC 1970�� 1�� 1�� 00:00:00:00.000�� �������� ���� �׸���ġ õ���� 
//Epoch, POSIX �ð����� �θ��⵵ �Ѵ�.
//�ð��� long���� �ٷ��.

package lec14_utilPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeApp {

	public static void main(String[] args) {
		long time; //8byte. 1/1000�� ����
		time=System.currentTimeMillis(); //���н� ���� �ð�. ��������
		System.out.println(time);
		Date date= new Date(time);//�����ð����� ��ȯ�Ǿ ����. �ѱ�����
		System.out.println(date);
		
		//format�� �༭ �ٲٴ� ���
		//M:month, m:minute
		SimpleDateFormat dayTime=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str=dayTime.format(new Date(time));
		System.out.println(str);
		
		//������ �� �� �ɸ��� �ð��� ��� ������
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num=sc.nextInt();
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}

}
