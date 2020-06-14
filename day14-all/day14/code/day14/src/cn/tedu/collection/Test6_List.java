package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;

//这个类用来测试 List接口的使用：元素可重复  +  元素都有序  + 元素有索引
public class Test6_List {
	public static void main(String[] args) {
		//1、创建List对象
		List<String> list = new ArrayList<>();
		
		//TODO 2、从Collection接口中继承来的方法
		
		//3、自己的特有方法
		list.add("java");
		list.add("php");
		list.add("hadoop");
		list.add("hadoop");
		list.add(null);
		list.add("hadoop");
		list.add(0,"皮皮霞");//按照索引添加元素
		System.out.println(list.get(1));//获取指定索引存着的元素
		System.out.println(list.indexOf("hadoop"));//获取第一次出现的索引值
		System.out.println(list.lastIndexOf("hadoop"));//获取最后一次出现的索引值
		
		System.out.println(list.remove(1));//把指定索引的元素干掉
		System.out.println(list.set(0,"刘沛霞"));//替换
		System.out.println(list);
		
		List<String> list2 = list.subList(1, 4);//截取子List，含头不含尾[1,4)
		System.out.println(list2);
		//TODO listIterator()
		
		
	}
}
