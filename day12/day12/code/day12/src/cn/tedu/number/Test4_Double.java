package cn.tedu.number;

import java.math.BigDecimal;
import java.util.Scanner;

//������������� ����������
public class Test4_Double {
	public static void main(String[] args) {
		// method();//��¶����
		method2();// ����������㲻��ȷ������ BigDecimal
	}

	public static void method2() {
		// 1�������û����������С��
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		//2���������� --  ����ʹ�� String����  �Ĺ��췽��
		BigDecimal bd1 = new BigDecimal(a+"");
		BigDecimal bd2 = new BigDecimal(b+"");
		
		// 3��������
		BigDecimal bd3 ; //����bd3���������
		bd3 = bd1.add(bd2) ;//�ӷ�
		System.out.println(bd3);
		bd3 = bd1.subtract(bd2) ;//����
		System.out.println(bd3);
		bd3 = bd1.multiply(bd2) ;//�˷�
		System.out.println(bd3);
//		bd3 = bd1.divide(bd2) ;//����java.lang.ArithmeticException: ������
		//-------------divide(a,b,c)--a��ָҪ����Ķ�����  ---b��ָҪ������λС�� ---c��ָ���뷽ʽ
		bd3 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP) ;//����
		System.out.println(bd3);
	}

	public static void method() {
		// 1�������û����������С��
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();

		// 2��������
		System.out.println(a + b);// ����ȷ
		System.out.println(a - b);// ����ȷ
		System.out.println(a * b);// ����ȷ
		System.out.println(a / b);// ����ȷ

	}
}
