package cn.tedu.number;
import java.util.Date;
//这个类用来测试 Date
public class Test2_Date {
	public static void main(String[] args) {
		//1、创建对象
		Date date = new Date(); 
		//2、常用方法
		System.out.println( date.getYear()  );//获取从1900到现在多少年了
		System.out.println( date.getDate()  );//获取今天是一个月中的第几天
		System.out.println( date.getDay()  );//获取今天是一周中的第几天
		System.out.println( date.getHours()  );//获取现在是几点了
		System.out.println( date.getMinutes()  );//获取现在是多少分钟
		System.out.println( date.getMonth()  );//获取月份，4   ---  底层源码显示：会获取到当前月份-1。
		System.out.println( date.getSeconds()  );//获取多少秒
		System.out.println( date.getTime()  );//获取1970 年 1 月 1 日 0点到现在的毫秒值
		System.out.println( date.toLocaleString() );//2020-5-16 11:46:32
		
	}
}







