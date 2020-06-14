package cn.tedu.reflection;
//这个类用来测试  内部类
public class Test4_InnerClass {
    public static void main(String[] args) {
        //1、创建内部类对象    ---    外部类名.内部类名   变量 =  外部类对象.内部类对象
        Outer.Inner oi = new Outer().new Inner();
        //2、调用内部类的资源
        oi.showIn();
        System.out.println( oi.age );
    }
}
class Outer{//外部类
    String name = "皮皮霞" ;
    public void showOut(){
        System.out.println("showOut()...");
    }
    class Inner{//内部类
        int age = 20 ;
        public void showIn(){
            System.out.println("showIn()...");
        }
    }
}



