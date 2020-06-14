package cn.tedu.array;

//这个类用来测试 数组的创建
public class Test6_Array {
	public static void main(String[] args) {
		//1、创建数组 ，存入hello
		//--静态初始化 ：一开始刚创建好时，存的都是默认值，char类型默认值是\u0000。
		char[] a = new char[] { 'h' , 'e' , 'l' ,'l' ,'o'  } ;
		char[] b = {  'h' , 'e' , 'l' ,'l' ,'o'  } ; 
		
		//--动态初始化，需要在创建数组的同时，指定长度！！
		char[] c = new char[5];
		c[0] = 'h' ; //把下标为0的数据，从默认值\u0000改为'h'
		c[1] = 'e' ;//把下标为1的数据，从默认值\u0000改为'e'
		c[2] = 'l' ;//把下标为2的数据，从默认值\u0000改为'l'
		c[3] = 'l' ;//把下标为3的数据，从默认值\u0000改为'l'
		c[4] = 'o' ;//把下标为4的数据，从默认值\u0000改为'o'
		
		//数组的长度如果是5，下标最大值是4的话，有没有下标为5的元素---没有！！！
		//java.lang.ArrayIndexOutOfBoundsException：原因就是访问了不存在的下标5
		//c[5] = 'x';
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
	}
}
