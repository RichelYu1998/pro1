package cn.tedu.collection;

import java.util.ArrayList;

//�������������  ArrayList
public class Test1_ArrayList {
	public static void main(String[] args) {
		//TODO 1������ArrayList����
		ArrayList<Integer> al = new ArrayList<>();
		//TODO 2�����÷���
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(100);//�ײ������Զ�װ��Ĺ��̣��ѻ������͵�ֵ��ɰ�װ���ͣ����뼯����
		//remove()���԰����±�ɾ����Ҳ����ֱ��ָ��Ԫ��ֵ
		System.out.println(  al.remove(2)  );//�����±�ɾ
		//��Ҫֱ��ɾ������100--��Ҫɾ����װ���͵�100
		System.out.println(  al.remove( Integer.valueOf(100) ) );
		System.out.println(al);
		
	}
	
}
