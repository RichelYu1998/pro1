package cn.tedu.overload;
//这个类用来测试  方法重载：同名方法，参数列表不同
public class Test4_Overload {
	public static void main(String[] args) {
		add(10,5);//自动匹配需要两个int参数的add()
		add(10,5,"jack");//自动匹配需要两个int参数和一个String参数的add()
		add("rose",5,10);//自动匹配需要一个String参数和两个int参数的add()
	}
	
	//方法重载override：是指在一个类中的现象。方法名相同但是参数列表不同的现象。是为了提高程序的灵活性
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
