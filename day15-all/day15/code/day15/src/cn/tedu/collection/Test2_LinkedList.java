package cn.tedu.collection;

import java.util.LinkedList;

//这个类用例测试  LinkedList
public class Test2_LinkedList {
	public static void main(String[] args) {
		//1、创建LinkedList对象
		LinkedList<Integer> ll = new LinkedList<>() ;
		//TODO 2、继承来的方法调用
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		//3、特有方法
		ll.addFirst(99); //添加首元素
		ll.addLast(100);//添加尾元素
		System.out.println(ll);
		
		System.out.println( ll.getFirst() );//获取首元素
		System.out.println( ll.getLast() );//获取尾元素
		
		System.out.println( ll.removeFirst() );//移除首元素
		System.out.println( ll.removeLast() );//移除尾元素
		System.out.println(ll);
	}
}
