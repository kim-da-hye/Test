package lec15_ioStream;

import java.io.File;

public class FileApp {

	public static void main(String[] args) {
		//���� working directory ���� ��θ� �˾Ƴ�
		String basePath=System.getProperty("user.dir");
		System.out.println(basePath);
		//������ ������ ���丮�� ����
		//���� separator:window:\ linux/mac: /
		String filePath=basePath+ File.separator+"src"+File.separator+"lec15_ioStream"
				+File.separator+"file.txt";
		System.out.println(filePath);
	}

}
