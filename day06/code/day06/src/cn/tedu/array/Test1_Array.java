package cn.tedu.array;

import java.util.Random;

//�����������������
public class Test1_Array {
	public static void main(String[] args) {
		method();// �������飬����1��10
		method2();//�������飬���������
	}
	public static void method2() {
		// 1���������飬��̬��ʼ��
		int a[] = new int[5];
		
		// 2���������飬�����±�
		for (int i = 0; i < a.length; i++) {
			// 3�������±��ȡÿ�����ݣ��޸ĳ�1-10
			a[i] = new Random().nextInt(100) ;
		}
		
		// 4����ӡ���������(������Ҫ���������ÿ������)
		for (int i = 0; i < a.length; i++) {
			System.out.println( a[i] );
		}
		
	}
	public static void method() {
		// 1���������飬��̬��ʼ��
		int a[] = new int[10];
		
		// 2���������飬�����±�
		for (int i = 0 ;  i < a.length ; i++) {
			// 3�������±��ȡÿ�����ݣ��޸ĳ�1-10
			a[i] = i+1 ;   //a[i]�����±�i��ȡa�����������
		}

		// 4����ӡ���������(������Ҫ���������ÿ������)
		for (int i = 0 ;  i < a.length ; i++) {
			System.out.println( a[i] );
		}
		
		System.out.println(a);//[I@15db9742��ֵַ
	}
}
