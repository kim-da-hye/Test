//For문을 활용한 여러가지 문제
//#1 1부터 10까지의 짝수(2의 배수)의 합
//#2 1부터 10까지의 2의 배수이거나 3의 배수의 합
/*#3
*1 0 0 0
*0 1 0 0
*0 0 1 0
*0 0 0 1
*/
/*4
 * 
 * *
 * * *
 * * * *
 * * * * *
 */

//For문을 활용한 여러가지 문제
//#1 1부터 10까지의 짝수(2의배수)의 합:2+4+6+8+10
//#2 1부터 10까지의 2의 배수이거나 3의 배수의 합:2+3+4+6+8+9+10
/*#3
 * 1 0 0 0
 * 0 1 0 0
 * 0 0 1 0
 * 0 0 0 1
 */
/*#4
  *
  * *
  * * *
  * * * *
  * * * * * 
 */
package app01_apps;

public class ForApp {

	public static void main(String[] args) {

		//#1 1부터 10까지의 짝수(2의배수)의 합:2+4+6+8+10
		int sum =0;
		for (int i=0; i <11 ; i++){
			if (i%2==0) sum +=i;
		}
		System.out.println(sum);
		//#2 1부터 10까지의 2의 배수이거나 3의 배수의 합:2+3+4+6+8+9+10
		sum =0;
		for (int i=0; i <11 ; i++) {
			if (i%2==0 || i%3==0) sum +=i;
		}
		System.out.println(sum);
		//#3 
		for (int i=0; i <4 ; i++) {
			for (int j=0 ; j <4 ; j++) {
				if( i==j )
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
		}
		//#4 
		for (int i=0; i<5 ; i++) {
			for (int j=0; j<i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}





