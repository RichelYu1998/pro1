package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;

//������������� List�ӿڵ�ʹ�ã�Ԫ�ؿ��ظ�  +  Ԫ�ض�����  + Ԫ��������
public class Test6_List {
	public static void main(String[] args) {
		//1������List����
		List<String> list = new ArrayList<>();
		
		//TODO 2����Collection�ӿ��м̳����ķ���
		
		//3���Լ������з���
		list.add("java");
		list.add("php");
		list.add("hadoop");
		list.add("hadoop");
		list.add(null);
		list.add("hadoop");
		list.add(0,"ƤƤϼ");//�����������Ԫ��
		System.out.println(list.get(1));//��ȡָ���������ŵ�Ԫ��
		System.out.println(list.indexOf("hadoop"));//��ȡ��һ�γ��ֵ�����ֵ
		System.out.println(list.lastIndexOf("hadoop"));//��ȡ���һ�γ��ֵ�����ֵ
		
		System.out.println(list.remove(1));//��ָ��������Ԫ�ظɵ�
		System.out.println(list.set(0,"����ϼ"));//�滻
		System.out.println(list);
		
		List<String> list2 = list.subList(1, 4);//��ȡ��List����ͷ����β[1,4)
		System.out.println(list2);
		//TODO listIterator()
		
		
	}
}
