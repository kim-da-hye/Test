package java6_project;

interface Base�Ƹ�����Ʈ { //Base�Ƹ�����Ʈ �������̽� ����
	int base = 300000;
	public int �Ƹ�����Ʈ();
 }
 interface RoleBonus { //RoleBonus �������̽� ����
	 public int sudang( int role1, int role2);
 }
 interface Bonus extends Base�Ƹ�����Ʈ, RoleBonus {// Ȯ��� �������̽� ����
 }
 class Wolgup implements Bonus { //Bonus �������̽��� ������  Wolgup Ŭ���� ����
	 int role1, wolgup;
	 String rolename;

	 public int �Ƹ�����Ʈ() { //��ü ������ //�޼ҵ忡 ���� ����
		 return base;
 }
	 public int sudang(int role1, int wolgup) { //�޼ҵ忡 ���� ����
		 return (wolgup/2)/role1;
 } 
	 public int totalwolgup(int role1, int wolgup) { //�޼ҵ忡 ���� ����
		 return wolgup + �Ƹ�����Ʈ() +sudang(role1, wolgup);
	 }
 }

class InterfaceEx6 { // InfaceTest Ŭ���� ����
	 public static void main(String args[]) {
		 System.out.println("-->�������̽��� �̿��� ���� �ǽ�<--");
		 
		 int tatalwolgup1;
		 Wolgup sawon = new Wolgup(); //��ü ����
		 sawon.role1 = 2;
		 sawon.rolename = "�ڹ� ������";
		 sawon.wolgup = 2000000;
		 tatalwolgup1 = sawon.totalwolgup(sawon.role1, sawon.wolgup); //�޼ҵ��� ȣ��
		 System.out.println(sawon.rolename+" �� "+ tatalwolgup1); //��� ���� ���
		 System.out.println();
	 }
 } 
