package java8_project;

public class MyPoint { //클래스  mypoint 선언
	private int x, y;
	
	public MyPoint(int x, int y) { //인수가 있는 생성자 선언
		this.x = x;
		this.y = y;
	}
	
	public String toString() { // toString() 이용
		
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object p) { //equals()사용
		MyPoint po = (MyPoint)p;
		if(x == po.x && y == po.y)
			return true; 
		else
			return false;
	}
	public static void main(String [] args) {
		MyPoint p = new MyPoint(3, 50); //인수가 있는 객체 선언
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p); //p 출력
		if(p.equals(q)) // equal()이용
			System.out.println("같은 점");
		else //그렇지 않으면
			System.out.println("다른 점");			
	}
}
