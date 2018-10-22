package com.lin.test.thread;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-17 17:14
 **/
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
