package cn.tedu.array;

//这个类用来测试 数组的练习
public class Test7_Array2 {
	public static void main(String[] args) {
		method() ;  //输出每个月的天数
		method2();  //TODO  遍历数组，存入1到10
		//method3();  //TODO  创建数组，并且存入随机数，开发步骤同method2()
	}
	public static void method2() {
		//1、创建数组，动态初始化
		
		//2、遍历数组
		
		//3、根据下标获取每个数据，修改成1-10
		
		//4、打印数组的数据(还是需要遍历，输出每个数据)
		
		
	}
	public static void method() {
		//1、创建数组，存放12个数字
		int[] a = { 31,28,31,30,31,30,31,31,30,31,30,31  };
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		
		//2、遍历数组
		//int i = 0  是指从下标0开始  ，i表示下标
		// i <= a.length-1 是指下标最大值是数组的长度-1
		//i++   是指下标依次递增，向后遍历数据
		for( int i = 0 ; i <= a.length-1 ; i++ ){  
			//3、a[i]是指根据下标i获取a数组中的元素  
//			System.out.println( a[i] );
			//数组一共12个数字，i的变化就是0-11，那么i+1就能获取1-12月了
			System.out.println(  i+1  +"月有"+a[i]+"天" );
		}
		
	}
}
