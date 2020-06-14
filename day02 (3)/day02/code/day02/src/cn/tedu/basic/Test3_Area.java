package cn.tedu.basic;
import java.util.Scanner;
//这个类用来测试  圆形面积
//总结
//1、用+拼接字符串
//2、打印时也可以直接打印一个公式
//3、动态接收键盘输入的值
public class Test3_Area {
	public static void main(String[] args) {
		
//		double r = 5.5 ; //定义变量，记录半径
		double r = new Scanner(System.in).nextDouble() ; //动态接收键盘输入的值
		double result = 3.14*r*r  ;
		
		System.out.println("圆的面积是："+result);
		
		//求圆的周长 2*3.14*r
		System.out.println(  2*3.14*r );
		
	} 
}
