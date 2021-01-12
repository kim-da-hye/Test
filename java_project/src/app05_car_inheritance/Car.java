//1. Car는 Product을 상속한다.
//2. Car는 고유한 속성을 정의한다.
//    2.1 배기량(2000cc) engine
//    2.2 출시연도(몇년도산) year
package app05_car_inheritance;

class Car extends Product{

	//멤버 변수 선언
	int engine;
	int year;
	//생성자 정의
	public Car(int price, String model, String maker, int engine, int year) {
		super(price,model,maker);
		this.engine=engine;
		this.year=year;
		
	}
	//setter(),getter()를 정의(이클립스 기능 사용 가능)
	public int getEngine() {
		return engine;
	}
	
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//toString()정의(이클립스 기능 사용 가능)
	
	public String info() {
		return super.info()+", engine="+engine +", year"+year;
	
	}
	
}
