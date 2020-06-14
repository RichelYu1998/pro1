package cn.tedu.basic;

//这个类用来测试  运算规则
public class Test1_Rule {
	public static void main(String[] args) {
		System.out.println( 3/2 );  // 1，int/int结果和最大值类型还是int
		System.out.println( 3D/2 ); //1.5 , double/int结果和最大值类型double一致
		
		byte a = 10 ;
		byte b = 20 ;
		//右侧，是byte+byte会自动变成int类型，变成了大类型，给左侧的小类型，赋值--不可！！需要强转
		byte c = (byte) (a+b) ;
		
		//3亿米/s   ---  year
		//整数运算溢出现象：是因为整数运算时已经超出了int的取值范围，到最大值后会回到最小值重头开始运算
		//解决方案--就是添加后缀L，把int类型转成long类型。
		System.out.println( 30000000L*60*60*24*365   ) ; //1783906304
		
		
	}
}
