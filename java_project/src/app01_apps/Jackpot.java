// console app: Jackpot(777)
// Jackpot�� ���������� slot machine �����
// ��ǥ: random app, while, break,flow control
// math.random():�ڵ����� �ʱ�ȭ ��.0~1������ ���� ������
// java.util.Random():�ڵ����� �ʱ�ȭ��. �ʱ�ȭ �������. ������ ��������
// random number: 0~7���� �߻�

package app01_apps;

import java.util.Random;
import java.util.Scanner;

public class Jackpot {

	public static void main(String[] args) {
		while(true) {
			System.out.println("�ѹ� �� �Ͻðڽ��ϱ�? y:��� n:����");
			Scanner sc =new Scanner (System. in);
			char gostop=sc.next().charAt(0);
			if(gostop=='n')break;
			
			Random rand=new Random();
			for(int i=0; i<3; i++) {
				System.out.println(rand.nextInt(8));
			}
		}System.out.println("���α׷��� �����մϴ�.");
		
		
	}

}
