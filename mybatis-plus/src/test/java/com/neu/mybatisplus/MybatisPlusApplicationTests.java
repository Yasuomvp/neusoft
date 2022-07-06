package com.neu.mybatisplus;

import com.neu.mybatisplus.dao.CarDao;
import com.neu.mybatisplus.dao.CourseDao;
import com.neu.mybatisplus.dao.StudentDao;
import com.neu.mybatisplus.entity.Student;
import com.neu.mybatisplus.service.CourseService;
import com.neu.mybatisplus.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {


    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private CourseDao courseDao;

    @Autowired
    private CarDao carDao;

    @Test
    void contextLoads() {

        carDao.selectById()

    }

}
