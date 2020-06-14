package cn.tedu.number;

import java.math.BigDecimal;
import java.util.Scanner;

//这个类用来测试 浮点数运算
public class Test4_Double {
	public static void main(String[] args) {
		// method();//暴露问题
		method2();// 解决浮点运算不精确的现象 BigDecimal
	}

	public static void method2() {
		// 1、接收用户输入的两个小数
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		//2、创建对象 --  建议使用 String类型  的构造方法
		BigDecimal bd1 = new BigDecimal(a+"");
		BigDecimal bd2 = new BigDecimal(b+"");
		
		// 3、做运算
		BigDecimal bd3 ; //定义bd3保存计算结果
		bd3 = bd1.add(bd2) ;//加法
		System.out.println(bd3);
		bd3 = bd1.subtract(bd2) ;//减法
		System.out.println(bd3);
		bd3 = bd1.multiply(bd2) ;//乘法
		System.out.println(bd3);
//		bd3 = bd1.divide(bd2) ;//除法java.lang.ArithmeticException: 除不尽
		//-------------divide(a,b,c)--a是指要运算的对象名  ---b是指要保留几位小数 ---c是指舍入方式
		bd3 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP) ;//除法
		System.out.println(bd3);
	}

	public static void method() {
		// 1、接收用户输入的两个小数
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();

		// 2、做运算
		System.out.println(a + b);// 不精确
		System.out.println(a - b);// 不精确
		System.out.println(a * b);// 不精确
		System.out.println(a / b);// 不精确

	}
}
