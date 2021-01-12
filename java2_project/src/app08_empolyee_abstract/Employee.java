//사원
//1. 이름 String
//2. 근속연수 year int
//3. 생성자
//4. info():멤버변수 출력
//5. 추상클래스로 만들기
//6. 추상메서드 만들기:calculateSalary()
package app08_empolyee_abstract;

public abstract class Employee {
	private String name; //자식 클래스에서도 접근이 안됨.
	protected int years;  //자식클래스에서만 접근이 됨
	
	public Employee() {}
	public Employee(String name, int year) {
		this.name=name;
		this.years=years;
		
	}
	String info(){
		return String.format("%10s %3d",name,years);
	//System.out.printf("%10s %3d %n",name,years);
	}
	abstract int calculateSlary();

}
