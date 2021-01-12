//예외처리 Exception Handling
//에러
//1.컴파일 에러
//2.런타임 에러
//2.1 회복불가능한 에러
//2.2 회복가능한 에러: Exception
//예외란 프로그램 실행중에 발생하는 오류중에서 처리가능한것
//예외처리란 예외가 발생하였을때 이를 적절히 처리하여 프로그램을 비정상적으로 종료하는 것을 피함. 정상종료.
//try catch //예외를 처리
//finally: 예외가 나든 말든 무조건 실행되는 구문

//NullPointerException :객체 참조가 없는 상태.  즉,null값을 갖는 변수(참조)로 객체에 접근하려고 할때 null.name
//ArrayIndexOutOfBoundsException:배열에서 인덱스 범위를 초과하여 사용하는 경우 발생 arr[3]
//NumberFormatException:String을 int로 바꾸는 경우 숫자가 아닌 다름 값이 String에 있는 경우
package lec13_exception;

import java.util.ArrayList;
import java.util.Scanner;

class ExceptionType{
	//자바에서 상수
	final static int NullPointerException=1;
	final static int ArrayIndexOutOfBoundsException=2;
	final static int NumberFormatException=3;
}
public class TryCatchApp {

	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("메뉴를 선택하세요.1.null pointer 2. outof index 3. numberformat 9. 종료");
			int menu=sc.nextInt();
			if(menu==9) break;
			switch(menu) {
			case ExceptionType.NullPointerException:
				try {
					ArrayList<Integer> list=null;
					list.add(10);
				}
				catch(NullPointerException e){
					System.out.println(e.getMessage());
					e.printStackTrace();
					System.out.println("null로 접근하여 오류가 발생하였습니다.");
				}
				
				break;
			case ExceptionType.ArrayIndexOutOfBoundsException:
				try {
				int[] num_array= {1,3,5};
				num_array[3]=4;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
					System.out.println("배열 인덱스를 초과하였습니다");
				}
				break;
			case ExceptionType.NumberFormatException:
				try {
				int num=Integer.parseInt("3ois");
				}catch(Exception e) {//NumberFormatException은 Exception을 상속
					System.out.println(e.getMessage());
					System.out.println("숫자형식에 맞지 않는 스트링입니다.");
				}finally {//무조건 실행 예외이든 아니든
					System.out.println("프로그램이 계속됩니다.");
				}
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}

}
