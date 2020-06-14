package cn.tedu.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//这个类用来测试  字符流写出
//总结：
//1、执行效率上：BufferedWriter >  FileWriter 
//2、原因是：底层维护了一个char[] ，可以按照数组的长度一次性的向磁盘中写出一大批数据。默认的容量是8192字节量，也就是8K。
public class Test4_Out2 {
	public static void main(String[] args) {
//		method(); //FileWriter写出
		method2(); //BufferedWriter写出
	}
	public static void method2() {
		try {
			//1、创建对象
			Writer out = new BufferedWriter(new FileWriter("D:\\iotest\\1.txt"));
			//2、开始写出
			out.write("hello");
			//3、释放资源
//			out.flush();//用来把缓冲区的数据刷到磁盘中做展示
			out.close();//1、把数据刷出去  2、关闭资源
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void method() {
		try {
			//1、创建对象
//			Writer out = new FileWriter("D:\\iotest\\1.txt") ;//覆盖
			Writer out = new FileWriter("D:\\iotest\\1.txt",true) ;//追加
//			Writer out2 = new FileWriter(new File("D:\\iotest\\1.txt")) ;
			
			//2、开始写出
			out.write(48);
			out.write(48);
			
			//3、释放资源
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
