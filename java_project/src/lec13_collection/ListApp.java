//Collection Framework
//많은 데이터를 효율적으로 다루기 위한 구조를 자료구조라하며 data structure.
//이러한 자료구조를 클래스로 제공하며 클래스들의 집합을 컬렉션 프레임워크라 함. 
//컬렉션 인터페이스 : Set, List, Queue, Map

//List 인터페이스의 주요메서드
//중복된 데이터를 가지며 저장순서를 유지한다.  
//add 			: 추가
//get 			: 요소 반환
//index of		: 요소가 있는 위치를 반환
//remove		: 객체 object를 제거하고 제거한 요소를 반환
//set 			: 지정한 index의 요소를 변경

package lec13_collection;

import java.util.ArrayList;

class Song {
	String title;
	String singer;
	Song() {}
	Song(String title, String singer) {
		this.title = title;
		this.singer = singer; 
	}
	void info() {
		System.out.println("Title : " +title+ "  Singer : " + singer);
	}
}

public class ListApp {
	static void stringList() {
		//제네릭Generic이란 클래스가 다룰 객체를 미리 명시하는 것. <>안에 들어감.  
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shin");
		list.add("Kim");
		list.add("Park");
		list.add("Lee");
		list.add("Song");
		System.out.println(list);

		//갯수
		System.out.println(list.size());
		
		//지정위치에 추가
		list.add(1,"Kim");
		System.out.println(list);
		
		//원소가 있는지 확인 . 객체로 확인 
		System.out.println(list.contains("kim"));
		System.out.println(list.contains("Kim"));
		
		//지정위치 삭제
		//인덱스로삭제 
		list.remove(4);
		System.out.println(list);
		//객체로 삭제 
		list.remove("Kim");
		System.out.println(list);
		

		//지정위치 값 읽기
		System.out.println(list.get(2));
		//전부 출력
		for (int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//수정
		list.set(1, "Lee");
		System.out.println(list);
		
	}
	static void classList() {
		ArrayList<Song> songList = new ArrayList<>();
		Song song1 = new Song("DNA", "BTS");
		Song song2 = new Song("Greedy", "Grnade");
		
		songList.add(song1);
		songList.add(song2);
		
		//향상된 for문
		for (Song song : songList)  {
			song.info();
		}
	}

	public static void main(String[] args) {
		
		stringList();
		classList(); 
	}

}
