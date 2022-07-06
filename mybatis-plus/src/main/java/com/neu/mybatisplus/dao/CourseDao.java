package com.neu.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.mybatisplus.entity.Course;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Course)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-06 11:51:01
 */

@Mapper
public interface CourseDao extends BaseMapper<Course> {

}

