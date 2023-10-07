package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Map;


/**
 * ClassName: UserMapper
 * Package: com.atguigu.mybatisplus.mapper
 * Description:
 *
 * @Author 逍遥子
 * @Create 2023/7/20 18:11
 * @Version 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    Map<String , Object> selectMapById(Long id);
}
