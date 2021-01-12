package java8_project;
public class TV { //슈퍼클래스 TV선언
    private int size;

    public TV(int size) { //인수가 있는 메소드 선언
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
 }


 class ColorTV extends TV { //서브 클래스 선언
    public int color;

    public ColorTV(int size, int color) { //생성자 메소드 선언
        super(size);//상위 클래스의 생성자를 호출
        this.color = color;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치 " + color + "컬러"); //출력
    }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024); //인수가 있는 객체 선언
        myTV.printProperty();
    }
 }


 class IPTV extends ColorTV { //서브 클래스 IPTV선언
    String address;

    public IPTV(String address, int size, int color) { //생성자 메소드 선언
        super(size, color); //상위 클래스의 생성자를 호출
        this.address = address; 
    }

    public void printProperty() {
    	
        System.out.println("나의 IPTV는 " + address + " 주소의 " + getSize() + "인치 " + color + "컬러"); //출력
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //192.1.1.2 주소의 32인치 2048컬러
        iptv.printProperty();
    }
 }

 
 