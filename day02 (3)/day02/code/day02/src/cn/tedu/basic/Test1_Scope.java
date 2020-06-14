package cn.tedu.basic;
//这个类 用来 测试  基本类型的取值范围
//总结：
//1、定义变量：变量类型 变量名 = 变量值
//2、每个基本类型 都有 对应的 工具类(包装类)，工具类用来给基本类型提供丰富的功能
//3、char类型比较灵活，既可以存单个的字符，也可以存数字(使用时会查ascii码表)。
public class Test1_Scope {
	public static void main(String[] args) {
		// 三要素：变量类型 变量名 = 变量值
		// 整型：byte short int long
		byte max = Byte.MAX_VALUE; // 定义变量，记录byte类型的最大值
		byte min = Byte.MIN_VALUE; // 定义变量，记录byte类型的最小值
		// System.out.println( "max" );//这样打印不了变量的值，这样打印的是固定的数据max
		System.out.println(max);// 127，打印变量的值
		System.out.println(min); // -128，打印变量的值
		short max2 = Short.MAX_VALUE;
		short min2 = Short.MIN_VALUE;
		System.out.println(max2);// 32767
		System.out.println(min2);// -32768
		// int - Integer
		int max3 = Integer.MAX_VALUE;
		int min3 = Integer.MIN_VALUE;
		System.out.println(max3);// 2147483647
		System.out.println(min3);// -2147483648
		// long - Long
		long max4 = Long.MAX_VALUE;
		long min4 = Long.MIN_VALUE;
		System.out.println(max4);// 9223372036854775807
		System.out.println(min4);// -9223372036854775808
		// 浮点型： float - Float 单精度，小数位要求不精确可以用
		float max5 = Float.MAX_VALUE;
		float min5 = Float.MIN_VALUE;
		System.out.println(max5);// 3.4028235E38
		System.out.println(min5);// 1.4E-45
		// double - Double 双精度，小数位要求很精确
		double max6 = Double.MAX_VALUE;
		double min6 = Double.MIN_VALUE;
		System.out.println(max6);// 1.7976931348623157E308
		System.out.println(min6);// 4.9E-324
		// 布尔类型：true false
		boolean b = true;
		boolean b2 = false;
		// char - Character
		char c = Character.MAX_VALUE;//65535
		char c2 = Character.MIN_VALUE;//0
		System.out.println(c);
		System.out.println(c2);
		char c3 = 'a' ;
		char c4 = '1' ;
		char c5 = '中' ;//char可以存一个中文汉字
		char c6 = 97  ;//char可以存一个数字
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		//char类型可以存放一个数字。但是，在使用时，会查询ascii码表，该数字对应的字符是啥，然后使用字符本身。
		//ascii码表里规定了数字对应的字符是啥。只规定了0-127对应的字符。128-65535默认都对应？字符。
		System.out.println(c6);//a
		
	}
}
