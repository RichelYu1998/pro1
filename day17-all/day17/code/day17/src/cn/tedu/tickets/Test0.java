package cn.tedu.tickets;

public class Test0 {
    public static void main(String[] args) {
        //3、创建线程对象
        MyTickets2 t1 = new MyTickets2();
        MyTickets2 t2 = new MyTickets2();
        MyTickets2 t3 = new MyTickets2();
        MyTickets2 t4 = new MyTickets2();
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
class MyTickets2 extends Thread {
    //定义变量，记录100张票
    //  int tickets = 100; //4.1、实例变量，会new多次就拥有多张票
    static  int tickets = 100;//4.2、变量共享资源
    @Override
    //2、开始卖票 ，写进run()
    public void run() {
        while (true) {//一直卖票
            //tickets = 1，t1 t2 t3 t4开始准备卖票
            if (tickets > 0) {
                try {
                    //5、检查多线程数据有没有安全隐患，最终的大招就是让程序休眠一会10ms
                    //问题2多卖：同一张票卖给了多个人
                    //问题3超卖：卖出了0号票
                    //t1 t2 t3 t4开始睡觉
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //超卖：
                //假设t1先醒，开始卖票，当前tickets=1，tickets--，输出1，然后自减变成0
                //假设t2又醒，开始卖票，当前tickets=0，tickets--，输出0，然后自减变成-1
                //假设t3又醒，开始卖票，当前tickets=-1，tickets--，输出-1，然后自减变成-2
                //假设t4又醒，开始卖票，当前tickets=-2，tickets--，输出-2，然后自减变成-3
                //重卖：
                //假设t1先醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                //假设t2又醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                //假设t3又醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                //假设t4又醒，开始卖票，当前tickets=1，tickets--，输出1，还没来得及改呢！！
                System.out.println(getName() + "：" + tickets--);
            } else {
                break;//票数<=0就结束
            }
        }
    }
}
