//IO:input(들어오는 값) output(나오는 값)
//Stream: 일련의 연속된 데이터의 흐름
//입력 스트림: 데이터 소스에서 프로그램으로 흘러들어오는 스트림
//출력 스트림: 프로그램에서 데이터 목적지로 나가는 스트림
//Byte 기반 스트림: InputStream , outputStream, 1byte단위로 데이터 이동(이미지)
//Char(문자 기반) 스트림: Reader, Writer, 2byte단위로 데이터 이동(text)

//바이트기반 보조 스트림: 성능 향상 목적
//FilterInputStream/FilterOutputStream
//BufferedInputStream/BufferedOutputStream
package lec15_ioStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		FileInputStream input=null;
		FileOutputStream output=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		String basePath=System.getProperty("user.dir");
		String inputFilePath=basePath+ File.separator+"src"+File.separator+"lec15_ioStream"
				+File.separator+"file.txt";
		String outputFilePath=basePath+ File.separator+"src"+File.separator+"lec15_ioStream"
				+File.separator+"fileoutput.txt";
		System.out.println(inputFilePath);
		System.out.println(outputFilePath);
		
		try {
			input=new FileInputStream(inputFilePath);
			bis=new BufferedInputStream(input);
			output=new FileOutputStream(outputFilePath);
			bos=new BufferedOutputStream(output);
			
			int data;
			while((data=bis.read() ) != -1 ) {
				System.out.println(data);
				bos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
