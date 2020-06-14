package cn.tedu.overload;
//这个类用来测试  方法重载：同名方法，参数列表不同
public class Test5_Overload {
	public static void main(String[] args) {
		print('中');
		print(9.9);
		print(10);
	}
	//数据打印 int double String char boolean
	public static void print(int num) {
		System.out.println(num);
	}
	public static void print(double num) {
		System.out.println(num);
	}
	public static void print(String num) {
		System.out.println(num);
	}
	public static void print(char num) {
		System.out.println(num);
	}
	public static void print(boolean num) {
		System.out.println(num);
	}
}
