package cn.tedu.ifdemo;

import java.util.Scanner;

//������������� ��Ʒ����
public class Test5_Discount {
	public static void main(String[] args) {
		//1�������û������ԭ��
		double price = new Scanner(System.in).nextDouble() ;
		
		//2�������ۺ�ۣ�����ӡ
		double dis = price ; //�����������¼�ۺ��
		if( price >= 5000 ) {//��5000��5��
			dis = price*0.5  ; 
		}else if( price >= 2000 ) {//��2000��8��
			dis = price*0.8  ; 
		}else if( price >= 1000 ) {//��1000��9��
			dis = price*0.9  ; 
		}
		
		System.out.println("ԭ���ǣ�" + price + "���ۺ���ǣ�"+dis);
		
	}
}
