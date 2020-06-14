package cn.tedu.bubble;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class R {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        System.out.println(Thread.currentThread().getName() + "£º£º£º" + i);
                    }
                }
            });

            es.execute(()->{
                System.out.println(Thread.currentThread().getName());
            } );
        }
    }
}
