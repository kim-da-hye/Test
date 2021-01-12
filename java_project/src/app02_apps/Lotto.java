//console App:Lotto 번호 생성
//특징:6자리 1부터 45까지.중복 안됨
//math.random():자동으로 초기화 됨.0~1사이의 값을 생성함
//math.random()은 클래스 메서드.객체를 생성하지않고 메서드를 사용
//java.util.Random():자동으로 초기화됨. 초기화 방법제공. 값범위 지정가능
package app02_apps;

public class Lotto {

	//random number만들기 1부터10까지
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
			int num=(int)(Math.random()*MAX)+1;//1부터45까지
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
			int num=(int)(Math.random()*MAX)+1;//1부터45까지
			//중복여부 확인
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(num==lotto[j]) {
					flag=true;
					System.out.println("중복"+lotto[j]+","+num);
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
		//generateRandomNumber();//랜덤번호 발생
		//generatePseudoLotto();//중복허용
		generateLotto();//중복회피
	}
}

