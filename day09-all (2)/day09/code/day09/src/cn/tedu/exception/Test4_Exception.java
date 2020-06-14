package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//�������������  �쳣
public class Test4_Exception {
	public static void main(String[] args) {
		// method() ; //��¶�쳣��������̣������Լ����ԾͿ����ˣ�ǧ��Ҫ���û���������
//		method2() ; // �쳣�������� 
		try {
			method3() ; // �쳣�����׳�
		} catch (Exception e) {//��̬�������൱����������д��ͨ�ô���
//			e.printStackTrace();
			System.out.println("�������󣡣�");
		}
	}
	//2���׳����ڷ�����������ӣ�  throws  �쳣����1,�쳣����2,�쳣����3
//	public static void method3() throws ArithmeticException,InputMismatchException{
	public static void method3() throws Exception{//��̬�������൱����������д��ͨ�ô���
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println(a / b);
	}
	
	//1�������쳣��	try{  ......    }catch(�쳣���� ������){   	����Ľ������    }
	public static void method2() {
		try {
			int a = new Scanner(System.in).nextInt();
			int b = new Scanner(System.in).nextInt();
			System.out.println(a / b);
		}catch(ArithmeticException a) {//�쳣����1
			System.out.println("�ڶ������벻��Ϊ0��");//����Ľ������1
		}catch(InputMismatchException b){//�쳣����2	
			System.out.println("����������������");//����Ľ������2   
		}catch(Exception a) {
			//2������Exception���Ƕ�̬�������ľ��������������˭������������൱����������д��ͨ�ô���
			System.out.println("��������ȷ���ݣ�");   
		}
	}
	//0����¶�쳣
	public static void method() {
		// 1�������û��������������
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();

		// 2������������
		System.out.println(a / b);
	}
}
