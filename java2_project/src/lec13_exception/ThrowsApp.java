//예외 던지기: 예외가 발생했을때 예외를 처리하지 않고 자신을 호출한 쪽으로 예외를 넘기는 것
package lec13_exception;

public class ThrowsApp {

	
	public static void main(String[] args) {
		int[] numArr= {1,2,3};
		int index=4;
	    try {
			getvalue(numArr, index);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("예외가 발생하여 프로그램이 종료됩니다");
		}
		
	}
	//throw Exception
	private static int getvalue(int[] arr, int index) throws Exception {
		int value =arr[index];
		return value;
	}

}
