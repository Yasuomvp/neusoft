package com.neu.mybatisplus.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neu.mybatisplus.entity.Course;
import com.neu.mybatisplus.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2022-07-06 11:51:00
 */
@RestController
@RequestMapping("course")
@MapperScan("com.neu.mybatisplus.dao")
@Slf4j
public class CourseController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param course 查询实体
     * @return 所有数据
     */
    @GetMapping("/all")
    public R selectAll(Page<Course> page, Course course) {
        return success(this.courseService.page(page, new QueryWrapper<>(course)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.courseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param course 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Course course) {
        return success(this.courseService.save(course));
    }

    /**
     * 修改数据
     *
     * @param course 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Course course) {
        return success(this.courseService.updateById(course));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.courseService.removeByIds(idList));
    }
}

