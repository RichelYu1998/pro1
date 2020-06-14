package cn.tedu.basic;

//这个类用来测试  变量值交换
public class Test4_Exchange {
	public static void main(String[] args) {
		//1、定义变量a和b	 TODO 动态接收键盘输入的值
		int a = 1 ;
		int b = 2 ;
		//前后都需要拼接" + ？ + "
		System.out.println("交换前：a="+a+"，b="+b);
		//2、开始交换
		int c = a ; // 把a的值交给c保存
		     a =  b ; // 把b的值交给a保存
		     b =  c ; // 把c的值交给b保存
		System.out.println("交换后：a="+a+"，b="+b);
		
	}
}
