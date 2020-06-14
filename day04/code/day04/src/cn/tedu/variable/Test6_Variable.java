package cn.tedu.variable;

//这个类用来测试 变量的使用
public class Test6_Variable {
	//2、成员变量：位置在类里方法外  + 作用范围是整个类中  + 可以不用手动初始化(因为有默认值)
	//3、关于成员变量的默认值：基本类型都有各自的默认值+引用类型默认值都是null
	//TODO  4、自己测试基本类型的默认值
	static String name ;
	static int age ; 
	
	public static void main(String[] args) {
		//1、局部变量：位置是在方法里 + 必须手动初始化 + 作用范围是方法里
		int count  = 9 ;
		System.out.println(count);
		
		System.out.println(name);//null
		System.out.println(age);//0
		
	}
	
}
