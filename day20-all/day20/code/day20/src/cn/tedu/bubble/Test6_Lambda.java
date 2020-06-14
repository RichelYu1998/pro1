package cn.tedu.bubble;

//这个类用来测试 Lambda表达式：优化了匿名内部类的编写
//概念：
//Lambda 表达式（lambda expression）是一个匿名函数，Lambda表达式基于数学中的λ演算得名，直接对应于其中的lambda抽象（lambda abstraction），是一个匿名函数，即没有函数名的函数。
//语法：(参数列表) -> {语句或语句块}
public class Test6_Lambda {
    public static void main(String[] args) {
        //2、利用匿名对象  +  匿名内部类，使用接口的功能
        Demo d = new Demo(){
            @Override
            public void save() {
                System.out.println("save()...");
            }
        } ;
        d.save();
        //3、Lambda表达式优化匿名内部类
//      Demo d2 = (参数列表) -> { 方法体  } ;
        Demo d2 = () -> {  System.out.println("save()...lambda");  } ;//3.1、Lambda表达式没参数
        d2.save();

        Demo2 demo2 = (int x,int y) -> {  System.out.println(x+y); } ;//4、Lambda表达式有参数
        demo2.add(1,2);//4.1、把实参1 和 2 传递给了形参 x 和 y ，并打印求和的结果

        Demo3 demo3 = (int m,int n)->  { return m+n ;  } ; //5、Lambda表达式有参数 有返回值，通过return把值返回
        System.out.println( demo3.add(5,10)  );//5.1、把实参5 和 10 传递给了形参 m 和 n ，求和，并返回结果
    }
}
interface Demo3{
    int add(int a,int b);
}
interface Demo2{
    void add(int a,int b) ;
}
//1、准备接口：Lambda表达式要求接口中，只能有一个抽象方法。
interface Demo{
    void save ();
}





