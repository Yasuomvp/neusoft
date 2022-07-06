package com.neu.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neu.mybatisplus.dao.CourseDao;
import com.neu.mybatisplus.entity.Course;
import com.neu.mybatisplus.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2022-07-06 11:51:02
 */
@Service("courseService")
public class CourseServiceImpl extends ServiceImpl<CourseDao, Course> implements CourseService {

}

