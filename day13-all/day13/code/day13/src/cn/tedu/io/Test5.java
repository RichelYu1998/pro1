package cn.tedu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//��������������ļ�����  --��Ч���ֽ���
public class Test5 {
	public static void main(String[] args) {
		try {
//		1����ȡԴ�ļ�������
	InputStream in = new BufferedInputStream(new FileInputStream("D:\\iotest\\1.txt"));
//		2��д�����ݵ�Ŀ���ļ���
	OutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\iotest\\2.txt"));
			
			//3����ȡ����ͬʱд�����߶���д����
			int b = 0 ;//�����������¼��ȡ��������
			while(( b = in.read() ) !=  -1 ) {
				out.write(b);//�Ѷ�ȡ�������ݣ�д��
			}
			
			//4���ͷ���Դ
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
