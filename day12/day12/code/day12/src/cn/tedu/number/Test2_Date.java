package cn.tedu.number;
import java.util.Date;
//������������� Date
public class Test2_Date {
	public static void main(String[] args) {
		//1����������
		Date date = new Date(); 
		//2�����÷���
		System.out.println( date.getYear()  );//��ȡ��1900�����ڶ�������
		System.out.println( date.getDate()  );//��ȡ������һ�����еĵڼ���
		System.out.println( date.getDay()  );//��ȡ������һ���еĵڼ���
		System.out.println( date.getHours()  );//��ȡ�����Ǽ�����
		System.out.println( date.getMinutes()  );//��ȡ�����Ƕ��ٷ���
		System.out.println( date.getMonth()  );//��ȡ�·ݣ�4   ---  �ײ�Դ����ʾ�����ȡ����ǰ�·�-1��
		System.out.println( date.getSeconds()  );//��ȡ������
		System.out.println( date.getTime()  );//��ȡ1970 �� 1 �� 1 �� 0�㵽���ڵĺ���ֵ
		System.out.println( date.toLocaleString() );//2020-5-16 11:46:32
		
	}
}







