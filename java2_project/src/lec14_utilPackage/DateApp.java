//Date Ŭ����:��κ��� �޼���� �����ڰ� ������ ����. Deprecated. �Ϻθ� ���.
package lec14_utilPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateApp {

	public static void main(String[] args) {
		//date ����
		Date date=new Date();
		System.out.println(date);
		
		//date ���� #2 long type�� UTC�� ����� ����
		long time= System.currentTimeMillis();
		Date date2=new Date(time);
		System.out.println(date2);
		
		//date ���� #3 Calendar �̿�
		Calendar cal=Calendar.getInstance();
		Date date3=cal.getTime();
		System.out.println(date3);
		
		//date ��¹��
		SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd");
		SimpleDateFormat sdf2=new SimpleDateFormat("E����HH��mm��ss��");
		String str1=sdf1.format(new Date());
		String str2=sdf2.format(new Date());
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
