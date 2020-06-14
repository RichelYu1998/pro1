package cn.tedu.number;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//这个类用来测试  File 
public class Test5_File {
	public static void main(String[] args) throws IOException {
		//1、创建File对象  --  参数是文件路径或者文件夹路径
		File f = new File("D:\\iotest\\1.txt");//封装一个文件路径
		//2、常见方法
		//文件文件夹属性
		System.out.println(  f.length()  );//获取文件的字节量
		System.out.println(  f.exists()  );//判断文件是否存在
		System.out.println(  f.isFile()  );//判断是一个文件
		System.out.println(  f.isDirectory()  );//判断是一个文件夹
		System.out.println(  f.getName()  );//获取文件名称
		System.out.println(  f.getParent()  );//获取父目录
		System.out.println(  f.getAbsolutePath()  );//获取完整路径
		//创建  删除
		System.out.println(  f.createNewFile()  );//是否成功的新建了文件
		
		f = new File("D:\\iotest\\m"); //封装一个文件夹路径
		System.out.println(  f.mkdir()  );//自动创建一级不存在的目录
		
		f = new File("D:\\iotest\\x\\y\\z"); //封装一个文件夹路径
		System.out.println(  f.mkdirs()  );//自动创建多级不存在的目录
		
		f = new File("D:\\iotest\\2.txt"); 
		System.out.println(  f.delete()  );//删除文件 或  空文件夹
		
		//列表
		f = new File("D:\\iotest");  //封装一个文件夹路径
		String[] strs = f.list() ;//获取文件名并存入数组中
		System.out.println(Arrays.toString(strs));
		
		File[] files = f.listFiles() ;//获取每个文件并封装成File对象存入数组中
		System.out.println(Arrays.toString(files));
		
	}
}	
