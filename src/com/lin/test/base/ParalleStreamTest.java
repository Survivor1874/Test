package com.lin.test.base;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-17 10:14
 **/
public class ParalleStreamTest {

    private List<Integer> getList(Integer count) {
        List<Integer> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Random r = new Random();
            list.add(r.nextInt());
        }
        return list;
    }

    @Test
    public void test() {
        List<Integer> list = getList(100);
        long t1 = System.currentTimeMillis();
        List<Integer> collect1 = list.stream().sorted().collect(Collectors.toList());
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        List<Integer> collect2 = list.parallelStream().sorted().collect(Collectors.toList());
        long t3 = System.currentTimeMillis();
        System.out.println(t3 - t2);
    }
}
