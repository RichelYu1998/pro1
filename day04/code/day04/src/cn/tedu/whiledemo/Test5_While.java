package cn.tedu.whiledemo;

import java.util.Random;
import java.util.Scanner;

//�������������  ѭ���ṹ
public class Test5_While {
	public static void main(String[] args) {
		// ������
		// 1���ó�����������
		// nextInt(m)--��ָ����m���ڵ����������0��ʼ
		int random = new Random().nextInt(100);
		System.out.println(random);

		//��ѭ��ֻ����while��-- for����--���ԣ�ֻ��Ҫ��ѭ��������Զ������
//		for( int i = 1 ; i >= 1 ; i++  ) {
		do { // ѭ������һֱ����--true���������ѭ�����������ú���ĳ��ڣ�������
	// while( random>50 ) {//ѭ�����������Լ�����
			// 2��һֱ�����û����������
			int input = new Scanner(System.in).nextInt();
			// 3����ʼ�Ƚ�
			if (input > random) {
				System.out.println("����");
			} else if (input < random) {
				System.out.println("С��");
			} else if (input == random) {
				System.out.println("����");
				break; // ����ѭ�����ó��ڣ�����
			}
		}while (true);

	}
}
