package cn.tedu.thisdemo;

//这个类用来测试  this关键字
public class Test5_This {	
	public static void main(String[] args) {
		//4、无参创建对象  -- 自动触发  无参构造
		new Demo() ;
		//6、含参创建对象  -- 自动触发  含参构造
		new Demo(88);
	}
}
//创建Demo
class Demo{
	//构造方法
	public Demo() {
		//3、在无参构造中   使用  含参构造  的功能
//		this(100);
		System.out.println("无参构造");
	}
	public Demo(int age) {
		//5、在含参构造中   使用  无参构造  的功能
		this();//7、this关键字，使用在构造方法中时，必须是第一条语句！！！
		System.out.println("含参构造"+age);
	}
	
	int sum = 20 ; 
	int count = 30 ; 
	
	public void show() {
		int count = 10 ; 
		System.out.println(count);//10，变量的就近原则
		System.out.println(sum);//20
		
		//1、this用来表示本类对象的引用，相当于底层会自动创建本类对象。Demo this = new Demo(); 
		//2、当局部变量名  和  成员变量名同名 时，可以通过this来调用成员变量。否则，你会一直使用局部变量。
		System.out.println( this.count  );  //30 
	}
}


