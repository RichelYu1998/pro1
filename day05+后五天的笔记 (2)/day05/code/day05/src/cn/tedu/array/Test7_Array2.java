package cn.tedu.array;

//������������� �������ϰ
public class Test7_Array2 {
	public static void main(String[] args) {
		method() ;  //���ÿ���µ�����
		method2();  //TODO  �������飬����1��10
		//method3();  //TODO  �������飬���Ҵ������������������ͬmethod2()
	}
	public static void method2() {
		//1���������飬��̬��ʼ��
		
		//2����������
		
		//3�������±��ȡÿ�����ݣ��޸ĳ�1-10
		
		//4����ӡ���������(������Ҫ���������ÿ������)
		
		
	}
	public static void method() {
		//1���������飬���12������
		int[] a = { 31,28,31,30,31,30,31,31,30,31,30,31  };
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		
		//2����������
		//int i = 0  ��ָ���±�0��ʼ  ��i��ʾ�±�
		// i <= a.length-1 ��ָ�±����ֵ������ĳ���-1
		//i++   ��ָ�±����ε���������������
		for( int i = 0 ; i <= a.length-1 ; i++ ){  
			//3��a[i]��ָ�����±�i��ȡa�����е�Ԫ��  
//			System.out.println( a[i] );
			//����һ��12�����֣�i�ı仯����0-11����ôi+1���ܻ�ȡ1-12����
			System.out.println(  i+1  +"����"+a[i]+"��" );
		}
		
	}
}
