//PhoneBook�߻�ȭ
//�Ӽ�(�������)
//1.�̸�
//2.��ȭ��ȣ

package app03_phonebook_array;

public class PhoneBook {
	//��� ����
	String name;
	String number;
	
	//������
	//�⺻ ������
	
	PhoneBook(){}
	//�����ε�(������)
	PhoneBook(String name,String number){
		this.name=name;
		this.number=number;
	}
	void info() {
		System.out.println("name:"+name+"number:"+number);
	}
}
