//���������ڿ� ���� ���� ���� Ȯ��
//���� ��Ű���������� public,default,protected�� �� 
//private�� �ȵ� (Encapsulation)

package lec06_accessModifier;

public class AccessApp {

	public static void main(String[] args) {
		//public class ����
		PublicClass pc ;
		
		//default class ����:���� ��Ű�����̹Ƿ� ���� ����
		DefaultClass dc= new DefaultClass();
		//��� ���� ����
		dc.defaultInt=1;
		dc.protectedInt=1;
		dc.publicInt=1;
		//dc.privateInt=1; :private ��������� ���� �Ұ�:Ŭ���� ���ο����� ���� �����ϹǷ�
		
		//�޼ҵ� ����
		dc.defaultMethod();
		dc.protectedMethod();
		dc.publicMethod();
		//dc.protectedMethod(); :private method�� ���� �Ұ�
		
		
	}

}
