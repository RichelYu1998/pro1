package cn.tedu.multi;

//这类用来 测试  多态 
public class Test2_Multi {
	public static void main(String[] args) {
		//创建子类对象测试
		Dog d = new Dog();  
		d.eat();   //狗吃肉
		//创建多态对象测试
		Animal a = new  Dog() ;  //口诀1：父类引用  指向 子类对象，多态  / 向上转型 
		a.eat()  ; // 口诀2：编译看左边，运行看右边
		//2、编译看左边：意思是 想要保存成功 必须  使用 左边也就是父类 提供的功能！！！
		//3、运行看右边： 意思是   最终的执行结果 以子类的 实现为准！！
		//4、多态的好处：是用来统一调用的标准！！！标准就是父类！！！！如果父类没提供就不能用！！
	}
}
//1、多态前提：继承 + 重写
class Animal{
	public void eat() {
		System.out.println("吃啥都行") ;
	}
}
class Dog extends Animal{
	//方法重写
	public void eat() {
		System.out.println("狗吃肉");
	}
}
