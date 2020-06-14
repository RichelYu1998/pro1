package cn.tedu.method;
//这个类用来测试  方法的传参
//修饰符  返回值  方法名(参数类型  参数名){}
public class Test2_Method2 {
	public static void main(String[] args) {
		//1、调用方法
		add(15) ;
		method(10,5) ;//3、方法传参时，多个参数之间逗号隔开
		function( 10,5,"皮皮霞" ) ;
	}
	public static void function( int a , int b , String c ) {
		//+  在两个数字之间用来做加法运算  
		//+  和字符串做拼接
		System.out.println(a+b+c);//15皮皮霞
	}
	//4、创建method方法，参数列表中，需要匹配参数类型  和  参数名  。
	public static void method(int a , int b) {
		System.out.println(a);
		System.out.println(b);
	}
	//2、创建add方法  ：  参数5 想要成功被接收到，参数的类型 必须和 5的 数据类型保持一致
	public static void add(int a) {
		System.out.println(a);
	}
}
