package cn.tedu.api;

//�������������  StringBuilder
public class Test3_StringBuilder {
	public static void main(String[] args) {
		// method();//��+ƴ�ӣ���
		method2();// �ù���ƴ�ӣ��죡��
	}
	// �ù���ƴ�ӣ��죡��
	public static void method2() {
		String str = "abcdefghijklmnopqrstuvwxyz";

//		StringBuilder sb = new StringBuilder() ;
		StringBuffer sb = new StringBuffer() ;
		// 2�����ַ���ƴ��100�Σ�����ӡ���
		long start = System.currentTimeMillis(); // ��ʱ��ʼms
		for (int i = 0; i < 10000; i++) {
			sb.append(str)  ; // ͨ��������ƴ���ַ���
		}
		long end = System.currentTimeMillis(); // ��ʱ����ms

		System.out.println(end - start);// 1ms
	}
	// ʹ��+ƴ���ַ���
	public static void method() {
		// 1�������ַ���
		String str = "abcdefghijklmnopqrstuvwxyz";

		String res = ""; // �����������¼ƴ�ӽ��
		// 2�����ַ���ƴ��100�Σ�����ӡ���
		long start = System.currentTimeMillis(); // ��ʱ��ʼms
		for (int i = 0; i < 10000; i++) {
			res = res + str; // ͨ��+ƴ���ַ���
		}
		long end = System.currentTimeMillis(); // ��ʱ����ms

		System.out.println(end - start);// 3046ms
	}

}
