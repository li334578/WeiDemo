package com.wei.demo.Collection.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.LinkedList;

/**
 * @Title LinkedList
 * @Author wei
 * @Date 2021/1/28 13:08
 * @Description
 */
@SpringBootTest
public class LinkedListtest{
    private static final Logger logger =  LoggerFactory.getLogger(LinkedList.class);


    @Test
    public void testadd() {
        LinkedList list = new LinkedList();
        list.add('2');
        list.add('3');
        list.add(1,'1');
        list.add('4');
        list.addFirst('0');
        logger.info("遍历循环");
        for (Object str:list
             ) {
            System.out.println(str);
        }
        logger.info("Set----------------");
        list.set(1, "0.5");
        logger.info("打印get--------------");
        System.out.println(list.get(1));
        list.remove(3);
        for (Object str:list
        ) {
            System.out.println(str);
        }
        list.clear();
    }
}
