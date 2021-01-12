//java.time 패키지 : 날짜와 시간을 다루기 위해 추가된 패키지 JDK1.8

package lec14_utilPackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeApp {

	public static void main(String[] args) {
		localDate();
		localTime();
		localDateTime();
		zoneDateTime();
		diffDays();
		diffTime();

	}

	private static void diffTime() {
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt2 = ldt.minusHours(2).minusMinutes(3).plusSeconds(20);
		System.out.println(ldt);
		System.out.println(ldt2);
	}

	private static void diffDays() {
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = ld.minusYears(2).minusMonths(1).plusDays(3);
		System.out.println(ld);
		System.out.println(ld2);
	}

	private static void zoneDateTime() {
		//Timezone
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(zdt);
	}

	private static void localDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime myDateTime = LocalDateTime.of(2019, 12, 31, 1, 22, 20);//overloading
		System.out.println(localDateTime);
		System.out.println(myDateTime);
	}

	private static void localTime() {
		//시간
		LocalTime localTime = LocalTime.now();
		LocalTime myTime = LocalTime.of(13, 22,20);
		System.out.println(localTime);
		System.out.println(myTime);
		
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
	}

	private static void localDate() {
		//날짜 
		LocalDate localDate = LocalDate.now(); //현재날짜 정보
		LocalDate myDate = LocalDate.of(2020, 12, 31); //특정날짜 지정, 년,월,일
		System.out.println(localDate);
		System.out.println(myDate);
		
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.isLeapYear()); 
	}

}
