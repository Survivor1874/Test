package com.lin.test.base;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-08 14:03
 **/
public class ListTest {

    @Test
    public void testArrayList() {
        List<Integer> intList = new ArrayList<>(2);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        System.out.println(JSON.toJSONString(intList));
    }

}
