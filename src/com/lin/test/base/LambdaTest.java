package com.lin.test.base;

import com.alibaba.fastjson.JSON;
import com.lin.test.common.entity.User;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * java 8 lambda 试用
 *
 * @author linjun.li@quvideo.com
 * @date 2018-10-10 14:58
 **/
public class LambdaTest {

    @Test
    public void test() {
        List<User> userList = new ArrayList<>(4);

        User user1 = new User();
        user1.setName("1111");
        user1.setAge(11);
        user1.setGender(1);

        User user2 = new User();
        user2.setName("2222");
        user2.setAge(22);
        user2.setGender(2);

        User user3 = new User();
        user3.setName("3333");
        user3.setAge(33);
        user3.setGender(3);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user3);

        // 求和
        int sum = userList.stream().filter(u -> u.getAge() > 11).mapToInt(User::getAge).sum();
        System.out.println(JSON.toJSONString(sum));

        // 排序
        userList.sort(Comparator.comparing(User::getAge).reversed().reversed());
        System.out.println(JSON.toJSONString(userList));

        // 去重
        userList = userList.stream().distinct().collect(Collectors.toList());
        System.out.println(JSON.toJSONString(userList));

        // 取第一个值
        Optional<User> first = userList.stream().filter(u -> u.getAge() > 11).findFirst();
        System.out.println(JSON.toJSONString(first.get()));

        // 转化为一个map
        Map<Integer, List<User>> collect = userList.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println(JSON.toJSONString(collect));

        // 转化成一个map set
        Map<Integer, Set<User>> set = userList.stream().collect(Collectors.groupingBy(u -> u.getAge(), Collectors.toSet()));
        System.out.println(JSON.toJSONString(set));
    }
}
