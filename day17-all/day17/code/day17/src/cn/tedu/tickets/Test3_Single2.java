package cn.tedu.tickets;
//这个类用来测试 单例设计模式  --  懒汉式
//总结：
//1、懒汉式和饿汉式  区别：创建对象的时机不同，饿汉式不管你什么时候需要都第一间把对象加载进内存，是静态的资源比较占用内存。
//2、懒汉式的好处：是可以延迟加载，需要创建时才会帮你创建对象。
//3、面试点： 延迟加载的思想  +  线程安全的解决方案
public class Test3_Single2 {
    public static void main(String[] args) {
        MySingle2 my = MySingle2.getMy();
        MySingle2 my2 = MySingle2.getMy();
        System.out.println(my == my2);//true
        //TODO  现在的程序中，有共享资源吗？--有 my
        //TODO  共享数据有安全隐患吗？？--有多条语句操作了共享数据，如果是多线程编程一定有隐患！！--加锁
    }
}
class MySingle2 {
    //1、私有化构造方法---目的是为了不让外界随意new
    private MySingle2(){}
    //2、在类的内部，创建好对象 ----修饰成static是因为，getMy() 是静态的，要关联的资源也必须是静态的
    static private MySingle2 my ;
    //3、提供公共的全局访问点--修饰成static是因为，外界无法通过对象访问，现在可以通过类名访问
    //--修饰成synchronized  方法，是用来解决线程安全隐患问题，降低了访问效率。
    synchronized static public MySingle2 getMy(){
        if(my==null){//增强代码的健壮性
            my = new MySingle2();//不会一开始就创建对象，而是什么时候需要什么时候创建  ---  延迟访问 / 延迟加载
        }
        return my ; //把自己创建好的对象 返回给 外界调用位置
    }

}
