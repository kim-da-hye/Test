package lec15_ioStream;

import java.io.File;

public class FileApp {

	public static void main(String[] args) {
		//현재 working directory 절대 경로를 알아냄
		String basePath=System.getProperty("user.dir");
		System.out.println(basePath);
		//파일이 존재할 디렉토리와 결합
		//파일 separator:window:\ linux/mac: /
		String filePath=basePath+ File.separator+"src"+File.separator+"lec15_ioStream"
				+File.separator+"file.txt";
		System.out.println(filePath);
	}

}
