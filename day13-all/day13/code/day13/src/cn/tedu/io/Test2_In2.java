package cn.tedu.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//�������������  �ַ�����ȡ
//�ܽ᣺
//1��ִ��Ч���ϣ�BufferedReader >  FileReader 
//2��ԭ���ǣ��ײ�ά����һ��char[] �����԰�������ĳ���һ���ԵĶ�ȡһ�������ݡ�Ĭ�ϵ�������8192�ֽ�����Ҳ����8K��
public class Test2_In2 {
	public static void main(String[] args) {
//		method();//FileReader��ȡ
		method2();//BufferedReader��ȡ
	}
	public static void method2() {
		try {
			//1����������
			Reader in = new BufferedReader(new FileReader("D:\\iotest\\1.txt"));
			//2����ʼ��ȡ
			int b = 0 ;
			while(  ( b = in.read() ) != -1) {
				System.out.println(b);
			}
			//3���ͷ���Դ
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//FileReader��ȡ
	public static void method() {
		try {
			//1����������
			Reader in = new FileReader("D:\\iotest\\1.txt") ;
			Reader in2 = new FileReader(new File("D:\\iotest\\1.txt")) ;
			//2����ʼ��ȡ
			int b = 0 ; //�����������¼��ȡ��������
			while( ( b = in.read() )  != -1 ) {
				System.out.println(b);
			}
			//3���ͷ���Դ
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}




