//�̱��� ������
//Ŭ������ �ν��Ͻ��� �����ϴ� ������ ������ �ϳ���
//�ϳ��� �޸𸮸� �����ؼ� �̸� �����ϰ��� �� �� ����ϴ� ����,
//getInstance() �޼��带 ���ؼ� ��ü�� �ν��Ͻ�ȭ�Ѵ�.(�����ڸ� ������� ����. new�� ������� ����.)
package lec11_coding_style;
//�̱��� ����
class SingleTon{
	private static SingleTon instance; //private�̹Ƿ� Ŭ���� �ܺο��� ���ٺҰ�
	int shareVar=1;
	private SingleTon() {} //private�̹Ƿ� Ŭ���� �ܺο��� ���ٺҰ�
	public static SingleTon getInstance() {
		if(instance==null) {
			instance= new SingleTon();
		}
		return instance;
		
	}
}

public class SingleTonApp {

	public static void main(String[] args) {
		SingleTon singleton1=SingleTon.getInstance();
		System.out.println(singleton1);
		SingleTon singleton2=SingleTon.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton2.shareVar);
		singleton1.shareVar=4;
		System.out.println(singleton2.shareVar);

	}

}
