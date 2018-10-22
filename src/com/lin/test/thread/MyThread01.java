package com.lin.test.thread;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-16 15:49
 **/
public class MyThread01 extends Thread {

    private int count = 5;

    public MyThread01(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(">>>>>>>>>>>>>>>>>");
        while (count > 0) {
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + " 计算 count = " + count);
        }


    }
}
