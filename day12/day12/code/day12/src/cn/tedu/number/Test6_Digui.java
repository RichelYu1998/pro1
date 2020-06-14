package cn.tedu.number;

import java.io.File;
import java.util.Scanner;

//这个类用来测试 递归
public class Test6_Digui {
	public static void main(String[] args) {
		//1、接收用户输入的文件夹路径
		String path = new Scanner(System.in).nextLine();
		//2、封装成File对象
		File dir = new File(path);
		//3、调用size()求总大小
		del(dir) ;
	}
	//4、创建size()求总大小
	public static void del(File dir) {
//		1、列出文件夹里的所有资源
		File[] files = dir.listFiles() ;
		
//		2、拿到每个资源。开始判断
		for (int i = 0; i < files.length; i++) {
			
			File file = files[i] ; //file表示当前获取到的资源
			if(  file.isFile()  ) {//是文件
//		3、判断，如果是文件，直接删除
				file.delete(); 
			}else if( file.isDirectory()  ) {//是文件夹
//		4、判断，如果是文件夹，开始重复的干   1   2   3  4  这几步。。。
				del(file) ;//递归，因为业务开始和size方法一样了
			}
		}
		dir.delete() ; //删除空文件夹
	}




}
