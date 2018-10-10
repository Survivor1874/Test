package com.lin.test.base;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-10 15:54
 **/
public class MapTest {

    @Test
    private void test() {
        Map<String, Integer> count = new HashMap<>(10);

        String name = "aaa";

        if(count.containsKey(name)) {
            count.put(name, count.get(name) + 1);
        }else {
            count.put(name, 0);
        }

        count.merge(name, 1, (oldValue, newValue) -> oldValue + newValue);
    }
}
