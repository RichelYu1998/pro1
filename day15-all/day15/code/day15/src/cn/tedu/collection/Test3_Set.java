package cn.tedu.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//�������������  Set�ӿڣ�Ԫ�ز����ظ� +  Ԫ����û���±�� + Ԫ������
public class Test3_Set {
	public static void main(String[] args) {
		//1����������
		Set<Integer> set = new HashSet<>();
		
		//TODO 2�����÷���
		set.add(1);
		set.add(3);
		set.add(2);
		
		set.add(1);
		set.add(2);
		
		//set�в��ܴ���ظ�Ԫ�أ�������ȥ�أ���
		System.out.println(set);
		
		//3������
		Iterator<Integer> it = set.iterator() ;
		while(it.hasNext()) {//�ж��Ƿ�����һ��Ԫ��
			Integer value = it.next() ;//��ȡԪ�ز���ָ�����
			System.out.println(value);
		}
		//foreach  for(��õ���������   ������  :   ����|Collection���� ){   } 
		for(Integer in :  set) {
			System.out.println(in);
		}
		
	}
}





