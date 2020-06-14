package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//这个类用来测试  异常
public class Test4_Exception {
	public static void main(String[] args) {
		// method() ; //暴露异常：这个过程，咱们自己测试就可以了，千万不要让用户看见！！
//		method2() ; // 异常处理：捕获 
		try {
			method3() ; // 异常处理：抛出
		} catch (Exception e) {//多态，把子类当父类来看，写出通用代码
//			e.printStackTrace();
			System.out.println("输入有误！！");
		}
	}
	//2、抛出：在方法声明上添加，  throws  异常类型1,异常类型2,异常类型3
//	public static void method3() throws ArithmeticException,InputMismatchException{
	public static void method3() throws Exception{//多态，把子类当父类来看，写出通用代码
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println(a / b);
	}
	
	//1、捕获异常：	try{  ......    }catch(异常类型 变量名){   	合理的解决方案    }
	public static void method2() {
		try {
			int a = new Scanner(System.in).nextInt();
			int b = new Scanner(System.in).nextInt();
			System.out.println(a / b);
		}catch(ArithmeticException a) {//异常类型1
			System.out.println("第二次输入不能为0！");//合理的解决方案1
		}catch(InputMismatchException b){//异常类型2	
			System.out.println("请输入两次整数！");//合理的解决方案2   
		}catch(Exception a) {
			//2、参数Exception就是多态，不关心具体的子类类型是谁，会把所有子类当父类来看，写出通用代码
			System.out.println("请输入正确数据！");   
		}
	}
	//0、暴露异常
	public static void method() {
		// 1、接收用户输入的两个整数
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();

		// 2、做除法运算
		System.out.println(a / b);
	}
}
