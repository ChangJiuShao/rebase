package com.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool3 {
    //第三种创建方式  ScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
    public static void main(String[] args) {

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 10; i++) {
            scheduledThreadPool.schedule(new Runnable() {
                public void run() {
                    System.out.println("delay 3 seconds");
                    System.out.println("delay 3 seconds");
                    System.out.println("delay 3 seconds");
                    System.out.println("delay 3 seconds");
                    System.out.println("delay 3 seconds");
                    System.out.println("delay 3 seconds");
                    System.out.println("delay 3 seconds");
                }
            }, 3, TimeUnit.SECONDS);
        }
    }
}
