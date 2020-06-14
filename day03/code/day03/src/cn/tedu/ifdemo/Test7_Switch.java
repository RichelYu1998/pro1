package cn.tedu.ifdemo;

//这个类用来测试  数字匹配
//简单了解即可！！
public class Test7_Switch {
	public static void main(String[] args) {
		int a = 2 ;
		//1、参数a相当于把数字2传递成功
		switch ( a  )  {//0、整型表达式对于数据类型有要求：byte short int char jdk1.7后String
			//2、开始匹配各种情况
			case '0' : System.out.println(0); break ;
			case 1 :System.out.println(1); break ;
			//3、成功匹配了数字2的情况，并向后穿透所有case，包括default
			case 2: System.out.println(2);  break ;  //4、break用来结束程序
			case 3: System.out.println(3); break ;
			case 4: System.out.println(4); break ;
			
			default : System.out.println(99);
		}
		
	}
}
