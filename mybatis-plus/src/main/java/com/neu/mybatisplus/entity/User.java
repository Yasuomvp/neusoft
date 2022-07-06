package com.neu.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2022-07-06 12:05:20
 */
@SuppressWarnings("serial")
@Data
public class User extends Model<User> {

    private Long id;

    private String about;

    private String password;

    private String username;

    private List<Car> myCars;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }

