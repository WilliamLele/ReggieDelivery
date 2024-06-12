package com.william.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.william.entity.Employee;
import com.william.mapper.EmployeeMapper;
import com.william.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created by William Wang 2024/6/10
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
