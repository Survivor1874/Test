package com.lin.test.thread;

import java.util.HashMap;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-17 17:04
 **/
public class LoginServlet {

    private static String usernameRef;

    private static String passwordRef;

    public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if("a".equals(username)) {
                Thread.sleep(500);
            }
            passwordRef = password;
            System.out.println("username = " + usernameRef + " password = " + passwordRef);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
