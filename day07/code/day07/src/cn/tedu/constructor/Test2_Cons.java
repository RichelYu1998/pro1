package cn.tedu.constructor;

//这个类用来测试 构造方法 专门用来创建对象
//总结1：在我们创建对象时，会自动匹配构造方法。构造方法可以重载。
public class Test2_Cons {
	public static void main(String[] args) {
		//1、无参方式创建对象 --- 会自动调用  无参构造方法！
		Person p = new Person() ;//会自动调用  无参构造方法
		//4、创建对象   -- 触发  含参构造
		Person p2 = new Person("钟爷爷");//会自动调用 String构造方法
		Person p3 = new Person(20);//会自动调用 int构造方法
		Person p4 = new Person("钟南山",85);//会自动调用 String,int构造方法
	}
}
//创建Person类   //修饰符 类名([参数列表]){ 方法体  }
class Person{
	//2、无参 构造方法   是默认存在的！  前提是：如果类中，只提供了含参构造，此时无参构造就真的没有了！！！
	public Person() {   }
	//3、提供重载形式的构造方法：方法名相同+参数列表不同
	public Person(String name) {
		System.out.println("含参构造方法"+name);
	}
	//重载形式的构造方法
	public Person(int age) {
		System.out.println("含参构造方法"+age);
	}
	public Person(String name,int age) {
		System.out.println("含参构造方法"+name+age);
	}
	
}




