package cn.tedu.bubble;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//������������� �̳߳�
public class Test4_ThreadPool {
    public static void main(String[] args) {
        //1�������̳߳ض��� -- ������ �̳߳صĴ�С(�߳���)
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //2�������̳߳�ִ���߳�����
        //execute();//������ҪRunnable�ӿ�����  --  ����ֱ�Ӵ���  ��������+�����ڲ���
        for (int i = 0; i < 3; i++) {  //4��ѭ��3�Σ��ͻ�ִ��3�Σ���Ϊexecuteִ����3�Ρ�
            pool.execute( new Runnable() {
                              @Override
                              public void run() {
                                  for (int i = 0; i < 100 ; i++) {
                                      System.out.println(Thread.currentThread().getName()+"==="+i);
                                      //3���߳�����
                                      //pool-1-thread-3===80   pool-1-thread-2===41  pool-1-thread-1===8
                                  }
                              }
                          }
            );
        }

    }
}
