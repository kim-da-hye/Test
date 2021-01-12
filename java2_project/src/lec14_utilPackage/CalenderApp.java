//Calender
//Calender Ŭ������  Singletone Design���� ���ǵǾ���.
//�����ڷ� Calender �ν��Ͻ��� ���������.
//getInstance()�޼ҵ�� �ν��Ͻ��� �����.
package lec14_utilPackage;

import java.util.Calendar;

public class CalenderApp {

	public static void main(String[] args) {
		//���� ��¥
		Calendar today=Calendar.getInstance();//��Ŭ�� ����
		System.out.println(today);
		//get()�޼���� ���� ��������
		int year=today.get(Calendar.YEAR);
		System.out.println(year);
		int month=today.get(Calendar.MONTH)+1; //���� 0���� ����
		System.out.println(month );
		int date=today.get(Calendar.DATE);
		System.out.println(date);
		
		//��¥ Ư��
		Calendar endOfYear=Calendar.getInstance();
		endOfYear.set(Calendar.MONTH, 11); //12��
		endOfYear.set(Calendar.DATE, 31);  //31��
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("��������"+diff/(1000*60*60*24));
	}

}
