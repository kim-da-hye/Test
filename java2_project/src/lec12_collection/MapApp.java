//Map interface:Ű�� ���� ������ �����ϴ� ����
//Map interface�� ����(implements)�� Ŭ����:HashMap,TreeMap(��������,���ĺ�����).����� ������ ������� ����
//Ű�� �ߺ����� ����. ����,������ ��
//���� �ߺ��Ǿ ��
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
		TreeMap<String, Integer> map=new TreeMap<>();//���ĸ� �������
				
				
		//�߰�(key�� ������)/����(key�� ������):put(k,v)
				map.put("americano", 5000);
				map.put("juice", 8000);
				map.put("latte", 6000);
				map.put("icecream", 4000);
				map.put("juice", 10000); //�ߺ��� �Ǹ� overwrite�� ��. ���. ����/����
				System.out.println(map);
				
	}
	

	private static void hashMap() {
		//����
		//��:�޴� ���̺�:�Ƹ޸�ī��� 3,000, latte�� 4,000, icecream, juice
		HashMap<String, Integer> map=new HashMap<>();
		
		
		//�߰�(key�� ������)/����(key�� ������):put(k,v)
		map.put("americano", 5000);
		map.put("juice", 8000);
		map.put("latte", 6000);
		map.put("icecream", 4000);
		map.put("juice", 10000); //�ߺ��� �Ǹ� overwrite�� ��. ���. ����/����
		System.out.println(map);
		
		//Ű�� �ִ��� Ȯ��
		System.out.println(map.containsKey("juice"));
		
		//key�� ����
		map.remove("juice");
		System.out.println(map);
		
		//size
		System.out.println(map.size());
		
		//key�� value�� ��������
		System.out.println(map.get("latte"));
		System.out.println(map.get("juice")); //Ű�� ���� ��� null�� return��.
		
		//Ű�� �˰� ������ 
		System.out.println(map.keySet()); //��ȯ���� set type
		
		//���� �˰� ������
		System.out.println(map.values());
		
		//����ϴ� ��� #1
		Iterator<String> iter =map.keySet().iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println(String.format("%10s %5d", key, map.get(key)));
			
		}
		//����ϴ� ��� #2
		//���� for�� (key�� ������ �ͼ�) map.keySet()�̿��Ͽ� ���
		for(String key: map.keySet()) {
			System.out.println(String.format("%10s %5d", key, map.get(key)));
		}
		
		//����ϴ� ��� #3
		for(Entry<String, Integer> elem :map.entrySet()) {
			System.out.println(String.format("%10s %5d", elem.getKey(), elem.getValue()));
		}
	}

}
