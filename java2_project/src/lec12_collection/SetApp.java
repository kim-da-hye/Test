//Set:인터페이스. 집합
//중복된 데이터를 가지지 않으며 저장순서를 유지하지 않는다.
//set을 구현한 클래스:HashSet(속도가 빠름),TreeSet(정렬).
package lec12_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		hashSet();
		treeSet();//정렬된다는 차이만 존재
	}

	private static void treeSet() {
		TreeSet<String> set=new TreeSet<>();
		//추가:add():중복을 체크해서 중복된 경우 추가가 되지 않는다. 유일한 값만 가지고 있음.
		set.add("shin");
		set.add("lee");
		set.add("kim");
		set.add("jung");
		set.add("shin");
		
		//출력
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}
		
		//있는지 확인:contain()
		if(set.contains("shin")) {
			//삭제: remove()
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
		//추가:add()
		set.add("shin");
		set.add("lee");
		set.add("kim");
		set.add("jung");
		set.add("shin");
		
		//출력
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}
		
		//있는지 확인:contain()
		if(set.contains("shin")) {
			//삭제: remove()
			set.remove("shin");
		}
		System.out.println(set);
		Iterator<String> iter =set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
