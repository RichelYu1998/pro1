package cn.tedu.basic;
//这个类用来 测试  输入个人信息
//总结：
//1、通过+拼接字符串
//2、如果要在中间动态拼接字符串，固定写法   "+?????+"  
public class Test2_Info {
	public static void main(String[] args) {
		String name = "皮皮霞2" ; //定义变量，记录名字
		System.out.println(  name+"大家好，我叫"+name);
		
		//需求：把下面这句话的  静态数据  和  动态数据  分离，然后把动态数据动态拼接
		//如果要在中间拼接字符串，固定写法   "+?????+"
		System.out.println("大家好，我叫"+name+"，今年18岁。");
		
		String a = "php" ;
		System.out.println("我爱学"+a);  
		System.out.println("我爱学"+a+"。");  
	}
}
