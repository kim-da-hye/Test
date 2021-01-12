//Map interface:키와 값을 쌍으로 저장하는 구조
//Map interface를 구현(implements)한 클래스:HashMap,TreeMap(순서없음,알파벳순서).저장된 순서로 저장되지 않음
//키는 중복되지 않음. 고유,유일한 값
//값은 중복되어도 됨
package lec12_collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapApp {

	public static void main(String[] args) {
		//hashMap();
		treeMap();
	}

	private static void treeMap() {
		TreeMap<String, Integer> map=new TreeMap<>();//알파멧 순서대로
				
				
		//추가(key가 없으면)/변경(key가 있으면):put(k,v)
				map.put("americano", 5000);
				map.put("juice", 8000);
				map.put("latte", 6000);
				map.put("icecream", 4000);
				map.put("juice", 10000); //중복이 되면 overwrite이 됨. 덮어씀. 수정/변경
				System.out.println(map);
				
	}
	

	private static void hashMap() {
		//선언
		//예:메뉴 테이블:아메리카노는 3,000, latte는 4,000, icecream, juice
		HashMap<String, Integer> map=new HashMap<>();
		
		
		//추가(key가 없으면)/변경(key가 있으면):put(k,v)
		map.put("americano", 5000);
		map.put("juice", 8000);
		map.put("latte", 6000);
		map.put("icecream", 4000);
		map.put("juice", 10000); //중복이 되면 overwrite이 됨. 덮어씀. 수정/변경
		System.out.println(map);
		
		//키가 있는지 확인
		System.out.println(map.containsKey("juice"));
		
		//key로 삭제
		map.remove("juice");
		System.out.println(map);
		
		//size
		System.out.println(map.size());
		
		//key로 value를 가져오기
		System.out.println(map.get("latte"));
		System.out.println(map.get("juice")); //키가 없는 경우 null를 return함.
		
		//키만 알고 싶을때 
		System.out.println(map.keySet()); //반환값은 set type
		
		//값만 알고 싶을때
		System.out.println(map.values());
		
		//출력하는 방법 #1
		Iterator<String> iter =map.keySet().iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println(String.format("%10s %5d", key, map.get(key)));
			
		}
		//출력하는 방법 #2
		//향상된 for문 (key만 가지고 와서) map.keySet()이용하여 출력
		for(String key: map.keySet()) {
			System.out.println(String.format("%10s %5d", key, map.get(key)));
		}
		
		//출력하는 방법 #3
		for(Entry<String, Integer> elem :map.entrySet()) {
			System.out.println(String.format("%10s %5d", elem.getKey(), elem.getValue()));
		}
	}

}
