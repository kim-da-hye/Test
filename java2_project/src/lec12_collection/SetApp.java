//Set:�������̽�. ����
//�ߺ��� �����͸� ������ ������ ��������� �������� �ʴ´�.
//set�� ������ Ŭ����:HashSet(�ӵ��� ����),TreeSet(����).
package lec12_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		hashSet();
		treeSet();//���ĵȴٴ� ���̸� ����
	}

	private static void treeSet() {
		TreeSet<String> set=new TreeSet<>();
		//�߰�:add():�ߺ��� üũ�ؼ� �ߺ��� ��� �߰��� ���� �ʴ´�. ������ ���� ������ ����.
		set.add("shin");
		set.add("lee");
		set.add("kim");
		set.add("jung");
		set.add("shin");
		
		//���
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}
		
		//�ִ��� Ȯ��:contain()
		if(set.contains("shin")) {
			//����: remove()
			set.remove("shin");
		}
		System.out.println(set);
		Iterator<String> iter =set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	

	private static void hashSet() {
		HashSet<String> set=new HashSet<>();
		//�߰�:add()
		set.add("shin");
		set.add("lee");
		set.add("kim");
		set.add("jung");
		set.add("shin");
		
		//���
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}
		
		//�ִ��� Ȯ��:contain()
		if(set.contains("shin")) {
			//����: remove()
			set.remove("shin");
		}
		System.out.println(set);
		Iterator<String> iter =set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
