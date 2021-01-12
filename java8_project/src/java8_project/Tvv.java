package java8_project;
class TVs{ // TV클래스 선언
	private String brand;
	private int year;
	private int inch;
	TVs(String brand, int year, int inch){
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		
		System.out.println(brand+"에서 만든" +year+"년형" +inch+"인치 TV");
		
	}
}
public class Tvv {
	public static void main(String[] args) {
	TVs myTV=new TVs("LG",2017,32);
	myTV.show();
	}
}
