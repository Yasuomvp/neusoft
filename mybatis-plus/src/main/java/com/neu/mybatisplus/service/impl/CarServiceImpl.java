package com.neu.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neu.mybatisplus.dao.CarDao;
import com.neu.mybatisplus.entity.Car;
import com.neu.mybatisplus.service.CarService;
import org.springframework.stereotype.Service;

/**
 * (Car)表服务实现类
 *
 * @author makejava
 * @since 2022-07-06 12:05:05
 */
@Service("carService")
public class CarServiceImpl extends ServiceImpl<CarDao, Car> implements CarService {

}

