package cn.tedu.overload;
//�������������  �������أ�ͬ�������������б�ͬ
public class Test4_Overload {
	public static void main(String[] args) {
		add(10,5);//�Զ�ƥ����Ҫ����int������add()
		add(10,5,"jack");//�Զ�ƥ����Ҫ����int������һ��String������add()
		add("rose",5,10);//�Զ�ƥ����Ҫһ��String����������int������add()
	}
	
	//��������override����ָ��һ�����е����󡣷�������ͬ���ǲ����б�ͬ��������Ϊ����߳���������
	public static void add(String m,int n,int x) {
		System.out.println(m+n+x);//rose510
	}
	public static void add(int a,int b,String c) {
		System.out.println(a+b+c);//15jack
	}
	public static void add(int m,int n) {
		System.out.println(m+n);//15
	}
	
}
