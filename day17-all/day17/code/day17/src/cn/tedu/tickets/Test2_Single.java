package cn.tedu.tickets;
//这个类用来测试 单例设计模式  --饿汉式
public class Test2_Single {
    public static void main(String[] args) {
        MySingle my = MySingle.getMy();
        MySingle my2 = MySingle.getMy();
        //==用来比较引用类型变量保存着的地址值
        System.out.println(my  ==  my2);
        //TODO  现在的程序中，有共享资源吗？  --有  my
        // my有数据安全隐患吗？？ --没有，因为在多线程编程中，是会被多条语句操作时，共享数据才有隐患
    }
}
class MySingle{
    //1、私有化构造方法---目的是为了不让外界随意new
    private MySingle(){ }
    //2、在类的内部，创建好对象 ----修饰成static是因为，getMy() 是静态的，要关联的资源也必须是静态的
    static private  MySingle my = new MySingle();
    //3、提供公共的全局访问点--修饰成static是因为，外界无法通过对象访问，现在可以通过类名访问
    static public MySingle getMy(){
        //把自己创建好的对象 返回给 外界调用位置
        return my ;
    }
}


