package com.neu.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.mybatisplus.entity.Car;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (Car)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-06 12:05:05
 */

@Mapper
public interface CarDao extends BaseMapper<Car> {


    @Select("select car.* from user_car,car where user_car.user_id = #{user_id} and car.id = user_car.car_id")
    List<Car> returnCars(@Param("user_id") String id);


}

