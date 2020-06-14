package cn.tedu.collection;

import java.util.ArrayList;

//这个类用例测试  ArrayList
public class Test1_ArrayList {
	public static void main(String[] args) {
		//TODO 1、创建ArrayList对象
		ArrayList<Integer> al = new ArrayList<>();
		//TODO 2、调用方法
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(100);//底层会完成自动装箱的过程，把基本类型的值变成包装类型，存入集合中
		//remove()可以按照下标删除，也可以直接指定元素值
		System.out.println(  al.remove(2)  );//按照下标删
		//想要直接删除数字100--需要删除包装类型的100
		System.out.println(  al.remove( Integer.valueOf(100) ) );
		System.out.println(al);
		
	}
	
}
