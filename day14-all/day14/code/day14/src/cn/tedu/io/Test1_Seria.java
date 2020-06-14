package cn.tedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//这个类用来测试 序列化  反序列化
public class Test1_Seria {
	public static void main(String[] args) {
//		method() ; //序列化
		method2();//反序列化
	}
	//反序列化：把磁盘中已经序列化好的文件，读取，恢复成Java对象
	public static void method2() {
		try {
			//创建反序列化对象
			ObjectInputStream in = new ObjectInputStream(
										new FileInputStream("D:\\iotest\\1.txt"));
			//开始反序列化
			Object obj = in.readObject();
			System.out.println(obj);//Student [name=皮皮霞, age=22]
			//释放资源
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//序列化：把Java对象， 输出 ，永久保存到磁盘中
	public static void method() {
		try {
			Student s = new Student("皮皮霞",22);
			//创建序列化对象
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\iotest\\1.txt")) ;
			//开始序列化
			out.writeObject(s);
			//释放资源
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
//创建Student
//1、如果你的文件，想要支持序列化，必须实现Serializable接口，算是开启了序列化功能
//否则：java.io.NotSerializableException: cn.tedu.io.Student
class Student implements Serializable{
	
	//2、自动生成本文件的一个唯一标识，版本号id
	private static final long serialVersionUID = 1L;
	
	//构造方法
	public Student() {}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name ;
	private int age ;
	//set() get()
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	//toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}






