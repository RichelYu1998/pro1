package cn.tedu.basic;
import java.util.Scanner;
//�������������  Բ�����
//�ܽ�
//1����+ƴ���ַ���
//2����ӡʱҲ����ֱ�Ӵ�ӡһ����ʽ
//3����̬���ռ��������ֵ
public class Test3_Area {
	public static void main(String[] args) {
		
//		double r = 5.5 ; //�����������¼�뾶
		double r = new Scanner(System.in).nextDouble() ; //��̬���ռ��������ֵ
		double result = 3.14*r*r  ;
		
		System.out.println("Բ������ǣ�"+result);
		
		//��Բ���ܳ� 2*3.14*r
		System.out.println(  2*3.14*r );
		
	} 
}
