//Collection Framework
//���� �����͸� ȿ�������� �ٷ�� ���� ������ �ڷᱸ�����ϸ� data structure.
//�̷��� �ڷᱸ���� Ŭ������ �����ϸ� Ŭ�������� ������ �÷��� �����ӿ�ũ�� ��. 
//�÷��� �������̽� : Set, List, Queue, Map

//List �������̽��� �ֿ�޼���
//�ߺ��� �����͸� ������ ��������� �����Ѵ�.  
//add 			: �߰�
//get 			: ��� ��ȯ
//index of		: ��Ұ� �ִ� ��ġ�� ��ȯ
//remove		: ��ü object�� �����ϰ� ������ ��Ҹ� ��ȯ
//set 			: ������ index�� ��Ҹ� ����

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
		//���׸�Generic�̶� Ŭ������ �ٷ� ��ü�� �̸� ����ϴ� ��. <>�ȿ� ��.  
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shin");
		list.add("Kim");
		list.add("Park");
		list.add("Lee");
		list.add("Song");
		System.out.println(list);

		//����
		System.out.println(list.size());
		
		//������ġ�� �߰�
		list.add(1,"Kim");
		System.out.println(list);
		
		//���Ұ� �ִ��� Ȯ�� . ��ü�� Ȯ�� 
		System.out.println(list.contains("kim"));
		System.out.println(list.contains("Kim"));
		
		//������ġ ����
		//�ε����λ��� 
		list.remove(4);
		System.out.println(list);
		//��ü�� ���� 
		list.remove("Kim");
		System.out.println(list);
		

		//������ġ �� �б�
		System.out.println(list.get(2));
		//���� ���
		for (int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//����
		list.set(1, "Lee");
		System.out.println(list);
		
	}
	static void classList() {
		ArrayList<Song> songList = new ArrayList<>();
		Song song1 = new Song("DNA", "BTS");
		Song song2 = new Song("Greedy", "Grnade");
		
		songList.add(song1);
		songList.add(song2);
		
		//���� for��
		for (Song song : songList)  {
			song.info();
		}
	}

	public static void main(String[] args) {
		
		stringList();
		classList(); 
	}

}
