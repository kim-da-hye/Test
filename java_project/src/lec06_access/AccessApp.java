//��ǥ : import�� ���������� Access Modifier   
//
//�ٸ� ��Ű���� �ִ� Ŭ������ ����ϰ� ���� �� Ŭ������ �̸����� ����. 
//�����ؾ��� Ŭ������ �������� �پ������ٸ� ������ ��θ� ���� ���� ������-> �̶� ��θ� �����ϴ� ����� import��

//Ŭ���� ���������� : Ŭ����  �ܺ� ������ ����
//public 		��𼭳� ���� ����. Ŭ���� �տ� ����.   
//default(���������ڸ� �Ⱥ��ΰ��)	���� ��Ű�� �������� ���� ����
//Ŭ���� : ������ < public

package lec06_access;

import lec06_accessModifier.PublicClass;
public class AccessApp {

	public static void main(String[] args) {
		//default ������������ Ŭ������ ��� �ٸ� ��Ű������ ���ٺҰ���. 
		//lec06_accessModifier.DefaultClass dc; ERROR! 

		//import���� �ٸ� ��Ű���� �ִ� Ŭ���� ����ϰ��� �� �� ������ ��Ű���̸����� �� ����� ��.
		lec06_accessModifier.PublicClass fullpa = new lec06_accessModifier.PublicClass();
		
		//import�� �Ѱ�� Ŭ���� �̸������� ���� ����
		PublicClass pa= new PublicClass();
		pa.publicInt=1;
		//���� �Ұ�:��Ű���� �ٸ��Ƿ�
		//pa.defaultInt;���� ��Ű����������
		//pa.protectedInt;���� ��Ű���� �Ǵ� �ڼ�
	    //pa.privateInt;Ŭ���� �ܺο����� ���� �Ұ�
		

	}

}
