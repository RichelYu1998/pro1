package cn.tedu.io;

//������������� ���͵�ͨ����
public class Test4_Generic {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};	
		Double[] b = {1.1,2.2,3.3,4.4,5.5};	
		String[] c = {""};	
		
		print(a) ;
		print(b) ;
		print(c) ;//1�������ǣ��ֵ��ṩ���ص�print()!!
	}
	//2����ǰ�����б�д���ˣ������Ǿ������͡�����д��ͨ�ô��룬ֻҪ��E�������;��С�
	public static <E> void print(E[] a) {
//		for (int i = 0; i < a.length; i++) {   System.out.println(a[i]);   }
		//foreach�﷨�������ͨforѭ����ִ��Ч��  +  �﷨��� 
		//for( ��ȡ������������   ������ : ��Ҫѭ����������){  ѭ����  }
		for( E  in : a ){  
			System.out.println(in);//in��ʾ��ǰ��ȡ��������
		}
	}
}
