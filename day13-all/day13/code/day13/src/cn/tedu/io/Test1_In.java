package cn.tedu.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//这个类用来测试  字节流读取
//总结：
//1、执行效率上：BufferedInputStream >  FileInputStream
//2、原因是：底层维护了一个byte[]，可以按照数组的长度一次性的读取一大批数据。默认的容量是8192字节量，也就是8K。
public class Test1_In {
	public static void main(String[] args) {
//		method() ;//FileInputStream字节流读取
		method2();//BufferedInputStream读取
	}
	public static void method2() {
		try {
			//1，创建对象
			InputStream in = new BufferedInputStream(new FileInputStream("D:\\iotest\\1.txt") );
			//2，开始读取
			int b  =  0 ; //记录每次读取的数据
			while( ( b = in.read() ) != -1  ) {//read()就是从读取流中，一个字节一个字节读取数据
				System.out.println(b);
			}
			//3，释放资源
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//字节流读取
	public static void method() {
		try {
			//1、创建对象  -- 参数是  文件 的路径
			InputStream in  = new FileInputStream("D:\\iotest\\1.txt");//触发String参数的构造
			InputStream in2  = new FileInputStream(new File("D:\\iotest\\1.txt"));//触发File参数的构造
			//2、开始读取
			int b = 0 ; //定义变量，记录读取到的值
			while( ( b = in.read() ) != -1 ) {//因为读到-1时就没数据了
				System.out.println(b);
			}
			//3、释放资源
			in.close();
//			System.out.println(in.read());//Stream Closed
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
