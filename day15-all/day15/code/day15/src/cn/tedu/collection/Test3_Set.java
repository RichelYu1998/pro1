package cn.tedu.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//这个类用来测试  Set接口：元素不能重复 +  元素是没有下标的 + 元素无序
public class Test3_Set {
	public static void main(String[] args) {
		//1、创建对象
		Set<Integer> set = new HashSet<>();
		
		//TODO 2、常用方法
		set.add(1);
		set.add(3);
		set.add(2);
		
		set.add(1);
		set.add(2);
		
		//set中不能存放重复元素，常用来去重！！
		System.out.println(set);
		
		//3、迭代
		Iterator<Integer> it = set.iterator() ;
		while(it.hasNext()) {//判断是否有下一个元素
			Integer value = it.next() ;//获取元素并把指针后移
			System.out.println(value);
		}
		//foreach  for(获得的数据类型   遍历名  :   数组|Collection集合 ){   } 
		for(Integer in :  set) {
			System.out.println(in);
		}
		
	}
}





