package cn.tedu.array;

//������������� ����Ĵ���
public class Test6_Array {
	public static void main(String[] args) {
		//1���������� ������hello
		//--��̬��ʼ�� ��һ��ʼ�մ�����ʱ����Ķ���Ĭ��ֵ��char����Ĭ��ֵ��\u0000��
		char[] a = new char[] { 'h' , 'e' , 'l' ,'l' ,'o'  } ;
		char[] b = {  'h' , 'e' , 'l' ,'l' ,'o'  } ; 
		
		//--��̬��ʼ������Ҫ�ڴ��������ͬʱ��ָ�����ȣ���
		char[] c = new char[5];
		c[0] = 'h' ; //���±�Ϊ0�����ݣ���Ĭ��ֵ\u0000��Ϊ'h'
		c[1] = 'e' ;//���±�Ϊ1�����ݣ���Ĭ��ֵ\u0000��Ϊ'e'
		c[2] = 'l' ;//���±�Ϊ2�����ݣ���Ĭ��ֵ\u0000��Ϊ'l'
		c[3] = 'l' ;//���±�Ϊ3�����ݣ���Ĭ��ֵ\u0000��Ϊ'l'
		c[4] = 'o' ;//���±�Ϊ4�����ݣ���Ĭ��ֵ\u0000��Ϊ'o'
		
		//����ĳ��������5���±����ֵ��4�Ļ�����û���±�Ϊ5��Ԫ��---û�У�����
		//java.lang.ArrayIndexOutOfBoundsException��ԭ����Ƿ����˲����ڵ��±�5
		//c[5] = 'x';
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
	}
}
