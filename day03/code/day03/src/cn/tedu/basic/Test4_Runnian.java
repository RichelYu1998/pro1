package cn.tedu.basic;

import java.util.Scanner;

//这个类用来测试   平年闰年
	//1、能被4整除，并且不能被100整除
	//2、能被400整除
public class Test4_Runnian {
	public static void main(String[] args) {
		//1、接收用户输入的年号 --整数
		int year = new Scanner(System.in).nextInt() ;
		
		//2、判断，到底是不是闰年
		//if(  判断条件  ){ 满足条件的代码   }
		//if(  大条件1  ||   大条件2  ){ 满足条件的代码   }
		//if(  小条件1 &&  小条件2   ||   能被400整除  ){ 满足条件的代码   }
		//if(  能被4整除 &&  不能被100整除   ||   能被400整除  ){ 满足条件的代码   }
		String desc  =  "平年" ; //默认每年都是平年
		if(  ( year % 4 ==  0  &&  year % 100  != 0 )  ||  year % 400 == 0   ){ 
//			满足条件的代码   -- 修改desc的值，变成闰年
			desc = "闰年" ; 
		}
		System.out.println(year+"年是"+desc); //TODO 自己提取动态数据 拼接字符串
	}
}
