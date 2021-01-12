//��Ʈ���� �⺻�� Ŭ���� �޼���
//String������ ����Ÿ���� ����(�ּҰ� ����)
//�񱳿�����
//�ֿ�޼���:
//concat():���ڿ� ����
//substring():���ڿ� �߶󳻱�
package lec09_api;

public class StringAPI {

	public static void main(String[] args) {
		
		int i=0;
		//1.string���� ����
		//�ν��Ͻ��� �����ϹǷ� new�� �����ϴ� �� ����
		String str=new String("Hello World");
		
		//2.�ܼ� ����:"�ڹ�":���ͷ��� ����Ŵ
		String text="�ڹ�";
		
		//immutable:������ �ȵ� +�����ڸ� �ϸ� ���� String�� ����
		String text2=text + str;//�ƿ� ���Ӱ� �޸𸮸� �Ҵ��ϰ� ��ũ���� ����. �޸𸮿� ���� ���̰�.
		
		//2.��:equals()�� ����ؼ� ������ ��
		System.out.println("hello".equals("hello"));
		
		//����:length()
		System.out.println("Hello World".length());
		//��ġ:indexOf()::�տ������� ã�´� index�� 0���� ����
		//lastIndexOf():�ڿ������� ã�´�
		System.out.println("Hello World".indexOf("Wo"));
		System.out.println("LAST INDEX");
		System.out.println("Hello World Hello".lastIndexOf("He"));
		
		//���ں�ȯ:��ġ�� �ش�Ǵ� ���ں�ȯ
		System.out.println("Hello".charAt(0));
		
		//���ڿ� �����Ͽ� �迭��ҷ� ����:split()
		String[] textArray="hello world new year's greetings".split("  ");
		//����for��
		for(String t :textArray) {
			System.out.println(t+"  ");
		}
		System.out.println();
		//���ڿ� �յ� ���� ���� trim()
		//method�� ���������� ����ϸ� ��
		System.out.println("   angel   ".trim().equals("angel"));
		
		//����, ��ġ: replace()
		System.out.println("1,000,000".replace(",", ""));
		
		//String�� int�� �ٲ�
		int num=Integer.valueOf("1000");
		int num2=Integer.parseInt("1000");
		System.out.println(num+num2);
		
		//int�� string����
		String str1=String.valueOf(100);
		String str2=Integer.toString(100);
		System.out.println(str1+str2);
		
		//�Ϻ� ���ڿ� ����:substring()
		System.out.println("HelloWorld".substring(3));
		
		//quiz:���� �̸����� Ȯ���ڸ� ����
		//��Ʈ:.�� ã�´�. substring()�� ����Ѵ�.
		//"hello.world.java"���� java�� �����Ͻÿ�
		String filename= "hello.world.java";
		System.out.println(filename.lastIndexOf("."));
		int begin=filename.lastIndexOf(".");
		System.out.println(filename.substring(begin+1));
		
		//���ڿ� ����:concat() :���ڿ� ���� ����
		System.out.println("hello world".concat("Hello"));
		
		//�ִ��� Ȯ��:contains():��ҹ��� �����ϹǷ� ��ã��
		System.out.println("Hello World".contains("hello"));
		//�ҹ��ڷ� �ٲپ��� �� �ִ��� Ȯ��
		System.out.println("Hello World".toLowerCase().contains("hello"));
		
		//char�� �迭�� ����� ���ڸ� String���� ��ȯ
		char[] chars= {'H','e','l','l','o'};
		System.out.println(chars);
		String charsString="";
		for(i=0; i<chars.length;i++) {
			charsString+=chars[i];
		}
		for(char c: chars) {
			charsString+=c;
		}
		System.out.println(charsString);
		
		//format():������ format����string �� ����
		System.out.println(String.format("%10s %5d %5.3f", "shin", 100, 10.2));
		System.out.println(String.format("%10s %5d %5.3f", "hi", 10000, 10.2323));
		
		//����:startswith()
		//��:endswith()
		System.out.println("Hello World".startsWith("H"));
		System.out.println("Hello World.".endsWith("."));
		
	}

}
