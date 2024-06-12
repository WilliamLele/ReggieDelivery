package com.william.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.william.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
