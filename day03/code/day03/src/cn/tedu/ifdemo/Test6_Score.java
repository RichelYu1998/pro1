package cn.tedu.ifdemo;

import java.util.Scanner;

//�������������  ѧԱ�÷�
public class Test6_Score {
	public static void main(String[] args) {
		//1�������û�����ķ���
		int score = new Scanner(System.in).nextInt() ;
		
		//3��Ϊ����ǿ����Ľ�׳�ԣ����Ǳ��������û��������ֵ
		if(   score <0  ||  score>100    ) {
			System.out.println("��������100���ڵ���������");
			
			return ; //�ó����������
		}
		
		//2���ж�
		if(  score >= 90 ) {//90������ ����  
			 System.out.println("����");
		}else if(  score>=80 &&  score<=89  ) {//80~89 ����  
			System.out.println("����");
		}else if(  score>=70 &&  score<=79  ) { //		70~79 �е�  
			System.out.println("�е�");
		}else if(  score>=60 &&  score<=69  ) { //		60~69 ����   
			System.out.println("���� ");
		}else if(  score<60  ) { //		60������ ������
			System.out.println("������ ");
		}
		
	}
}
