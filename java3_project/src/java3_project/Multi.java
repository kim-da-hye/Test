package java3_project;

public class Multi {
	
	public static void main(String[] args) {
		
	int[][] multi = new int[10][10]; //2���� �迭 ����� ����
	
	System.out.println("*****������*****");
	//��ø�� for��
	for(int i=1;i<multi.length;i++) {
		for(int j=1;j<multi[i].length; j++) { 
			
			//multi�� �Ҵ�
			multi[i][j]=i*j;
			
			//������ ���
			System.out.printf("%d*%d= %2d  ",i,j,multi[i][j]);
			
			
					}
		System.out.println();
	}
  }
}
