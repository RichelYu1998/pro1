package cn.tedu.basic;

public class Test5 {
	public static void main(String[] args) {
		//右侧虽然看起来字面值就是int类型，但是，已经超出了int的范围。
		//还想用，只能加后缀L，从int扩大成long
		long a = 200000000000L ; 
		
		//右侧虽然字面值是double类型，但是，想要变成float类型--只能加后缀F，从double变成float
		float b = 9.9F ;
		
		//右侧的3字面值是int类型，想变成小数3.0 -- 加后缀D / d，从int变成double
		double c = 3d ;
		
		//类型转换：小类型long  -> 大类型double 
		//小转大：隐式转换
		long m = 10 ;
		double n = m  ; //拿着右侧的小类型m  给 左侧的 大类型n 赋值 --- 能直接赋值！！
		
		//大转小：显式转换 / 强制转换  , 大类型float  -> 小类型 int
		float x = 5 ;
		int y = (int) x ; //拿着右侧的 大类型 x  给 左侧的 小类型 y 赋值 --- 不能直接赋值！！必须把大类型强制转成小类型
		
		
		System.out.println(1-0.9);
		System.out.println(3.14/0);//infinity
		System.out.println(0/0.0);//NaN
	}
}
