package com.lin.test.base;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-19 15:08
 **/
public class StaticTest1 {

    public static void main(String[] args) {
        staticFunction();
    }

    static StaticTest1 st = new StaticTest1();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    StaticTest1() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticFunction() {
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;


}
