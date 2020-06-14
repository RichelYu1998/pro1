package cn.tedu.thread;

//这个类用来测试 多线程售票
//TODO  为什么数据会出错，分析程序？？？
//TODO  怎么解决多线程编程中的数据安全隐患？？？
//TODO  多操作IDEA
public class Test3_Tickts {
    public static void main(String[] args) {
        //3、创建线程对象
        MyTickets t1 = new MyTickets();
        MyTickets t2 = new MyTickets();
        MyTickets t3 = new MyTickets();
        MyTickets t4 = new MyTickets();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        //4、问题1：需要是卖100张票，目前卖了400张票。为什么？因为tickets是实例变量
        //每次new都会给对象初始化，4个对象，就初始化了4次有了400张票。--怎么解决？
        //如果能把tickets变成多个对象间共享的就可以了？--
    }
}
//1、模拟多线程开发
class MyTickets extends Thread {
    //定义变量，记录100张票
//  int tickets = 100; //4.1、实例变量，会new多次就拥有多张票
    static  int tickets = 100;//4.2、变量共享资源
    //2、开始卖票 ，写进run()
    @Override
    public void run() {
        while (true) {//一直卖票
            if (tickets > 0) {
                try {
                    //5、检查多线程数据有没有安全隐患，最终的大招就是让程序休眠一会10ms
                    //问题2多卖：同一张票卖给了多个人
                    //问题3超卖：卖出了0号票
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "：" + tickets--);
            } else {
                break;//票数<=0就结束
            }
        }
    }
}


