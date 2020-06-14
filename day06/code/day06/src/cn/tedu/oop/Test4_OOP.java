package cn.tedu.oop;

//这个类用来测试  创建多对象
public class Test4_OOP {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.color = "red";
		c.price = 10;
		c.pinpai = "BMW";
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.pinpai);
		Car c2 = new Car();
		c2.start();
		c2.stop();
		c2.color = "blue";
		c2.price = 20;
		c2.pinpai = "AUDI";
		System.out.println(c2.color);
		System.out.println(c2.price);
		System.out.println(c2.pinpai);
		
		//地址值一样吗？c是自己new的，c2也是自己new的  -- 肯定不同！！
		System.out.println(c);//cn.tedu.oop.Car@15db9742
		System.out.println(c2);//cn.tedu.oop.Car@6d06d69c
		
	}
}

// 1、创建汽车类，用来描述汽车事物
class Car {
	String color;
	double price;
	String pinpai;
	public void start() {
		System.out.println("start()...");
	}
	public void stop() {
		System.out.println("stop()...");
	}
}
