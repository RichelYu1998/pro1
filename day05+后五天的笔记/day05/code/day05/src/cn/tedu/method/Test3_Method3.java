package cn.tedu.method;

import java.util.Random;

//�������������  �����ķ���ֵ
public class Test3_Method3 {
	public static void main(String[] args) {
		
		//1��sum��¼��add()�ķ���ֵ
		int sum = add(10,5) ;
		System.out.println(sum);//50
		
		//TODO 5����ϰ��
		String str = concat("jack",10,5);
		System.out.println(str);// jack15  ?  jack105
	}
	//6������concat()
	public static String concat(String m , int n , int o){
		//7��ͨ��return�ؼ��ְѽ�����ظ�����λ�á�+������þ���ƴ���ַ���
		return m+n+o ;
	}
	
	//2������add(10,5)
	//3������ֵ������  ��  sum������һ��
	public static int add(int a , int b) {
		//4��ͨ��return �ؼ��� �ѽ�����ص���λ��
		return a*b ; 
	}
	
	
	
	
}
