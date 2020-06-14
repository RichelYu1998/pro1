package cn.tedu.abstractdemo;

//这个类用来测试 抽象类
public class Test5_Abstract {
	public static void main(String[] args) {
		// 创建多态对象测试
		Animal an = new Dog();
		an.eat();
		an.play();
	}
}
// 2、如果一个类中，包含了抽象方法 ，这个类必须是抽象类
// 3、抽象类是一个特殊的 类 ，特殊在 抽象类里 可以包含 抽象方法
abstract class Animal {
	// 1、如果方法没有方法体，就是抽象方法，使用abstract关键字
	abstract public void eat();

	public void play() {
		System.out.println("Animal...play()");
	}
}
// 4、子类 如果 继承了 抽象的父类 ，子类两条路：把所有抽象方法都重写 或者 是一个抽象的子类。
// abstract class Dog extends Animal{
class Dog extends Animal {
	//5、重写抽象方法
	public void eat() {
		System.out.println("狗吃肉");
	}
}
