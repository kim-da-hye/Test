//Char Stream: 16bit의 문자(2byte)의 문자열을 읽고 쓰는 스트림
//자바에서는 2byte를 문자를 담는데 사용함
//FileReader/FileWriter
//Char형 보조 Stream
//FilterReader/FilterWriter
//BufferedReader/BufferedWriter
package lec15_ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		

		String basePath=System.getProperty("user.dir");
		String filePath=basePath+ File.separator+"src"+File.separator+"lec15_ioStream"
				+File.separator+"file.txt";
		String outputFilePath=basePath+ File.separator+"src"+File.separator+"lec15_ioStream"
				+File.separator+"fileoutput.txt";
		System.out.println(filePath);
		System.out.println(outputFilePath);
		try {
			br= new BufferedReader(new FileReader(filePath));
			bw= new BufferedWriter(new FileWriter(outputFilePath));
			
			int data;
			//더 이상 읽을게 없을 때 br.read()는 -1이 반환됨
			while((data=br.read())!= -1) {
				System.out.print((char)data);
				bw.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//file은 항상 닫아줘야 하므로 finally로 처리
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
