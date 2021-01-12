package java6_project;

interface Base아르바이트 { //Base아르바이트 인터페이스 선언
	int base = 300000;
	public int 아르바이트();
 }
 interface RoleBonus { //RoleBonus 인터페이스 선언
	 public int sudang( int role1, int role2);
 }
 interface Bonus extends Base아르바이트, RoleBonus {// 확장된 인터페이스 선언
 }
 class Wolgup implements Bonus { //Bonus 인터페이스를 구현한  Wolgup 클래스 선언
	 int role1, wolgup;
	 String rolename;

	 public int 아르바이트() { //객체 생성자 //메소드에 대한 구현
		 return base;
 }
	 public int sudang(int role1, int wolgup) { //메소드에 대한 구현
		 return (wolgup/2)/role1;
 } 
	 public int totalwolgup(int role1, int wolgup) { //메소드에 대한 구현
		 return wolgup + 아르바이트() +sudang(role1, wolgup);
	 }
 }

class InterfaceEx6 { // InfaceTest 클래스 선언
	 public static void main(String args[]) {
		 System.out.println("-->인터페이스를 이용한 응용 실습<--");
		 
		 int tatalwolgup1;
		 Wolgup sawon = new Wolgup(); //객체 선언
		 sawon.role1 = 2;
		 sawon.rolename = "자바 개발자";
		 sawon.wolgup = 2000000;
		 tatalwolgup1 = sawon.totalwolgup(sawon.role1, sawon.wolgup); //메소드의 호출
		 System.out.println(sawon.rolename+" ： "+ tatalwolgup1); //결과 값의 출력
		 System.out.println();
	 }
 } 
