package cn.tedu.arrays;
import java.util.Arrays;
//������������ ���鹤����Arrays
//sort()Ϊʲôû�з���ֵ
//copyOf()Ϊʲô�з���ֵ����Ϊ����һ�����������Ȳ��ܱ䣡��
public class Test2_Arrays {
	public static void main(String[] args) {
		// method(); //toString()����������ݱ���ַ���չʾ
		// method2(); //sort()���������������򣬴�С���
		method3(); // copyOf()����������
	}
	public static void method3() {
		//����ԭ����
		int a[] = {1,2,3,4,5,6};
		//copyOf(m,n)--m��ԭ��������n�������鳤��
		//���У��ڶ�������n�����������ĳ���>ԭ���鳤�ȣ��൱����������λ��  ---  ����
		//���������ĳ���<ԭ����ĳ��ȣ��൱���ڽ�ȡ����  --- ����
		int[] b = Arrays.copyOf(a, 10) ;
		int[] c  = Arrays.copyOf(a, 3);
		
		//[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
		System.out.println(   Arrays.toString(b)  );//�鿴b������
		//[1, 2, 3]
		System.out.println(   Arrays.toString(c)  );
	}
	public static void method2() {
		int[] a = { 9, 3, 7, 1, 8 };
		// �Զ��������㷨-- ð������/��������/�ϲ�����
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));// [1, 3, 7, 8, 9]
	}
	public static void method() {
		int[] a = { 1, 2, 3, 4, 5 };
		// ��ǰ�뿴����������� ֻ�ܱ���
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// ���� - ʹ�����鹤����Arrays.toString(a) -- ��a�����е���������ת���ַ���չʾ
		System.out.println(Arrays.toString(a)); // [1, 2, 3, 4, 5]
	}
}
