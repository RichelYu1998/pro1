package cn.tedu.breakdemo;

import java.util.Scanner;

//这个类用来测试   结束循环
//找数字88
public class Test4_Break {
	public static void main(String[] args) {
		//循环结构，循环100次
		for(int i = 0 ; i < 100 ; i++) {
			//1，接收100次，用户输入的整数
			int input = new Scanner(System.in).nextInt();
			
			//2，判断是不是88
			if( input == 88 ) {//是88
				System.out.println("中了");
				//a，break和continue都只能用于循环结构中，结束循环
				//b，break和continue之后不要再出现代码了，是不可到达的代码
				break ; //循环结束，循环只要看到break就会立刻结束
			}else {//不是88
				continue ; //继续输入
			}
		}
		
	}
}
