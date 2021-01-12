package java3_project;

public class CompareTo {

	public static void main(String[] args) {
		int compareValue;
		
		//비교 문자 a
		String str = "Java Programming Very Good";
		//비교 문자 b
		String str2 = "JAva Programming";
		

		System.out.println("[compareTo() 메소드로 문자열 비교 ]");
		
		//compareTo()메소드를 이용 a.compareTo(b) 형식
		compareValue = str.compareTo(str2);

		System.out.println("비교 결과 : " + compareValue);

		}
		

		
	}


