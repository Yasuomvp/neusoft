package com.neu.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neu.mybatisplus.dao.StudentDao;
import com.neu.mybatisplus.entity.Student;
import com.neu.mybatisplus.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2022-07-06 11:51:29
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}

