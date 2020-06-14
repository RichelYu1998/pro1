package cn.tedu.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//这个类用来测试 Map接口：数据无序 + key不能重复如果重复value会被覆盖
public class Test6_Map {
	public static void main(String[] args) {
		//1、创建Map对象
		Map<Integer,String> map = new HashMap<>();
		//2、常用方法
		map.put(9527, "唐伯虎") ;
		map.put(9529, "钟南山") ;
		map.put(9530, "袁隆平") ;
		map.put(9528, "如花") ;
		map.put(9528, "刘沛霞") ;//key相同，value会被覆盖
		System.out.println(map);
//		map.clear();
		System.out.println( map.containsKey(9528) );//判断是否包含指定的key
		System.out.println( map.containsValue("tony") );//判断是否包含指定的value
		System.out.println( map.equals("tony") );//判断是否相等
		System.out.println( map.get(9527) );//根据key获取对应的value
		System.out.println( map.hashCode());//获取map在内存中的哈希码值
		System.out.println( map.isEmpty());//判断是否为空
		System.out.println( map.remove(9528));//根据key删除记录，并返回对应value
		System.out.println( map.size());//获取集合的长度
		Collection<String> values = map.values() ;//把map集合的value们存入Collection中
		System.out.println(values);
		
		//3、迭代map集合  -----  需要把map转成set
		//Set<K> keySet() --把key存入set集合
		Set<Integer> set = map.keySet() ;
		for (Integer key : set) {//遍历set得到每个key
			String value = map.get(key) ;//拿着key去map里找value
			System.out.println(key + "：："  +value);
		}
		
		//Set<Map.Entry<K,V>> entrySet() ---把整条记录封装成Entry对象存入set集合
		Set<Entry<Integer, String>> set2 = map.entrySet() ; 
		for (Entry<Integer, String> entry : set2) {//遍历set得到每个Entry
			Integer key = entry.getKey();//获取Entry的key
			String value = entry.getValue();//获取Entry的value
			System.out.println(key + "~~~" +value);
		}
	}
}



