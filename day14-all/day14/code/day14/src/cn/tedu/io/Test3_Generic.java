package cn.tedu.io;
import java.util.ArrayList;
import java.util.List;
public class Test3_Generic {
	public static void main(String[] args) {
		//3����ʹ�÷���Լ���ļ��ϣ����������������Ԫ��
//		List list = new ArrayList() ;
		
		//5������Լ����Ԫ������ ��<what> --  what��ָԪ�����ͣ�����д�������Ͳ���д�������ͣ���
		List<Integer> list = new ArrayList<>() ;//4��ʹ���˷��ͣ�Լ���˼�����Ԫ�����ͱ�����String
		
		//1�����Ƽ����е�Ԫ�����ͣ�  -- ���͵�����1�����Լ�����ݵ����͡�������ͶԲſ����򼯺�����ӡ�
		//2�����͵�����2�����԰ѱ����ʱ����ǰ������д���붼ͨ����������ġ�
		//�����ǣ��򼯺�������������͵����ݣ�̫���ɣ���
		list.add(123);
//		list.add("5.5");
//		list.add("jack");
//		list.add("rose");
		System.out.println(list);
	}
}
