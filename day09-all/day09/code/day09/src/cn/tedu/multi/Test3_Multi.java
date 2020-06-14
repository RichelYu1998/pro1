package cn.tedu.multi;
//这类用来测试 多态的使用
//1、成员变量：由于不存在重写，所以直接使用父类的
//2、成员方法：由于存在重写，所以调用了父类的  方法声明  ，使用了  子类的 方法体
//3、静态资源：由于不存在重写，所以直接使用父类的  方法声明 和方法体
public class Test3_Multi {
	public static void main(String[] args) {
		// 创建多态对象测试
		Fu f= new Zi() ; //父类引用  指向 子类对象
		//3、编译看左边，只要想用的功能，必须是父类提供的。
		    //运行看右边，多指发生了方法重写后，使用右边的也就是子类的方法体。
		//1、成语方法的使用，一定是使用父类的(方法声明)，但是，方法体，由于可以重写，所以用子类的方法体。
		f.study();  //我爱java，
		//2、成员变量的使用，一定是使用父类的，由于不存在重写，所以执行的也是父类的。
		System.out.println( f.name  );  // jack，
		//3、静态方法，可以存在重写吗？  --  不可以！！！
//		f.play();  //由于静态资源根本不存在重写，所以直接执行父类的方法声明和方法体。即使子类有一个和父类一模一样的方法也不是重写！！！
	}
}
class Fu{
	String name = "jack" ;
	public void study() {
		System.out.println("爸爸正在学习");
	}
}
class Zi extends Fu{
	String name = "xiongda" ;
	//方法重写
	public void study() {
		System.out.println("我爱java");
	}
}
