package cn.tedu.collection;

import java.util.LinkedList;

//�������������  LinkedList
public class Test2_LinkedList {
	public static void main(String[] args) {
		//1������LinkedList����
		LinkedList<Integer> ll = new LinkedList<>() ;
		//TODO 2���̳����ķ�������
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		//3�����з���
		ll.addFirst(99); //�����Ԫ��
		ll.addLast(100);//���βԪ��
		System.out.println(ll);
		
		System.out.println( ll.getFirst() );//��ȡ��Ԫ��
		System.out.println( ll.getLast() );//��ȡβԪ��
		
		System.out.println( ll.removeFirst() );//�Ƴ���Ԫ��
		System.out.println( ll.removeLast() );//�Ƴ�βԪ��
		System.out.println(ll);
	}
}
