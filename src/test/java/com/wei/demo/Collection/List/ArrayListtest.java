package com.wei.demo.Collection.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title ArrayListtest
 * @Author wei
 * @Date 2021/1/28 11:02
 * @Description
 */
@SpringBootTest
public class ArrayListtest{
    private static final Logger logger = LoggerFactory.getLogger(ArrayListtest.class);

    @Test
    public void testadd() {
        ArrayList list = new ArrayList();
//      add 添加内容 add(String,int),指定下标添加内容
        list.add("demo1");
        list.add("demo2");
        list.add("demo3");
        list.set(1,"test");
        System.out.println("for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("foreach循环遍历");
        for (Object str: list) {
            System.out.println(str);
        }
//      indexOf目标第一次出现下标
        int demo2 = list.indexOf("demo2");
        logger.info("demo位置:"+ demo2);
//      subList查询区间范围内元素
        List list1 = list.subList(1, 2);
        logger.info("返回区间元素包左不包右"+list1);
//      removeAll删除list所有元素
        list.removeAll(list);
        logger.info("返回list"+list);
    }
}

