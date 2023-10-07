package com.atguigu.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * ClassName: User
 * Package: com.atguigu.mybatisplus.pojo
 * Description:
 *
 * @Author 逍遥子
 * @Create 2023/7/20 17:55
 * @Version 1.0
 */
@Data
@TableName("t_user")
public class User {
    @TableId(value = "uid")
    private Long id;
    @TableField("user_name")
    private String name;
    private Integer age;
    private String email;
    @TableLogic
    private Integer isDeleted;
}

