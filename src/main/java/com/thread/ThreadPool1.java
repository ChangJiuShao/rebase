package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
//创建线程池的四种方式

    public static void main(String[] args) {
     //CachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
    //该线程是无限大的，
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            System.out.println(index);
            System.out.println(index);
            
               System.out.println(index);
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                        System.out.println(index);
                          System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                         System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                        System.out.println(index);
                         System.out.println(index);
                        System.out.println(index);
                         System.out.println(index);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }

    }
}
