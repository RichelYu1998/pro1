package cn.tedu.oop;

//这类用来 测试 类和对象的创建
//一个.java源文件中，可以包含多个类。但是，只能有一个类被public修饰，而且这个public的类名就是文件名。
public class Test3_OOP {
	public static void main(String[] args) {
		Phone p = new Phone() ; 
		p.call();
		p.message();
		p.music();
		p.color = "red" ;
		p.size = 5.7;
		p.pinpai = "HUAWEI" ;
		p.price = 5899.8  ;
		System.out.println( p.color  );
		System.out.println( p.size  );
		System.out.println( p.pinpai  );
		System.out.println( p.price  );
	}
}
// 1、通过class创建手机类 描述手机事物。类是抽象的，可以理解为设计图纸
class Phone {
	String color; // 颜色
	double size; // 尺寸
	String pinpai; // 品牌
	double price; // 价格
	// 3、 行为：成员方法
	// 打电话
	public void call() {
		System.out.println("call()...");
	}
	// 发短信
	public void message() {
		System.out.println("message()...");
	}
	// 听音乐
	public void music() {
		System.out.println("music()...");
	}
}
