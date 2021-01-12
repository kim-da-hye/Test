package java3_project;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalLambda {
	

	public static void main(String[] args) {
		//Animal ��ü 3�� ����
		Animal animal1=new Animal("Dog",4);   
		Animal animal2=new Animal("Pig",2);
		Animal animal3=new Animal("Snake",8);
		
		//ArrayList ��ü�� ����
		ArrayList<Animal> animallist=new ArrayList<>();
		animallist.add(animal1);
		animallist.add(animal2);
		animallist.add(animal3);
		System.out.println("�Է¼�: "+animallist);
		
		//���� ���� ����, ���ٽ� ���
		Collections.sort(animallist,(a,b)->a.age-b.age);
		System.out.println("���� ���� ����: " +animallist);
		//���� ���� ����, ���ٽ� ���
		Collections.sort(animallist,(a,b)->b.age-a.age);
		System.out.println("���� ���� ����: " +animallist);
		
		
	}
	


}

//������ ��ü�� ������ Ŭ����
class Animal {
    //������� ����
	String kind;
	int age;
	
	//������ ����
	public Animal(String kind,int age) {
		super();
		this.kind=kind;
		this.age=age;
	}
	
	//toString()����
	@Override
	public String toString() {
		return "Animal [kind=" + kind + ", age=" + age + "]";
	}
	
}
