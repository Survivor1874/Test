package com.lin.test.structure;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * 基于数组实现的顺序栈
 *
 * @author linjun.li@quvideo.com
 * @date 2018-10-08 15:02
 **/
public class ArrayStack {


    /**
     * 元素容器
     */
    private Object[] items;

    /**
     * 元素个数
     */
    private Integer count;

    /**
     * 栈容量
     */
    private Integer size;


    public ArrayStack(Integer size) {
        this.count = 0;
        this.size = size;
        this.items = new Object[size];
    }

    /**
     * 压栈
     *
     * @param element 元素
     * @return is success
     */
    public Boolean push(Object element) {
        // 如果栈已满 压栈失败
        if(count.equals(size)) {
            return false;
        }
        items[count] = element;
        count ++;
        return true;
    }

    /**
     * 弹栈
     * @return the element
     */
    public Object pop() {
        // 如果没有元素 返回 null
        if(0 == count) {
            return null;
        }
        count --;
        return items[count];
    }

    public Object[] getItems() {
        return items;
    }

    public void setItems(Object[] items) {
        this.items = items;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(234);
        System.out.println(arrayStack.pop());
        System.out.println(JSON.toJSONString(arrayStack));
    }


}
