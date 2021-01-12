//Char Stream: 16bit�� ����(2byte)�� ���ڿ��� �а� ���� ��Ʈ��
//�ڹٿ����� 2byte�� ���ڸ� ��µ� �����
//FileReader/FileWriter
//Char�� ���� Stream
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
			//�� �̻� ������ ���� �� br.read()�� -1�� ��ȯ��
			while((data=br.read())!= -1) {
				System.out.print((char)data);
				bw.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//file�� �׻� �ݾ���� �ϹǷ� finally�� ó��
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
