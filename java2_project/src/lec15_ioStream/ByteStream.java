//IO:input(������ ��) output(������ ��)
//Stream: �Ϸ��� ���ӵ� �������� �帧
//�Է� ��Ʈ��: ������ �ҽ����� ���α׷����� �귯������ ��Ʈ��
//��� ��Ʈ��: ���α׷����� ������ �������� ������ ��Ʈ��
//Byte ��� ��Ʈ��: InputStream , outputStream, 1byte������ ������ �̵�(�̹���)
//Char(���� ���) ��Ʈ��: Reader, Writer, 2byte������ ������ �̵�(text)

//����Ʈ��� ���� ��Ʈ��: ���� ��� ����
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
