package cn.tedu.fordemo;
//这个类用来测试 嵌套for的练习
public class Test3_For2 {
	public static void main(String[] args) {
//打印左直角三角形
		//第一次循环时，i=1时，内循环： j = 1; j <= 1;此时j的取值范围就是=1，          打印*，换行。i自增变成2
		//第二次循环时，i=2时，内循环： j = 1; j <= 2;此时j的取值范围就是=1 2，       打印**，换行。i自增变成3
		//第三次循环时，i=3时，内循环： j = 1; j <= 3;此时j的取值范围就是=1 2 3，    打印***，换行。i自增变成4
		//第四次循环时，i=4时，内循环： j = 1; j <= 4;此时j的取值范围就是=1 2 3 4， 打印****，换行。i自增变成5
		//第五次循环时，i=5时，内循环： j = 1; j <= 5;此时j的取值范围就是=1 2 3 4 5，打印*****，换行。i自增变成6 
		for(int i = 1 ; i <=5 ; i++) {//外循环控制行，执行5次，打印5行
			for(int j = 1; j <= i ; j++) {//外循环控制列。问题是：列数不固定，需要跟随行i改变
				System.out.print("*");//同行展示
			}
			System.out.println();//换行
		}
		
//	打印99乘法表
		for(int i = 1 ; i <=9 ; i++) {//外循环控制行，执行9次，打印9行
			for(int j = 1; j <= i ; j++) {//外循环控制列。问题是：列数不固定，需要跟随行i改变
//				System.out.print("3*2=6");//同行展示
//				System.out.print("行*列=积");//同行展示
//				System.out.print("i*j=i*j");//同行展示
				System.out.print(i+"*"+j+"="+i*j+"	");//同行展示
			}
			System.out.println();//换行
		}
		
	}
}
