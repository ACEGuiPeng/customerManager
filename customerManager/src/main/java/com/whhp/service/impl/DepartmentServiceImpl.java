package com.whhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whhp.mapper.DepartmentMapper;
import com.whhp.pojo.Department;
import com.whhp.service.DepartmentService;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> queryAll() {
		return departmentMapper.queryAll();
	}
}
