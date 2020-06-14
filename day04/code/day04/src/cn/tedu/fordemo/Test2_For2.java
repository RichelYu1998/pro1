package cn.tedu.fordemo;

//这个类用来测试 嵌套for
public class Test2_For2 {
	public static void main(String[] args) {
		//总结1、外循环执行1次，内循环执行多次
		//第一次循环，也就是当i=1时，输出了i的值1，并且输出j的所有值1 2 3 4 5 ，把i自增变成2
		//第二次循环，也就是当i=2时，输出了i的值2，并且输出j的所有值1 2 3 4 5 ，把i自增变成3
		//第三次循环，也就是当i=3时，输出了i的值3，并且输出j的所有值1 2 3 4 5 ，把i自增变成4
		for( int i = 1 ; i <= 3 ; i++ ) { //外循环,i= 1 2 3 
			System.out.println(i);
			
			for( int  j = 1 ; j <= 5; j++) {//内循环 ，j = 1 2 3 4 5
				System.out.println(j);
			}
		}
		//总结2、外循环控制行，内循环控制列
		for( int i = 1 ;  i <= 2  ; i++ ) {//外循环，执行2次 i = 1 2
			for( int j = 1 ;  j <= 3  ; j++ ) {//内循环，执行3次 j = 1 2 3
				System.out.print("*");//同行展示
			}
			
			System.out.println();//换行
		}
		
//	TODO 	打印正方形  五行五列的*
		for(int i = 0 ; i < 5 ; i++) {//外循环控制行，执行5次，打印5行
			for(int j = 0 ; j < 5 ; j++) {	//内循环控制列，执行5次，打印5列
				System.out.print("*");//同行展示
			}
			
			System.out.println();//换行
		}
		
	}
}

