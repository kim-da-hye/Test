//console App:Lotto ��ȣ ����
//Ư¡:6�ڸ� 1���� 45����.�ߺ� �ȵ�
//math.random():�ڵ����� �ʱ�ȭ ��.0~1������ ���� ������
//math.random()�� Ŭ���� �޼���.��ü�� ���������ʰ� �޼��带 ���
//java.util.Random():�ڵ����� �ʱ�ȭ��. �ʱ�ȭ �������. ������ ��������
package app02_apps;

public class Lotto {

	//random number����� 1����10����
	//0*10+1 <rand*10+1 <1*10+1
	public static void generateRandomNumber() {
		double rand=Math.random();
	    System.out.println(rand);
	    int num= (int)(rand*10 )+1;
	    System.out.println(num);
	}
	public static void generatePseudoLotto() {
		final int LOTTO_LEN=6;
		final int MAX=45;
		int[]lotto=new int [LOTTO_LEN];
		for(int i=0;i<LOTTO_LEN;i++) {
			int num=(int)(Math.random()*MAX)+1;//1����45����
			lotto[i]=num;
		}
		for(int i=0;i<LOTTO_LEN;i++) {
			System.out.println(lotto[i]+" ");
		}
		
	}
	public static void generateLotto(){
		final int LOTTO_LEN=6;
		final int MAX=45;
		int[]lotto=new int [LOTTO_LEN];
		for(int i=0;i<LOTTO_LEN; ) {
			int num=(int)(Math.random()*MAX)+1;//1����45����
			//�ߺ����� Ȯ��
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(num==lotto[j]) {
					flag=true;
					System.out.println("�ߺ�"+lotto[j]+","+num);
					break;
				}
			}
			if(!flag) {
			lotto[i]=num;
			i++;
			}
		}
		
		
		
		for(int i=0;i<LOTTO_LEN;i++) {
			System.out.println(lotto[i]+" ");
		}
	}

	public static void main(String[] args) {
		//generateRandomNumber();//������ȣ �߻�
		//generatePseudoLotto();//�ߺ����
		generateLotto();//�ߺ�ȸ��
	}
}

