package cn.tedu.basic;

//�������������  ����ֵ����
public class Test4_Exchange {
	public static void main(String[] args) {
		//1���������a��b	 TODO ��̬���ռ��������ֵ
		int a = 1 ;
		int b = 2 ;
		//ǰ����Ҫƴ��" + �� + "
		System.out.println("����ǰ��a="+a+"��b="+b);
		//2����ʼ����
		int c = a ; // ��a��ֵ����c����
		     a =  b ; // ��b��ֵ����a����
		     b =  c ; // ��c��ֵ����b����
		System.out.println("������a="+a+"��b="+b);
		
	}
}
