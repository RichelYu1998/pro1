package cn.tedu.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//�������������  ����ת���������԰��ֽ���ת���ַ���
//OutputStreamWriter��д������ʱ�����ܻ�������룬��Ҫ��ָ�����
//InputStreamReader����ȡ����ʱ�����ܻ�������룬��Ҫ��ָ�����
public class Test2_Encoding {
	public static void main(String[] args) {
		try {
			//1���ṩ�ֽ���
			OutputStream out = new FileOutputStream("D:\\iotest\\1.txt");
			
//2���ṩ�ַ��� -- BufferedWriter�Ĳ���Ҳ��Ҫ���ַ�������������ֻ���ֽ�������ôת�أ�--����
//			Writer out2 =  new BufferedWriter(new OutputStreamWriter(out));//Ĭ�ϴ򿪺ͱ��涼��gbk
//			Writer out2 =  new BufferedWriter(
//								new OutputStreamWriter(out,"ISO-8859-1"));//����
			Writer out2 =  new BufferedWriter(new OutputStreamWriter(out,"gbk"));//��������Ľ������
			out2.write("��Һã��ҽ�������");
			
			//3���ͷ���Դ
			out2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
