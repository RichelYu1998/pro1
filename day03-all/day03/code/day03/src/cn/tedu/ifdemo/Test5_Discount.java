package cn.tedu.ifdemo;

import java.util.Scanner;

//这个类用来测试 商品打折
public class Test5_Discount {
	public static void main(String[] args) {
		//1，接收用户输入的原价
		double price = new Scanner(System.in).nextDouble() ;
		
		//2、计算折后价，并打印
		double dis = price ; //定义变量，记录折后价
		if( price >= 5000 ) {//满5000打5折
			dis = price*0.5  ; 
		}else if( price >= 2000 ) {//满2000打8折
			dis = price*0.8  ; 
		}else if( price >= 1000 ) {//满1000打9折
			dis = price*0.9  ; 
		}
		
		System.out.println("原价是：" + price + "，折后价是："+dis);
		
	}
}
