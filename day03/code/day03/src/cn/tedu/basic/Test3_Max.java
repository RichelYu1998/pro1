package cn.tedu.basic;

import java.util.Scanner;

//������������� ���ֵ
//�ܽ᣺
//1����Ԫ�������ʹ��  ���ص����﷨��  1  ?  2 �� 3
public class Test3_Max {
	public static void main(String[] args) {
		//1���������  TODO  ��̬���ռ��������ֵ�ٲ���
		int a = new Scanner(System.in).nextInt() ;
		int b = new Scanner(System.in).nextInt()  ;
		int c = new Scanner(System.in).nextInt()  ;
		
		//2����ʼ��  ������  ���  ��ֵ   -- ��Ԫ����� --  1  ?  2  :  3
		//����max��¼�ĵ�����a����b�أ�--��ȷ����Ҫ��a<b������
		//�������a�ͽ���max��¼������b����max��¼
		int max =  a  >  b   ?  a  :  b ; 
		System.out.println("a b��Ĵ�ֵ�ǣ�"+max);
		
		//3����������Ĵ�ֵ
		//����result��¼�ĵ�����max����c�أ�--��ȷ����Ҫ��max > c������
		//�������max�ͽ���result��¼������c����result��¼
		int result = max > c  ?  max  :  c   ;
		System.out.println("a b c ��Ĵ�ֵ�ǣ�"+result);
		
		//TODO  ������Ƚϵ������ϲ���һ��
		
	}
}
