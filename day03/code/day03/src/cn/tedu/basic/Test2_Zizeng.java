package cn.tedu.basic;

//�������������  ����++   �Լ�--
//�ܽ�
//1���ھ���������ǰ���ȱ仯��ʹ��    �����ں���ʹ�ú�仯 
//2��˳�� ++  --  �����ȼ�Ҫ��+ - ��
public class Test2_Zizeng {
	public static void main(String[] args) {
		int a = 1 ;
		//�����ں���ʹ�ú�仯
		System.out.println(a++);//1
		int b = 1 ;
		//������ǰ���ȱ仯��ʹ��
		System.out.println(++b);//2
//		System.out.println(++a+b+a++);//3+2+3=8
		System.out.println(a+++a); // �൱��ִ����a++�ټ�a��=2+3=5 
		
		int c = 1;
		//�����ں���ʹ�ú�仯
		System.out.println(c--);//1
		int d = 1;
		//������ǰ���ȱ仯��ʹ��
		System.out.println(--d);//0
		System.out.println(--c-c-d--);//-1-(-1)-0  =0
	}
}
