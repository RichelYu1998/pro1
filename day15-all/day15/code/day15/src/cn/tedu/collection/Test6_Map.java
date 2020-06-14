package cn.tedu.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//������������� Map�ӿڣ��������� + key�����ظ�����ظ�value�ᱻ����
public class Test6_Map {
	public static void main(String[] args) {
		//1������Map����
		Map<Integer,String> map = new HashMap<>();
		//2�����÷���
		map.put(9527, "�Ʋ���") ;
		map.put(9529, "����ɽ") ;
		map.put(9530, "Ԭ¡ƽ") ;
		map.put(9528, "�绨") ;
		map.put(9528, "����ϼ") ;//key��ͬ��value�ᱻ����
		System.out.println(map);
//		map.clear();
		System.out.println( map.containsKey(9528) );//�ж��Ƿ����ָ����key
		System.out.println( map.containsValue("tony") );//�ж��Ƿ����ָ����value
		System.out.println( map.equals("tony") );//�ж��Ƿ����
		System.out.println( map.get(9527) );//����key��ȡ��Ӧ��value
		System.out.println( map.hashCode());//��ȡmap���ڴ��еĹ�ϣ��ֵ
		System.out.println( map.isEmpty());//�ж��Ƿ�Ϊ��
		System.out.println( map.remove(9528));//����keyɾ����¼�������ض�Ӧvalue
		System.out.println( map.size());//��ȡ���ϵĳ���
		Collection<String> values = map.values() ;//��map���ϵ�value�Ǵ���Collection��
		System.out.println(values);
		
		//3������map����  -----  ��Ҫ��mapת��set
		//Set<K> keySet() --��key����set����
		Set<Integer> set = map.keySet() ;
		for (Integer key : set) {//����set�õ�ÿ��key
			String value = map.get(key) ;//����keyȥmap����value
			System.out.println(key + "����"  +value);
		}
		
		//Set<Map.Entry<K,V>> entrySet() ---��������¼��װ��Entry�������set����
		Set<Entry<Integer, String>> set2 = map.entrySet() ; 
		for (Entry<Integer, String> entry : set2) {//����set�õ�ÿ��Entry
			Integer key = entry.getKey();//��ȡEntry��key
			String value = entry.getValue();//��ȡEntry��value
			System.out.println(key + "~~~" +value);
		}
	}
}



