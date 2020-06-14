package cn.tedu.basic;

//这个类用来测试  自增++   自减--
//总结
//1、口诀：符号在前，先变化再使用    符号在后，先使用后变化 
//2、顺序： ++  --  的优先级要比+ - 高
public class Test2_Zizeng {
	public static void main(String[] args) {
		int a = 1 ;
		//符号在后，先使用后变化
		System.out.println(a++);//1
		int b = 1 ;
		//符号在前，先变化再使用
		System.out.println(++b);//2
//		System.out.println(++a+b+a++);//3+2+3=8
		System.out.println(a+++a); // 相当于执行了a++再加a，=2+3=5 
		
		int c = 1;
		//符号在后，先使用后变化
		System.out.println(c--);//1
		int d = 1;
		//符号在前，先变化再使用
		System.out.println(--d);//0
		System.out.println(--c-c-d--);//-1-(-1)-0  =0
	}
}
