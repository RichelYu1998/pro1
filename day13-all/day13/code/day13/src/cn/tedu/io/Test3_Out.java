package cn.tedu.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//�������������  �ֽ���д��
//�ܽ᣺
//1��ִ��Ч���ϣ�BufferedOutputStream >  FileOutputStream 
//2��ԭ���ǣ��ײ�ά����һ��byte[] �����԰�������ĳ���һ���Ե��������д��һ�������ݡ�Ĭ�ϵ�������8192�ֽ�����Ҳ����8K��
public class Test3_Out {
	public static void main(String[] args) {
//		method();//��ͨ��д����FileOutputStream
		method2();//��Ч��д����BufferedOutputStream
	}
	public static void method2() {
		try {
			//1����������
//			OutputStream out = new BufferedOutputStream(
//									new FileOutputStream("D:\\iotest\\1.txt"));//����
			OutputStream out = new BufferedOutputStream(
								new FileOutputStream("D:\\iotest\\1.txt",true));//׷��
			
			//2����ʼд��
			out.write(48);
			out.write(48);
			out.write(48);
			
			//3���ͷ���Դ
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method() {
		try {
			//1���������󣭣�Ĭ�������ݸ���ģʽ��Ҳ���Ըĳ�׷��ģʽ����Ҫ����ڶ�����true
			OutputStream out = new FileOutputStream("D:\\iotest\\1.txt");//Ĭ�ϸ���
//			OutputStream out = new FileOutputStream("D:\\iotest\\1.txt",true);//����׷��
//			OutputStream out2 = new FileOutputStream(new File("D:\\iotest\\1.txt")) ;
			
			//2����ʼд��
			out.write(49);
			out.write(50);
			out.write(51);
			
			//3���ͷ���Դ
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}



