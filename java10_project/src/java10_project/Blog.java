package java10_project;

public class Blog {

	public static void main(String[] args) {
		StringBuffer buff=new StringBuffer();
		buff.append("Welcome my Blog");
		buff.deleteCharAt(0);
		System.out.println("buff="+buff);
		buff.delete(0,4);
		System.out.println("buff="+buff);
		buff.delete(0,buff.length());
		System.out.println("buff="+buff);

	}

}
