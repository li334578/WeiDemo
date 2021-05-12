package com.wei.demo.collection;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Title Maptest
 * @Author wei
 * @Date 2021/5/12 15:17
 * @Description
 */
@SpringBootTest
public class Maptest {
    private static final Logger logger = LoggerFactory.getLogger(ArrayListtest.class);
    
    @Test
    public void mapdemo1(){
        Object o = new Object();
        Map<String, Object> map = new HashMap<>();
        map.put("aaa",o);//将"aaa"和Object实例映射并关联
        Object target=map.get("aaa");//通过key查找并返回映射的Obj实例
        System.out.println(target==o);//true，同一个实例
        Object another=map.get("bbb");//通过另一个key查找
        System.out.println(another);//未找到则返回null
    }
    @Test
    public void mapdemo2(){
        HashMap<String, String> map = new HashMap<>();
        map.put("dog", "a");
        map.put("pig", "b");
        map.put("cat", "c");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
