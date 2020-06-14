package cn.tedu.constructor;
//这个类用来测试  代码块
//1、构造代码块特点：在触发构造方法前先去执行构造代码块  +  用来抽取构造方法的共性  +  位置是在成员位置
//2、局部代码块特点：触发了方法   +  用来控制变量的作用范围   + 位置是在方法里
//3、执行顺序：创建对象时，先触发构造代码块再触发构造方法。调用方法后，触发局部代码块。构造代码块>构造方法>局部代码块
public class Test4_Block {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Teacher t2 = new Teacher(20);
		Teacher t3 = new Teacher("钟南山");
		//2、 每次  创建对象时  ，都会自动调用构造方法。但是，每次调用构造方法前，都先去调用构造代码块。
		//3、一定是先加载构造 代码块   再加载  构造方法。
		t.show();//7、触发show()，来执行局部代码块
	}
}
class Teacher {
	String country ;//5、由于所有构造方法都需要使用相同的变量country，所以需要把country声明成一个成员变量，在整个类中生效
	//1、构造代码块：位置是在类里方法外
	{
		country ="中国人" ;  //4、构造代码块  专门  用来  抽取所有 构造方法的共性！！
		System.out.println("构造代码块");
	}
	public Teacher() {
		System.out.println("无参构造"+country);
	}
	public Teacher(int a) {
		System.out.println("含参构造" + a + country);
	}
	public Teacher(String n) {
		System.out.println("含参构造" + n + country);
	}
	//6、局部代码块：位置是在方法里，想要执行，必须先触发方法。 + 用来 控制变量的作用范围(只在局部代码块内有效)
	public void show() {
		{
			int sum  =  10 ;
			System.out.println("局部代码块");
			System.out.println(sum);
		}
	}
}
