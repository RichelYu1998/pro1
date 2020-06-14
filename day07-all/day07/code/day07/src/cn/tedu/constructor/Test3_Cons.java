package cn.tedu.constructor;
//这个类用来测试 构造方法 给成员变量赋值
//总结1： 在创建对象时，可以含参的方式创建对象。同时把参数会传递给构造方法。构造方法拿到值就给成员变量直接赋值。
public class Test3_Cons {
	public static void main(String[] args) {
		Animal a = new Animal() ; //会自动触发 无参构造
		Animal a2 = new Animal(3) ; //会自动触发 含参构造
		
	}
}
class Animal{
	private int age ; 
	
	//默认就会存在  无参  构造 ！！
	public Animal( ) {    }
	
	public Animal(int a) {
		age = a ;//创建对象时，传递过来的参数，交给了a保存。a拿到值，给成员变量age赋值。
		System.out.println(age);
	}
	
}
