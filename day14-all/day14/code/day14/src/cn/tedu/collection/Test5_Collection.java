package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//������������� collection�ӿڵ�ʹ��
public class Test5_Collection {
	public static void main(String[] args) {
		//1������collection����
		Collection<String> c  = new ArrayList<>();
		
		//2�����÷���
		c.add("jack");//���Ԫ��
		c.add("rose");
		c.add("hanmeimei");
		c.add("lilei");
//		c.clear(); //��ռ���
		System.out.println(c.contains("jack") );//�ж��Ƿ����
		System.out.println(c.equals("hanmeimei") );//�ж��Ƿ����
		System.out.println(c.hashCode());//��ȡ�������ڴ��еĹ�ϣ��ֵ
		System.out.println(c.isEmpty());//�жϼ����Ƿ�Ϊ��
		System.out.println(c.remove("lilei"));//ɾ��ָ��Ԫ��
		System.out.println(c.size());//��ȡ���ϵĳ���
		Object[] obs = c.toArray();//�Ѽ����е�Ԫ�ط���������
		System.out.println(Arrays.toString(obs));
		
		//���ϼ�Ĳ���----
		Collection<String> c2  = new ArrayList<>();
		
		//3�����÷���
		c2.add("jack");//���Ԫ��
		c2.add("rose");
		c2.add("hello");
		
		System.out.println(c.addAll(c2));//�����һ������
		System.out.println(c.containsAll(c2));//�Ƿ������һ������
		System.out.println(c);
//		System.out.println(c.removeAll(c2));//ɾ����һ������
//		System.out.println(c);
//		System.out.println(c.retainAll(c2));
//		System.out.println(c);
//		
		//4������Ԫ�صĵ���
		Iterator<String> it = c.iterator() ;
		while( it.hasNext() ) {//hasNext()�����жϼ������Ƿ�����һ��Ԫ�أ��оͷ���true
			String value = it.next() ; //next()��ȡ��������Ԫ��
			System.out.println(value);
		}
		
	}
}
