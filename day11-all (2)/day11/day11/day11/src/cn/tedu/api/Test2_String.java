package cn.tedu.api;

import java.util.Arrays;

//������������� �ַ������ַ����ײ�ά����һ��char[]
public class Test2_String {
	public static void main(String[] args) {
		//1����������
		char[] cs = new char[] {'a','b','c'};
		String s = new String(cs) ; // �����˺��ι��죬������ڶ��ڴ���
		String s2 = "abc" ;//��д��������� ���ڴ��еĳ������С������ظ�Ч����ͬ����ֻ���һ�Ρ�
		//2�����÷���
		System.out.println(  s.charAt(1)  );  //  ��ȡָ���±��Ӧ���ַ� 
		System.out.println(  s.concat("opq")  );// ��ԭ�����ݵ�ĩβ�� ƴ��ָ���ַ���
		System.out.println(  s.contains("bc")  );// �ж��Ƿ����ָ�����ַ���
		System.out.println(  s.endsWith("c") );// �ж��Ƿ���ָ�����ַ�����β
		System.out.println(  s.equals("abc") );// �ж��Ƿ��ָ�����ַ���  ���
		System.out.println(  s.hashCode() ); // ��ȡ �ַ������ڴ��еĹ�ϣ��ֵ
		System.out.println(  s.isEmpty() );	// �ж��ַ��� �Ƿ�Ϊ��
		System.out.println(  s.length() );   //��ȡ�ַ����ĳ���
		
		s =  "abcdefa" ; //�޸�s��ֵ
		System.out.println(  s.indexOf("a") +"======");// ��ȡ ָ���ַ���  ��һ�γ��ֵ��±�ֵ
		System.out.println(  s.lastIndexOf("a") );// ��ȡ ָ���ַ��� ���һ�γ��ֵ��±�ֵ
		System.out.println(  s.replace('a','1') );//�滻�ַ�
		System.out.println(  s.startsWith("ab") );// �ж��Ƿ���ָ����ǰ׺��ʼ
		System.out.println(  s.substring(1) ); // ��ָ���±괦 ��ʼ��ȡ�ַ���
		System.out.println(  s.substring(1,5) );//��ָ��λ�ÿ�ʼ����ָ��λ�ý��� ��ȡ�ַ��� [1,5)����ͷ����β
		System.out.println(  s.toLowerCase() );//���ַ���ȫתСд
		System.out.println(  s.toUpperCase() );//���ַ���ȫת��д
		
		s = "    a  c  123     " ; 
		System.out.println(  s.trim() );  //ɾ��ǰ��ͺ���Ķ���ո�
		
		String num = String.valueOf(123);//�Ѹ����������͵�����ת��String����
		
		s =  "123.abc.xyz" ;
		//java����һЩ����ķ��� | ��  �� ��  .  �������û����ȷ�Ľ���ʱ������Ҫת��  \\
		String[] strs = s.split("\\.") ;//����ָ�����ַ����и�
		System.out.println( Arrays.toString(strs)  );//[123, abc, xyz]
		
		char[] cs2 = s.toCharArray() ;
		System.out.println( Arrays.toString(cs2)  );//[1, 2, 3, ., a, b, c, ., x, y, z]
	}
}



