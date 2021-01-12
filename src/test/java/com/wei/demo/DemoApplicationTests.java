package com.wei.demo;

import com.wei.demo.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Test
    void contextLoads() {
        UserDto userold = new UserDto();
        userold.setId(1);
        userold.setUser("张三");
        userold.setPassword("123456");
        userold.setAge(15);
        userold.setHeight(170.1);
        userold.setWeight(51.6);
        logger.info("旧对象"+userold);

        UserDto userDto = new UserDto();
//        赋值
        BeanUtils.copyProperties(userold,userDto);
        System.out.println(userold +""+ userDto);

    }

}
