package com.neu.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Car)表实体类
 *
 * @author makejava
 * @since 2022-07-06 12:05:05
 */
@SuppressWarnings("serial")
@Data
public class Car extends Model<Car> {

    private Long id;

    private String brand;

    private String price;



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

