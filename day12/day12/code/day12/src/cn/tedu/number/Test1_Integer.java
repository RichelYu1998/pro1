package cn.tedu.number;

//这个类用来测试  包装类型
public class Test1_Integer {
	public static void main(String[] args) {
		//1、创建Integer对象---目的就是把基本类型  包装成  包装类型
		Integer in = new Integer(5) ;
		Integer in2 = Integer.valueOf(5) ; //高效，底层显示：如果你的数据在-128~127范围内，直接放如缓存数组中(相同数据不再存)。
		Integer in3 = Integer.valueOf(5) ; 
		//测试，静态方法valueOf，相同数据不再开辟空间存放了吗？--是的，节省内存和时间，高效。
		System.out.println( in2 == in3 );//true
		//2、常用方法
		int value = in.intValue() ;  // 把包装类型的值  变成 基本类型
		System.out.println(value);
		int intValue = Integer.parseInt("123");//把  字符串类型的数字转成 基本类型
		System.out.println(intValue);
		//1、创建Double对象 -- 目的就是把一个 基本类型  转成  包装类型
		Double d = new Double(5.5);
		Double d2 = Double.valueOf(5.5);//高效？不高效，底层显示和new一样
		//2、常用方法
		double value1 = d2.doubleValue(); //把  包装类型 变回成 基本类型
		System.out.println(value1);
		double doubleVal = Double.parseDouble("5.5"); //把 字符串类型的小数 变成  基本类型
		System.out.println(doubleVal);
	}
}
