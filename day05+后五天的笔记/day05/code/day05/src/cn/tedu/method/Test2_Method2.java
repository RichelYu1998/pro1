package cn.tedu.method;
//�������������  �����Ĵ���
//���η�  ����ֵ  ������(��������  ������){}
public class Test2_Method2 {
	public static void main(String[] args) {
		//1�����÷���
		add(15) ;
		method(10,5) ;//3����������ʱ���������֮�䶺�Ÿ���
		function( 10,5,"ƤƤϼ" ) ;
	}
	public static void function( int a , int b , String c ) {
		//+  ����������֮���������ӷ�����  
		//+  ���ַ�����ƴ��
		System.out.println(a+b+c);//15ƤƤϼ
	}
	//4������method�����������б��У���Ҫƥ���������  ��  ������  ��
	public static void method(int a , int b) {
		System.out.println(a);
		System.out.println(b);
	}
	//2������add����  ��  ����5 ��Ҫ�ɹ������յ������������� ����� 5�� �������ͱ���һ��
	public static void add(int a) {
		System.out.println(a);
	}
}
