package cn.tedu.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//这个类用来测试  字符流读取
//总结：
//1、执行效率上：BufferedReader >  FileReader 
//2、原因是：底层维护了一个char[] ，可以按照数组的长度一次性的读取一大批数据。默认的容量是8192字节量，也就是8K。
public class Test2_In2 {
	public static void main(String[] args) {
//		method();//FileReader读取
		method2();//BufferedReader读取
	}
	public static void method2() {
		try {
			//1、创建对象
			Reader in = new BufferedReader(new FileReader("D:\\iotest\\1.txt"));
			//2、开始读取
			int b = 0 ;
			while(  ( b = in.read() ) != -1) {
				System.out.println(b);
			}
			//3、释放资源
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//FileReader读取
	public static void method() {
		try {
			//1、创建对象
			Reader in = new FileReader("D:\\iotest\\1.txt") ;
			Reader in2 = new FileReader(new File("D:\\iotest\\1.txt")) ;
			//2、开始读取
			int b = 0 ; //定义变量，记录读取到的数据
			while( ( b = in.read() )  != -1 ) {
				System.out.println(b);
			}
			//3、释放资源
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}




