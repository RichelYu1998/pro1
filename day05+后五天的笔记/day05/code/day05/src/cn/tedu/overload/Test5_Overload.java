package cn.tedu.overload;
//�������������  �������أ�ͬ�������������б�ͬ
public class Test5_Overload {
	public static void main(String[] args) {
		print('��');
		print(9.9);
		print(10);
	}
	//���ݴ�ӡ int double String char boolean
	public static void print(int num) {
		System.out.println(num);
	}
	public static void print(double num) {
		System.out.println(num);
	}
	public static void print(String num) {
		System.out.println(num);
	}
	public static void print(char num) {
		System.out.println(num);
	}
	public static void print(boolean num) {
		System.out.println(num);
	}
}
