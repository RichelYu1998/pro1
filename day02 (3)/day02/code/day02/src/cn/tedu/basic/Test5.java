package cn.tedu.basic;

public class Test5 {
	public static void main(String[] args) {
		//�Ҳ���Ȼ����������ֵ����int���ͣ����ǣ��Ѿ�������int�ķ�Χ��
		//�����ã�ֻ�ܼӺ�׺L����int�����long
		long a = 200000000000L ; 
		
		//�Ҳ���Ȼ����ֵ��double���ͣ����ǣ���Ҫ���float����--ֻ�ܼӺ�׺F����double���float
		float b = 9.9F ;
		
		//�Ҳ��3����ֵ��int���ͣ�����С��3.0 -- �Ӻ�׺D / d����int���double
		double c = 3d ;
		
		//����ת����С����long  -> ������double 
		//Сת����ʽת��
		long m = 10 ;
		double n = m  ; //�����Ҳ��С����m  �� ���� ������n ��ֵ --- ��ֱ�Ӹ�ֵ����
		
		//��תС����ʽת�� / ǿ��ת��  , ������float  -> С���� int
		float x = 5 ;
		int y = (int) x ; //�����Ҳ�� ������ x  �� ���� С���� y ��ֵ --- ����ֱ�Ӹ�ֵ��������Ѵ�����ǿ��ת��С����
		
		
		System.out.println(1-0.9);
		System.out.println(3.14/0);//infinity
		System.out.println(0/0.0);//NaN
	}
}
