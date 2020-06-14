package cn.tedu.whiledemo;

import java.util.Random;
import java.util.Scanner;

//这个类用来测试  循环结构
public class Test5_While {
	public static void main(String[] args) {
		// 猜数字
		// 1、让程序产生随机数
		// nextInt(m)--是指产生m以内的随机数，从0开始
		int random = new Random().nextInt(100);
		System.out.println(random);

		//死循环只能用while吗？-- for行吗？--可以，只需要让循环条件永远成立！
//		for( int i = 1 ; i >= 1 ; i++  ) {
		do { // 循环条件一直满足--true，经典的死循环。必须设置合理的出口！！！。
	// while( random>50 ) {//循环条件可以自己决定
			// 2、一直接收用户输入的整数
			int input = new Scanner(System.in).nextInt();
			// 3、开始比较
			if (input > random) {
				System.out.println("大了");
			} else if (input < random) {
				System.out.println("小了");
			} else if (input == random) {
				System.out.println("中了");
				break; // 给死循环设置出口！！！
			}
		}while (true);

	}
}
