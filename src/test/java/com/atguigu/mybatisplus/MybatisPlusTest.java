package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: MybatisPlusTest
 * Package: com.atguigu.mybatisplus
 * Description:
 *
 * @Author 逍遥子
 * @Create 2023/7/20 18:14
 * @Version 1.0
 */
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);
        if (users == null){
            System.out.println("没有数据");
        }else {
            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i));
            }
        }


    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("zhangsan@atguigu.com");
        int result = userMapper.insert(user);
        System.out.println("result:" + result);
        System.out.println("id:" + user.getId());
    }

    @Test
    public void testDelete() {
        // System.out.println(userMapper.deleteById(1700414870438031361L));
        // Map<String, Object> map = new HashMap<>();
        // map.put("name", "张三");
        // map.put("age", 23);
        // // DELETE FROM user WHERE name = ? AND age = ?
        // int result = userMapper.deleteByMap(map);
        // System.out.println("result:"+ result);
        List<Long> list = Arrays.asList(1L, 2L, 3L);
        // DELETE FROM user WHERE id IN ( ? , ? , ? )
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result:"+ result);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(4L);
        user.setName("李四");
        user.setEmail("lisi@atguigu.com");
        // UPDATE user SET name=?, email=? WHERE id=?
        int result = userMapper.updateById(user);
        System.out.println("result:" + result);

    }


    @Test
    public void testSelect() {
        // 通过id查询用户信息
        User user = userMapper.selectById(1L);
        System.out.println(user);
        // 根据多个id查询多个用户信息
        List<Long> list = Arrays.asList(1L, 2L, 3L);
        List<User> users = userMapper.selectBatchIds(list);
        users.forEach(System.out::println);

        // 根据map集合查询
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Jack");
        map.put("age", 20);
        List<User> users1 = userMapper.selectByMap(map);
        users1.forEach(System.out::println);

        // 查询所有数据
        List<User> users2 = userMapper.selectList(null);

        Map<String, Object> map1 = userMapper.selectMapById(1L);
        System.out.println(map1);
    }




























}
