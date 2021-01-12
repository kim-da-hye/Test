//목표:스트링 배열
//스트링: 참조형 변수
//배열: 참조형 변수

package lec04_array;

public class ArrayString {

	public static void main(String[] args) {
		//배열 선언
		//여러개의 String을 묶어서 사용할 메모리를 할당하고 이를 참조할 변수선언
		//초기화하지않는 경우 내부적으로 자동으로 기본값("")으로 초기화됨
		String[] texts;//배열을 참조하는 변수 선언
		texts=new String[10];//실제 String값들이 저장되는 공간 생성
		
		//참조 변수선언과 배열공간 생성을 한꺼번에
		String[] members= new String[10];
		
		//선언과 동시 초기화하는 경우 배열의 크기를 생략해야함
		String[] titles= new String[] {"코스모스","호모사피엔스","북한산성"};
		
		//배열의 길이와 인덱스
		System.out.println(titles.length);
		System.out.println(titles[0]);
		titles[0]="자바의 정석";
		
		//출력
		for(int i=0;i<titles.length;i++) {
			System.out.println(titles[i]);
		}
		//향상된 for문
		for(String s: titles ) {
			System.out.println(s);
		}
	}

}
