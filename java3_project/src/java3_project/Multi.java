package java3_project;

public class Multi {
	
	public static void main(String[] args) {
		
	int[][] multi = new int[10][10]; //2차원 배열 선언과 생성
	
	System.out.println("*****구구단*****");
	//중첩된 for문
	for(int i=1;i<multi.length;i++) {
		for(int j=1;j<multi[i].length; j++) { 
			
			//multi에 할당
			multi[i][j]=i*j;
			
			//구구단 출력
			System.out.printf("%d*%d= %2d  ",i,j,multi[i][j]);
			
			
					}
		System.out.println();
	}
  }
}
