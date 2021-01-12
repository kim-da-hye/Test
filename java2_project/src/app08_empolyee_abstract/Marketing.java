//마케팅 직군
//1.계약건수 numOfContracts
//상속 employee
//생성자
//메서드 오버라이드:연봉계산 =근속연수*30+numOfContracts*100

package app08_empolyee_abstract;

public class Marketing extends Employee {

	int numOfContracts;
	//private String name;
	//private int years;
	public Marketing() {}
	public Marketing(String name, int years, int numOfContracts) {
		super(name,years);//super():부모의 생성자
		this.numOfContracts=numOfContracts;
		
	}
	
	//상속한 클래스의 추상메서드를 오버라이드를 해야함(정의해야함)
	@Override
	int calculateSlary() {
		return (super.years*30 + numOfContracts*100);
	}
	String info() {
		return super.info()+String.format("%3d", numOfContracts);
	}

}
