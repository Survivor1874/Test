package com.lin.test.thread;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-16 15:53
 **/
public class Run {

    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();

    }
}
