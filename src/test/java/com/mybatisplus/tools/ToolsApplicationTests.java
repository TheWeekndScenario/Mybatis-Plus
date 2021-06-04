package com.mybatisplus.tools;

import com.mybatisplus.tools.bean.User;
import com.mybatisplus.tools.mapper.UserMapper;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@SpringBootTest
class ToolsApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    DataSource dataSource;


    @org.junit.Test
    public void testselect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void Connection() throws Exception {
        System.out.println("获取连接：" + dataSource.getConnection());
    }

}
