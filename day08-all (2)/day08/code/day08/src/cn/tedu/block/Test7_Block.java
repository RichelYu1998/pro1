package cn.tedu.block;

//这类用来 测试代码块
//TODO 总结：作用 + 触发节点  
public class Test7_Block {
	public static void main(String[] args) {
		// 测试
		Student  s = new Student();
		s.show();
		Student  s2 = new Student();
	}
}
//创建Student类
class Student{
	//1、提供静态代码块：位置是在成员位置 +  只会加载一次 + 加载的早
	static {
		System.out.println("静态 代码块");
	}
	//提供构造代码块：位置是在成员位置
	{
		System.out.println("构造  代码块 ");
	}
	//提供构造方法
	public Student() {
		System.out.println("构造方法");
	}
	//提供局部代码块
	public void show() {
		{
			System.out.println("局部 代码块");
		}
	}
	
}

