package cn.tedu.number;

//�������������  ��װ����
public class Test1_Integer {
	public static void main(String[] args) {
		//1������Integer����---Ŀ�ľ��ǰѻ�������  ��װ��  ��װ����
		Integer in = new Integer(5) ;
		Integer in2 = Integer.valueOf(5) ; //��Ч���ײ���ʾ��������������-128~127��Χ�ڣ�ֱ�ӷ��绺��������(��ͬ���ݲ��ٴ�)��
		Integer in3 = Integer.valueOf(5) ; 
		//���ԣ���̬����valueOf����ͬ���ݲ��ٿ��ٿռ�������--�ǵģ���ʡ�ڴ��ʱ�䣬��Ч��
		System.out.println( in2 == in3 );//true
		//2�����÷���
		int value = in.intValue() ;  // �Ѱ�װ���͵�ֵ  ��� ��������
		System.out.println(value);
		int intValue = Integer.parseInt("123");//��  �ַ������͵�����ת�� ��������
		System.out.println(intValue);
		//1������Double���� -- Ŀ�ľ��ǰ�һ�� ��������  ת��  ��װ����
		Double d = new Double(5.5);
		Double d2 = Double.valueOf(5.5);//��Ч������Ч���ײ���ʾ��newһ��
		//2�����÷���
		double value1 = d2.doubleValue(); //��  ��װ���� ��س� ��������
		System.out.println(value1);
		double doubleVal = Double.parseDouble("5.5"); //�� �ַ������͵�С�� ���  ��������
		System.out.println(doubleVal);
	}
}
