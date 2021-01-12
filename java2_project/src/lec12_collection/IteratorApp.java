//Iterator:�ڹ��� �÷��� �����ӿ�ũ���� �÷��ǿ� ����Ǿ� �ִ� ��ҵ��� �о�� ���
//�������̽��̴�.
//boolean hasNext():�о�� ��Ұ� ���� �ִ��� Ȯ��. ������ true ������ false
//Object next():��Ҹ� �о��
package lec12_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorApp {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		//ArrayList<int> �� �ȵ� int�δ� ��ü�� ����������Ƿ�
		list.add(new Integer(3));
		list.add(3);
		list.add(5);
		list.add(10);
		System.out.println(list);
		
		//���1
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//���2
		for(Integer i:list) {
			System.out.println(i);
		}
		
		//���3
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
