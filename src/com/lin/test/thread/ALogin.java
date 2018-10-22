package com.lin.test.thread;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-17 17:08
 **/
public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
