package cn.tedu.basic;

import java.util.Scanner;

//�������������   ƽ������
	//1���ܱ�4���������Ҳ��ܱ�100����
	//2���ܱ�400����
public class Test4_Runnian {
	public static void main(String[] args) {
		//1�������û��������� --����
		int year = new Scanner(System.in).nextInt() ;
		
		//2���жϣ������ǲ�������
		//if(  �ж�����  ){ ���������Ĵ���   }
		//if(  ������1  ||   ������2  ){ ���������Ĵ���   }
		//if(  С����1 &&  С����2   ||   �ܱ�400����  ){ ���������Ĵ���   }
		//if(  �ܱ�4���� &&  ���ܱ�100����   ||   �ܱ�400����  ){ ���������Ĵ���   }
		String desc  =  "ƽ��" ; //Ĭ��ÿ�궼��ƽ��
		if(  ( year % 4 ==  0  &&  year % 100  != 0 )  ||  year % 400 == 0   ){ 
//			���������Ĵ���   -- �޸�desc��ֵ���������
			desc = "����" ; 
		}
		System.out.println(year+"����"+desc); //TODO �Լ���ȡ��̬���� ƴ���ַ���
	}
}
