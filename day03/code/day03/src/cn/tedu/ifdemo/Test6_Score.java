package cn.tedu.ifdemo;

import java.util.Scanner;

//这个类用来测试  学员得分
public class Test6_Score {
	public static void main(String[] args) {
		//1、接收用户输入的分数
		int score = new Scanner(System.in).nextInt() ;
		
		//3、为了增强程序的健壮性，我们必须限制用户输入的数值
		if(   score <0  ||  score>100    ) {
			System.out.println("请您输入100以内的正整数！");
			
			return ; //让程序结束！！
		}
		
		//2、判断
		if(  score >= 90 ) {//90分以上 优秀  
			 System.out.println("优秀");
		}else if(  score>=80 &&  score<=89  ) {//80~89 良好  
			System.out.println("良好");
		}else if(  score>=70 &&  score<=79  ) { //		70~79 中等  
			System.out.println("中等");
		}else if(  score>=60 &&  score<=69  ) { //		60~69 及格   
			System.out.println("及格 ");
		}else if(  score<60  ) { //		60分以下 不及格
			System.out.println("不及格 ");
		}
		
	}
}
