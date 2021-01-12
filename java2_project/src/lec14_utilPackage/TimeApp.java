//시간처리
//UTC:시간기준점:1970년 1월 1일부터 시간. 유닉스 시간
//UTC 1970년 1월 1일 00:00:00:00.000을 기준으로 영국 그리니치 천문대 
//Epoch, POSIX 시간으로 부르기도 한다.
//시간을 long으로 다룬다.

package lec14_utilPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeApp {

	public static void main(String[] args) {
		long time; //8byte. 1/1000초 단위
		time=System.currentTimeMillis(); //유닉스 기준 시간. 영국기준
		System.out.println(time);
		Date date= new Date(time);//지역시간으로 젼환되어서 나옴. 한국기준
		System.out.println(date);
		
		//format을 줘서 바꾸는 방법
		//M:month, m:minute
		SimpleDateFormat dayTime=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str=dayTime.format(new Date(time));
		System.out.println(str);
		
		//연산을 할 때 걸리는 시간을 재고 싶을때
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}

}
