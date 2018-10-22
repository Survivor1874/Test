package com.lin.test.base;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-08 16:45
 **/
public class StringTest {


    @Test
    public void testSplit2() {
        String testStr = ",,,giid,ddf,,,f,,";
        System.out.println(JSON.toJSONString(Arrays.asList(testStr.split(","))));
    }
}
