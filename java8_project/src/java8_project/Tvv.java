package java8_project;
class TVs{ // TVŬ���� ����
	private String brand;
	private int year;
	private int inch;
	TVs(String brand, int year, int inch){
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		
		System.out.println(brand+"���� ����" +year+"����" +inch+"��ġ TV");
		
	}
}
public class Tvv {
	public static void main(String[] args) {
	TVs myTV=new TVs("LG",2017,32);
	myTV.show();
	}
}
