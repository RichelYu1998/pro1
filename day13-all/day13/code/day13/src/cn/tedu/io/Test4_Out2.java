package cn.tedu.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//�������������  �ַ���д��
//�ܽ᣺
//1��ִ��Ч���ϣ�BufferedWriter >  FileWriter 
//2��ԭ���ǣ��ײ�ά����һ��char[] �����԰�������ĳ���һ���Ե��������д��һ�������ݡ�Ĭ�ϵ�������8192�ֽ�����Ҳ����8K��
public class Test4_Out2 {
	public static void main(String[] args) {
//		method(); //FileWriterд��
		method2(); //BufferedWriterд��
	}
	public static void method2() {
		try {
			//1����������
			Writer out = new BufferedWriter(new FileWriter("D:\\iotest\\1.txt"));
			//2����ʼд��
			out.write("hello");
			//3���ͷ���Դ
//			out.flush();//�����ѻ�����������ˢ����������չʾ
			out.close();//1��������ˢ��ȥ  2���ر���Դ
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void method() {
		try {
			//1����������
//			Writer out = new FileWriter("D:\\iotest\\1.txt") ;//����
			Writer out = new FileWriter("D:\\iotest\\1.txt",true) ;//׷��
//			Writer out2 = new FileWriter(new File("D:\\iotest\\1.txt")) ;
			
			//2����ʼд��
			out.write(48);
			out.write(48);
			
			//3���ͷ���Դ
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
