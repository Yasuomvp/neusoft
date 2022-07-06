package com.neu.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.mybatisplus.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-06 11:51:29
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {

}

