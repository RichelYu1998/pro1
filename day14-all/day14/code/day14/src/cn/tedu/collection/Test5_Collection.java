package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//这个类用来测试 collection接口的使用
public class Test5_Collection {
	public static void main(String[] args) {
		//1、创建collection对象
		Collection<String> c  = new ArrayList<>();
		
		//2、常用方法
		c.add("jack");//添加元素
		c.add("rose");
		c.add("hanmeimei");
		c.add("lilei");
//		c.clear(); //清空集合
		System.out.println(c.contains("jack") );//判断是否包含
		System.out.println(c.equals("hanmeimei") );//判断是否相等
		System.out.println(c.hashCode());//获取集合在内存中的哈希码值
		System.out.println(c.isEmpty());//判断集合是否为空
		System.out.println(c.remove("lilei"));//删除指定元素
		System.out.println(c.size());//获取集合的长度
		Object[] obs = c.toArray();//把集合中的元素放入数组中
		System.out.println(Arrays.toString(obs));
		
		//集合间的操作----
		Collection<String> c2  = new ArrayList<>();
		
		//3、常用方法
		c2.add("jack");//添加元素
		c2.add("rose");
		c2.add("hello");
		
		System.out.println(c.addAll(c2));//添加另一个集合
		System.out.println(c.containsAll(c2));//是否包含另一个集合
		System.out.println(c);
//		System.out.println(c.removeAll(c2));//删除另一个集合
//		System.out.println(c);
//		System.out.println(c.retainAll(c2));
//		System.out.println(c);
//		
		//4、集合元素的迭代
		Iterator<String> it = c.iterator() ;
		while( it.hasNext() ) {//hasNext()用来判断集合中是否还有下一个元素，有就返回true
			String value = it.next() ; //next()获取迭代到的元素
			System.out.println(value);
		}
		
	}
}
