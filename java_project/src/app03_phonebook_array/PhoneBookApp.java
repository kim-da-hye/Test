//PhoneBook Menu
//1.PhoneBook �Է�
//2.PhoneBook ���
//3.PhoneBook ����
//3.���α׷� ����

package app03_phonebook_array;

import java.util.Scanner;

public class PhoneBookApp {
	//�������
	
   //static:���α׷� ����� �Բ� �׻� �޸𸮿� �ö� �־����
	public static void main(String[] args) {
		PhoneBookList pbList=new PhoneBookList();
		
			while(true) {
			//���ú���:sc
			Scanner sc =new Scanner (System. in);
			System.out.println("1.�Է� 2.��� 3.���� 9.����");
			System.out.println("���ϴ� �޴��� �����ϼ���");
			int menu=Integer.parseInt(sc.nextLine());
			if(menu==9)break;
			switch(menu) {
			case 1: //�Է�
				pbList.addPhoneBook();
				pbList.printPhoneBook();
			break;
			case 2: //���
				pbList.printPhoneBook();
			case 3: //����
				pbList.delPhoneBook();
				pbList.printPhoneBook();
			break; 
			}
			
		}System.out.println("���α׷� �����մϴ�.");
	}

}
