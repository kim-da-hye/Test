//제어문:switch
package lec03_flow_control;

public class SwitchApp {

	public static void main(String[] args) {
		int mileage=2000;
		int degit=mileage /1000;
		
		System.out.println(degit );
		
		//switch(정수또는 문자)
		switch(degit) {
		case 3://digit==3
		System.out.println("마일리지가 3000이상입니다. 쿠폰 과인센티브 사용가능합니다" );
		break;//switch문을  빠져 나감
		case 2://digit==2
			System.out.println("마일리지가 2000이상입니다. 쿠폰 사용가능합니다" );
			break;//switch문을 빠져 나감
		default://그밖에
			System.out.println("마일리지가 2000이 안되네요. 2000이상만 쿠폰 사용가능합니다" );
		}
		
	}

}
