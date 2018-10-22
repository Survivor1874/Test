package com.lin.test.thread;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-16 15:49
 **/
public class MyThread02 extends Thread {

    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        System.out.println(">>>>>>>>>>>>>>>>>");
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + " 计算 count = " + count);

    }
}
