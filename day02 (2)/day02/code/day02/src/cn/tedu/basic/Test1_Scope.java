package cn.tedu.basic;
//����� ���� ����  �������͵�ȡֵ��Χ
//�ܽ᣺
//1������������������� ������ = ����ֵ
//2��ÿ���������� ���� ��Ӧ�� ������(��װ��)�����������������������ṩ�ḻ�Ĺ���
//3��char���ͱȽ����ȿ��Դ浥�����ַ���Ҳ���Դ�����(ʹ��ʱ���ascii���)��
public class Test1_Scope {
	public static void main(String[] args) {
		// ��Ҫ�أ��������� ������ = ����ֵ
		// ���ͣ�byte short int long
		byte max = Byte.MAX_VALUE; // �����������¼byte���͵����ֵ
		byte min = Byte.MIN_VALUE; // �����������¼byte���͵���Сֵ
		// System.out.println( "max" );//������ӡ���˱�����ֵ��������ӡ���ǹ̶�������max
		System.out.println(max);// 127����ӡ������ֵ
		System.out.println(min); // -128����ӡ������ֵ
		short max2 = Short.MAX_VALUE;
		short min2 = Short.MIN_VALUE;
		System.out.println(max2);// 32767
		System.out.println(min2);// -32768
		// int - Integer
		int max3 = Integer.MAX_VALUE;
		int min3 = Integer.MIN_VALUE;
		System.out.println(max3);// 2147483647
		System.out.println(min3);// -2147483648
		// long - Long
		long max4 = Long.MAX_VALUE;
		long min4 = Long.MIN_VALUE;
		System.out.println(max4);// 9223372036854775807
		System.out.println(min4);// -9223372036854775808
		// �����ͣ� float - Float �����ȣ�С��λҪ�󲻾�ȷ������
		float max5 = Float.MAX_VALUE;
		float min5 = Float.MIN_VALUE;
		System.out.println(max5);// 3.4028235E38
		System.out.println(min5);// 1.4E-45
		// double - Double ˫���ȣ�С��λҪ��ܾ�ȷ
		double max6 = Double.MAX_VALUE;
		double min6 = Double.MIN_VALUE;
		System.out.println(max6);// 1.7976931348623157E308
		System.out.println(min6);// 4.9E-324
		// �������ͣ�true false
		boolean b = true;
		boolean b2 = false;
		// char - Character
		char c = Character.MAX_VALUE;//65535
		char c2 = Character.MIN_VALUE;//0
		System.out.println(c);
		System.out.println(c2);
		char c3 = 'a' ;
		char c4 = '1' ;
		char c5 = '��' ;//char���Դ�һ�����ĺ���
		char c6 = 97  ;//char���Դ�һ������
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		//char���Ϳ��Դ��һ�����֡����ǣ���ʹ��ʱ�����ѯascii��������ֶ�Ӧ���ַ���ɶ��Ȼ��ʹ���ַ�����
		//ascii�����涨�����ֶ�Ӧ���ַ���ɶ��ֻ�涨��0-127��Ӧ���ַ���128-65535Ĭ�϶���Ӧ���ַ���
		System.out.println(c6);//a
		
	}
}
