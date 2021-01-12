//1. Car�� Product�� ����Ѵ�.
//2. Car�� ������ �Ӽ��� �����Ѵ�.
//    2.1 ��ⷮ(2000cc) engine
//    2.2 ��ÿ���(��⵵��) year
package app05_car_inheritance;

class Car extends Product{

	//��� ���� ����
	int engine;
	int year;
	//������ ����
	public Car(int price, String model, String maker, int engine, int year) {
		super(price,model,maker);
		this.engine=engine;
		this.year=year;
		
	}
	//setter(),getter()�� ����(��Ŭ���� ��� ��� ����)
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
	//toString()����(��Ŭ���� ��� ��� ����)
	
	public String info() {
		return super.info()+", engine="+engine +", year"+year;
	
	}
	
}
