package cn.tedu.method;

import java.util.Random;

//这个类用来测试  方法的返回值
public class Test3_Method3 {
	public static void main(String[] args) {
		
		//1、sum记录着add()的返回值
		int sum = add(10,5) ;
		System.out.println(sum);//50
		
		//TODO 5、练习：
		String str = concat("jack",10,5);
		System.out.println(str);// jack15  ?  jack105
	}
	//6、创建concat()
	public static String concat(String m , int n , int o){
		//7、通过return关键字把结果返回给调用位置。+起的作用就是拼接字符串
		return m+n+o ;
	}
	
	//2、创建add(10,5)
	//3、返回值的类型  和  sum的类型一致
	public static int add(int a , int b) {
		//4、通过return 关键字 把结果返回调用位置
		return a*b ; 
	}
	
	
	
	
}
