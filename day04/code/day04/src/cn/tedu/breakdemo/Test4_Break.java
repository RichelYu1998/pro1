package cn.tedu.breakdemo;

import java.util.Scanner;

//�������������   ����ѭ��
//������88
public class Test4_Break {
	public static void main(String[] args) {
		//ѭ���ṹ��ѭ��100��
		for(int i = 0 ; i < 100 ; i++) {
			//1������100�Σ��û����������
			int input = new Scanner(System.in).nextInt();
			
			//2���ж��ǲ���88
			if( input == 88 ) {//��88
				System.out.println("����");
				//a��break��continue��ֻ������ѭ���ṹ�У�����ѭ��
				//b��break��continue֮��Ҫ�ٳ��ִ����ˣ��ǲ��ɵ���Ĵ���
				break ; //ѭ��������ѭ��ֻҪ����break�ͻ����̽���
			}else {//����88
				continue ; //��������
			}
		}
		
	}
}
