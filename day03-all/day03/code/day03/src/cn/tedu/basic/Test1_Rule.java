package cn.tedu.basic;

//�������������  �������
public class Test1_Rule {
	public static void main(String[] args) {
		System.out.println( 3/2 );  // 1��int/int��������ֵ���ͻ���int
		System.out.println( 3D/2 ); //1.5 , double/int��������ֵ����doubleһ��
		
		byte a = 10 ;
		byte b = 20 ;
		//�Ҳ࣬��byte+byte���Զ����int���ͣ�����˴����ͣ�������С���ͣ���ֵ--���ɣ�����Ҫǿת
		byte c = (byte) (a+b) ;
		
		//3����/s   ---  year
		//�������������������Ϊ��������ʱ�Ѿ�������int��ȡֵ��Χ�������ֵ���ص���Сֵ��ͷ��ʼ����
		//�������--������Ӻ�׺L����int����ת��long���͡�
		System.out.println( 30000000L*60*60*24*365   ) ; //1783906304
		
		
	}
}
