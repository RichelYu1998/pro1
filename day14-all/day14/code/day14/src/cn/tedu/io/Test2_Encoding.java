package cn.tedu.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//这个类用来测试  编码转换流：可以把字节流转成字符流
//OutputStreamWriter：写出中文时，可能会产生乱码，需要你指定码表
//InputStreamReader：读取中文时，可能会产生乱码，需要你指定码表
public class Test2_Encoding {
	public static void main(String[] args) {
		try {
			//1、提供字节流
			OutputStream out = new FileOutputStream("D:\\iotest\\1.txt");
			
//2、提供字符流 -- BufferedWriter的参数也需要是字符流，但是我们只有字节流，怎么转呢？--桥梁
//			Writer out2 =  new BufferedWriter(new OutputStreamWriter(out));//默认打开和保存都是gbk
//			Writer out2 =  new BufferedWriter(
//								new OutputStreamWriter(out,"ISO-8859-1"));//乱码
			Writer out2 =  new BufferedWriter(new OutputStreamWriter(out,"gbk"));//中文乱码的解决方案
			out2.write("大家好，我叫渣渣辉");
			
			//3、释放资源
			out2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
