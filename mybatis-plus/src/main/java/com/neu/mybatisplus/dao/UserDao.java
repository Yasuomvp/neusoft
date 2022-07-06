package com.neu.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.mybatisplus.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-06 12:05:20
 */
@Mapper
public interface UserDao extends BaseMapper<User> {


    @Select("select * from user where user.id = #{id}")
    @Results(
            @Result(
                    property = "myCars", column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.neu.mybatisplus.dao.CarDao.returnCars")
            )
    )
    User selectUserAndHisCars(@Param("id") String id);


    @Select("select * from user")
    @Results(
            @Result(
                    property = "myCars", column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.neu.mybatisplus.dao.CarDao.returnCars")
            )
    )
    List<User> selectAllUserAndTheirCars();

}

