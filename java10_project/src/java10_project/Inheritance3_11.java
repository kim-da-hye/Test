package java10_project;

public class Inheritance3_11{

	public static void main(String[] args) {
		int array[]=new int[10];
		
		System.out.println("\n\n호출 전 배열의 값");
		for(int i=0;i<array.length;i++)
		array[i]=i;
		
		for(int index=0;index<array.length; index++)
			System.out.println(""+array[index]);
		
		System.out.println("\n\n호출 후 배열의 값");
		pro(array);
		for(int index=0;index<array.length; index++)
			System.out.println(""+array[index]);
		
	}
	
	
	public static void pro(int arr[]) {
		for(int i=0;i<arr.length; i++)
			arr[i]=i+3;
	
	}
	
}
