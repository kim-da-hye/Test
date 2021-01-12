//Date 클래스:대부분의 메서드와 생성자가 사용되지 않음. Deprecated. 일부만 사용.
package lec14_utilPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateApp {

	public static void main(String[] args) {
		//date 생성
		Date date=new Date();
		System.out.println(date);
		
		//date 생성 #2 long type의 UTC로 만들수 있음
		long time= System.currentTimeMillis();
		Date date2=new Date(time);
		System.out.println(date2);
		
		//date 생성 #3 Calendar 이용
		Calendar cal=Calendar.getInstance();
		Date date3=cal.getTime();
		System.out.println(date3);
		
		//date 출력방법
		SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd");
		SimpleDateFormat sdf2=new SimpleDateFormat("E요일HH시mm분ss초");
		String str1=sdf1.format(new Date());
		String str2=sdf2.format(new Date());
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
