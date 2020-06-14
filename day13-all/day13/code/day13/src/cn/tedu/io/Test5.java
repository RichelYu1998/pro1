package cn.tedu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//这个类用来测试文件复制  --高效的字节流
public class Test5 {
	public static void main(String[] args) {
		try {
//		1、读取源文件的数据
	InputStream in = new BufferedInputStream(new FileInputStream("D:\\iotest\\1.txt"));
//		2、写出数据到目标文件中
	OutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\iotest\\2.txt"));
			
			//3、读取数据同时写出，边读边写！！
			int b = 0 ;//定义变量，记录读取到的数据
			while(( b = in.read() ) !=  -1 ) {
				out.write(b);//把读取到的数据，写出
			}
			
			//4、释放资源
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
