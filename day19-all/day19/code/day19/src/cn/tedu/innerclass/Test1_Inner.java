package cn.tedu.innerclass;

//这个类用来测试 内部类
public class Test1_Inner {
    public static void main(String[] args) {
        //创建内部类对象，使用内部类资源
//        Outer.Inner oi = new Outer().new Inner() ;  //2、因为内部类被Private，无法直接new
//        oi.showIn();
        //4、触发showOut()
        new Outer().showOut();
        //6、使用静态的内部类Inner2的资源  --  可以直接通过外部类名.内部类名来定位内部类
        Outer.Inner2 oi = new Outer.Inner2() ;
        oi.showIn2();
        //7、访问静态内部类里  静态方法
        Outer.Inner2.showIn2();
    }
}
class Outer{//外部类
    String name ;
    public void showOut(){
        //3、间接访问showIn()
        new Inner().showIn();
        System.out.println("showOut()...");
    }
    //5、内部类被static修饰
    static class Inner2{
        int count = 10 ;
       static public void showIn2(){
            System.out.println("showIn2()...");
        }
    }
    //1、在成员位置的内部类，叫成员内部类。可以被private修饰，也可以被static修饰
    private class Inner{//内部类
        int age ;
        public void showIn(){
            System.out.println("showIn()...");
        }
    }
}





