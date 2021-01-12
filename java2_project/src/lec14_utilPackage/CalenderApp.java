//Calender
//Calender 클래스는  Singletone Design으로 정의되었음.
//생성자로 Calender 인스턴스를 만들수없다.
//getInstance()메소드로 인스턴스를 만든다.
package lec14_utilPackage;

import java.util.Calendar;

public class CalenderApp {

	public static void main(String[] args) {
		//오늘 날짜
		Calendar today=Calendar.getInstance();//싱클톤 패턴
		System.out.println(today);
		//get()메서드로 정보 가져오기
		int year=today.get(Calendar.YEAR);
		System.out.println(year);
		int month=today.get(Calendar.MONTH)+1; //달이 0부터 시작
		System.out.println(month );
		int date=today.get(Calendar.DATE);
		System.out.println(date);
		
		//날짜 특정
		Calendar endOfYear=Calendar.getInstance();
		endOfYear.set(Calendar.MONTH, 11); //12월
		endOfYear.set(Calendar.DATE, 31);  //31일
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지"+diff/(1000*60*60*24));
	}

}
