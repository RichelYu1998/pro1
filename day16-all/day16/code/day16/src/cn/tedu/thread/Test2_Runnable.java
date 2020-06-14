package cn.tedu.thread;
//这个类用来测试 多线程编程
public class Test2_Runnable {
    public static void main(String[] args) {
        //4、创建线程对象
        MyRunnable target = new MyRunnable();
        //绑定Runnable接口和Thread类的关系
        Thread t1 = new Thread(target) ;//新建状态
        Thread t2 = new Thread(target) ;
        //设置线程名称--使用默认分配的线程名称Thread-0  Thread-1 ...
        t1.setName("美队");
        t2.setName("蜘蛛侠");

        //5、启动线程
        t1.start();//可运行状态，等待CPU调度
        t2.start();

        /*多线程程序的随机性
        Thread-0===0
        Thread-1===0
        Thread-0===1
        Thread-0===2
        Thread-0===3
        Thread-1===1
        Thread-0===4
        Thread-1===2
        Thread-1===3
        */
    }
}
//1、创建多线程类 implements Runnable
class MyRunnable implements Runnable{
    //2、把所有的业务，都放入重写的run()
    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            //3、输出线程名称--Thread.currentThread().getName()
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }
    }
}
