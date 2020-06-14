package cn.tedu.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//�������������  �ֽ�����ȡ
//�ܽ᣺
//1��ִ��Ч���ϣ�BufferedInputStream >  FileInputStream
//2��ԭ���ǣ��ײ�ά����һ��byte[]�����԰�������ĳ���һ���ԵĶ�ȡһ�������ݡ�Ĭ�ϵ�������8192�ֽ�����Ҳ����8K��
public class Test1_In {
	public static void main(String[] args) {
//		method() ;//FileInputStream�ֽ�����ȡ
		method2();//BufferedInputStream��ȡ
	}
	public static void method2() {
		try {
			//1����������
			InputStream in = new BufferedInputStream(new FileInputStream("D:\\iotest\\1.txt") );
			//2����ʼ��ȡ
			int b  =  0 ; //��¼ÿ�ζ�ȡ������
			while( ( b = in.read() ) != -1  ) {//read()���ǴӶ�ȡ���У�һ���ֽ�һ���ֽڶ�ȡ����
				System.out.println(b);
			}
			//3���ͷ���Դ
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//�ֽ�����ȡ
	public static void method() {
		try {
			//1����������  -- ������  �ļ� ��·��
			InputStream in  = new FileInputStream("D:\\iotest\\1.txt");//����String�����Ĺ���
			InputStream in2  = new FileInputStream(new File("D:\\iotest\\1.txt"));//����File�����Ĺ���
			//2����ʼ��ȡ
			int b = 0 ; //�����������¼��ȡ����ֵ
			while( ( b = in.read() ) != -1 ) {//��Ϊ����-1ʱ��û������
				System.out.println(b);
			}
			//3���ͷ���Դ
			in.close();
//			System.out.println(in.read());//Stream Closed
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
