package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.pojo.User;
import com.atguigu.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MyBatisPlusServiceTest
 * Package: com.atguigu.mybatisplus
 * Description:
 *
 * @Author 逍遥子
 * @Create 2023/9/10 15:50
 * @Version 1.0
 */
@SpringBootTest
public class MyBatisPlusServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetCount() {
        // 查询总记录数
        // SELECT COUNT( * ) FROM user
        long count = userService.count();
        System.out.println(count);
    }

    @Test
    public void testInsertMore() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            User user = new User();
            user.setName("ybc" + i);
            user.setAge(20 + i);
            users.add(user);
        }
        boolean b = userService.saveBatch(users);
        System.out.println(b);
    }








}
