package cn.tedu.basic;

import java.util.Scanner;

//这个类用来测试 最大值
//总结：
//1、三元运算符的使用  ，重点是语法：  1  ?  2 ： 3
public class Test3_Max {
	public static void main(String[] args) {
		//1、定义变量  TODO  动态接收键盘输入的值再测试
		int a = new Scanner(System.in).nextInt() ;
		int b = new Scanner(System.in).nextInt()  ;
		int c = new Scanner(System.in).nextInt()  ;
		
		//2、开始比  两个数  里的  大值   -- 三元运算符 --  1  ?  2  :  3
		//最终max记录的到底是a还是b呢？--不确定，要看a<b成立吗？
		//如果成立a就交给max记录，否则b交给max记录
		int max =  a  >  b   ?  a  :  b ; 
		System.out.println("a b里的大值是："+max);
		
		//3、三个数里的大值
		//最终result记录的到底是max还是c呢？--不确定，要看max > c成立吗？
		//如果成立max就交给result记录，否则c交给result记录
		int result = max > c  ?  max  :  c   ;
		System.out.println("a b c 里的大值是："+result);
		
		//TODO  把上面比较的两步合并成一步
		
	}
}
