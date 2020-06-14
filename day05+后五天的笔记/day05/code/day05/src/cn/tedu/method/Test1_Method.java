package cn.tedu.method;

//这个类用来测试  方法的调用
public class Test1_Method {

	public static void main(String[] args) {
		System.out.println(9);
		print();//2、调用指定的方法
		System.out.println(8);
	}

	// 1、创建print()
	// 修饰符 返回值 方法名(参数列表){ 方法体 }
	public static void print() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}

}
