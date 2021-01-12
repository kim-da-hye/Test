package java3_project;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalLambda {
	

	public static void main(String[] args) {
		//Animal 객체 3개 생성
		Animal animal1=new Animal("Dog",4);   
		Animal animal2=new Animal("Pig",2);
		Animal animal3=new Animal("Snake",8);
		
		//ArrayList 객체를 생성
		ArrayList<Animal> animallist=new ArrayList<>();
		animallist.add(animal1);
		animallist.add(animal2);
		animallist.add(animal3);
		System.out.println("입력순: "+animallist);
		
		//오름 차순 정렬, 람다식 사용
		Collections.sort(animallist,(a,b)->a.age-b.age);
		System.out.println("오름 차순 정렬: " +animallist);
		//내림 차순 정렬, 람다식 사용
		Collections.sort(animallist,(a,b)->b.age-a.age);
		System.out.println("내림 차순 정렬: " +animallist);
		
		
	}
	


}

//데이터 객체를 정의한 클래스
class Animal {
    //멤버변수 선언
	String kind;
	int age;
	
	//생성자 정의
	public Animal(String kind,int age) {
		super();
		this.kind=kind;
		this.age=age;
	}
	
	//toString()정의
	@Override
	public String toString() {
		return "Animal [kind=" + kind + ", age=" + age + "]";
	}
	
}
