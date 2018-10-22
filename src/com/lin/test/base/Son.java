package com.lin.test.base;

import org.junit.Test;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-16 16:16
 **/
public class Son extends SuperTest {

    @Override
    public  void print() {
        System.out.println("222222222");
    }


    @Test
    public void test() {
        Son son = new Son();
        son.print();
        super.print();
    }
}
