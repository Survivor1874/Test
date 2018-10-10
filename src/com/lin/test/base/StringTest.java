package com.lin.test.base;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-08 16:45
 **/
public class StringTest {

    @Test
    public void testSplit() {
        String aa = "jdjhdjfjfnnfjgnfjsjjsncnsnkdkdjnxbcncnnxjsb,bdhbdbxbnxnxnxjcbbc,hxjhxbcn,";
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(aa.split(",")));
        System.out.println(JSON.toJSONString(list));
    }
}
