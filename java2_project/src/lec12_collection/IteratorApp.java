//Iterator:자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어보는 방법
//인터페이스이다.
//boolean hasNext():읽어올 요소가 남아 있는지 확인. 있으면 true 없으면 false
//Object next():요소를 읽어옴
package lec12_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorApp {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		//ArrayList<int> 는 안됨 int로는 객체를 만들수없으므로
		list.add(new Integer(3));
		list.add(3);
		list.add(5);
		list.add(10);
		System.out.println(list);
		
		//방법1
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//방법2
		for(Integer i:list) {
			System.out.println(i);
		}
		
		//방법3
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
