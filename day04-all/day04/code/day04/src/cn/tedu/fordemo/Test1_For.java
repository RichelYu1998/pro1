package cn.tedu.fordemo;

//这个类用来测试  for
//for( 开始位置 ; 循环条件 ; 更改条件   ){   循环体  }
public class Test1_For {
	public static void main(String[] args) {
//		打印10到0
		for( int i = 10  ;  i >= 0  ;  i--  ){   
//			System.out.println(i);//打印后换行展示
			System.out.print(i);//在同行展示
		}
		
		System.out.println();//换行
		
//		打印8,88,888,8888,
		for( int i = 8 ; i <= 8888 ; i=i*10+8   ){  
			System.out.print( i+"," ); 
		}
		
		
		
		
	}
}
