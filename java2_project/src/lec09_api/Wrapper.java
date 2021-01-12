//Wrapper Ŭ����: �ڹ��� �⺻�ڷ������� ��ü�� �ٷ�µ� ���
//����: �ڹٰ� �����ϴ� �޼��� �̿� ����
//Boolean,Character,Byte,Short,Integer,Long,Double,Float
//Ŭ������ ����ؾ� �ϹǷ� ��ü(�ν��Ͻ�)�� �����ؼ� ����ؾ���
//Autoboxing<->Autounboxing
//����ڽ�:�⺻�ڷ����� �ڵ����� ��ü�� �ڷ������� ��ȯ : int->Integer
//�����ڽ�:��ü�� �ڷ������� �ڵ����� �⺻�ڷ������� ��ȯ: Integer->int
package lec09_api;

public class Wrapper {

	public static void main(String[] args) {
		//Integer ����
		Integer objNum1=new Integer(10);
		int num1=10;
		
		//����ڽ�:int->Integer �� �ڵ���ȯ.  new Integer()�ʿ����
		Integer objNum2=100;
		
		//�����ڽ�:Integer->int
		int i=objNum1;
		
		//WrapperŬ������ ����ϴ� ����:�޼��� ���
		//1.���ڿ�int�� ��ȯ
		int intNum1=Integer.parseInt("100");
		//int intNum2=Integer.parseInt("100A"); ERROR!
		
		//2. character
		Character objChar='a';
		char ch=objChar;
		
		//3.��� WrapperŬ������ toString()����: �⺻�ڷ����� String���� ��ȯ
		String str1=Character.toString('A');
		String str2=Integer.toString(100);
		
		//4.WrapperŬ������ valueOf(�⺻��):String�� �⺻������ ��ȯ
		Float f1=Float.valueOf("3.14");
		Float f2=Float.parseFloat("3.14");
		Integer i1=Integer.valueOf("100");
		Integer i2=Integer.parseInt("100");
	}

}
