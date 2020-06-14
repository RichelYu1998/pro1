package cn.tedu.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//这个类用来测试  字节流写出
//总结：
//1、执行效率上：BufferedOutputStream >  FileOutputStream 
//2、原因是：底层维护了一个byte[] ，可以按照数组的长度一次性的向磁盘中写出一大批数据。默认的容量是8192字节量，也就是8K。
public class Test3_Out {
	public static void main(String[] args) {
//		method();//普通的写出流FileOutputStream
		method2();//高效的写出流BufferedOutputStream
	}
	public static void method2() {
		try {
			//1、创建对象
//			OutputStream out = new BufferedOutputStream(
//									new FileOutputStream("D:\\iotest\\1.txt"));//覆盖
			OutputStream out = new BufferedOutputStream(
								new FileOutputStream("D:\\iotest\\1.txt",true));//追加
			
			//2、开始写出
			out.write(48);
			out.write(48);
			out.write(48);
			
			//3、释放资源
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method() {
		try {
			//1、创建对象－－默认是数据覆盖模式，也可以改成追加模式，需要传入第二参数true
			OutputStream out = new FileOutputStream("D:\\iotest\\1.txt");//默认覆盖
//			OutputStream out = new FileOutputStream("D:\\iotest\\1.txt",true);//数据追加
//			OutputStream out2 = new FileOutputStream(new File("D:\\iotest\\1.txt")) ;
			
			//2、开始写出
			out.write(49);
			out.write(50);
			out.write(51);
			
			//3、释放资源
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}



