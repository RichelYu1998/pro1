package cn.tedu.staticdemo;
//这个类用来测试 静态 的调用
//总结1： 普通资源怎么调用都可以。 静态资源  只能 调用静态资源。
public class Test6_Static {
	public static void main(String[] args) {
		//创建对象测试
		Person2 p = new Person2(); p.eat();
	}
}
//创建Person2类
class Person2{
	//1、普通资源   能不能  调用  静态资源  ？   ---  可以！！
	String name;
	public void eat() {
		game();
		System.out.println( age );
	}
	//2、静态资源  能不能 调用  普通资源  ？  ---  不可以，静态只能调静态
	static int age ;  
	static public void game() {
//		System.out.println( name  );
	}
}
