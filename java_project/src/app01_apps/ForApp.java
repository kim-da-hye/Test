//For���� Ȱ���� �������� ����
//#1 1���� 10������ ¦��(2�� ���)�� ��
//#2 1���� 10������ 2�� ����̰ų� 3�� ����� ��
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

//For���� Ȱ���� �������� ����
//#1 1���� 10������ ¦��(2�ǹ��)�� ��:2+4+6+8+10
//#2 1���� 10������ 2�� ����̰ų� 3�� ����� ��:2+3+4+6+8+9+10
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

		//#1 1���� 10������ ¦��(2�ǹ��)�� ��:2+4+6+8+10
		int sum =0;
		for (int i=0; i <11 ; i++){
			if (i%2==0) sum +=i;
		}
		System.out.println(sum);
		//#2 1���� 10������ 2�� ����̰ų� 3�� ����� ��:2+3+4+6+8+9+10
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





