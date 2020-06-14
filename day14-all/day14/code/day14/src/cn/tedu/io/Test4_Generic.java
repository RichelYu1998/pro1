package cn.tedu.io;

//这个类用来测试 泛型的通用性
public class Test4_Generic {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};	
		Double[] b = {1.1,2.2,3.3,4.4,5.5};	
		String[] c = {""};	
		
		print(a) ;
		print(b) ;
		print(c) ;//1、问题是：又得提供重载的print()!!
	}
	//2、以前参数列表，写死了，必须是具体类型。泛型写出通用代码，只要是E泛型类型就行。
	public static <E> void print(E[] a) {
//		for (int i = 0; i < a.length; i++) {   System.out.println(a[i]);   }
		//foreach语法：提高普通for循环的执行效率  +  语法简洁 
		//for( 获取到的数据类型   变量名 : 想要循环的数组名){  循环体  }
		for( E  in : a ){  
			System.out.println(in);//in表示当前获取到的数据
		}
	}
}
