package cn.tedu.finaldemo;
//这个类用来测试   final关键字
public class Test1_Final {
	public static void main(String[] args) {
		Erzi erzi = new Erzi();
//		erzi.name = "赵" ;    //3.1、报错，已经被final了，值不能改，只能用用！！！
		System.out.println(erzi.NAME);
		System.out.println( BaBa.NAME );
	}
}
//创建父类
//final class BaBa{//1、父类被final修饰后，变成了最终的类，不能被继承。The type Erzi cannot subclass the final class BaBa
class BaBa{
	//2、当变量被final修饰后，就成了常量。值不能被修改。The final field BaBa.name cannot be assigned
	//4、常量名一般都是大写的。为了外界方便调用，通常也会被static修饰。
	static final String NAME = "刘" ;
	//3、当方法被final修饰后，就成了最终方法，不能被重写。Cannot override the final method from BaBa
	final public void study() {
		System.out.println("赚钱养家");
	}
}
//创建子类
class Erzi extends BaBa{
	//方法重写：方法声明和父类一模一样
//	public void study() {
//		System.out.println("热爱java");
//	}
}






