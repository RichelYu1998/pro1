package cn.tedu.innerclass;
//这个类用来测试 匿名内部类
public class Test2_InnerClass {
    public static void main(String[] args) {
        //new Inter()，相当于创建了一个接口的实现类的对象，只不过是匿名对象。只能执行一个任务！！
        new Inter(){//匿名内部类
            @Override
            public void save() {
                System.out.println("save()...");
            }
            @Override
            public void get() {
                System.out.println("get()...");
            }
        }.save();//调用指定方法

         Inter in = new Inter(){//匿名内部类  ，给匿名对象起个名字，就可以执行多个任务了！！
            @Override
            public void save() {
                System.out.println("save()...");
            }
            @Override
            public void get() {
                System.out.println("get()...");
            }
        };
        in.save();
        in.get();

        new Demo(){//就相当于创建了抽象类的对象
            @Override
            public void update() {
                System.out.println("update()...");
            }
        }.update();//调用指定方法
    }
}
abstract class Demo{
   public abstract void update() ;
   public void show(){  System.out.println("show()..."); }
}
interface Inter{
    void save() ;
    void get() ;
}


