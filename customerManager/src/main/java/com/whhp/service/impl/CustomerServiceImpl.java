/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: CustomerServiceImpl.java 
 * @Prject: customerManager
 * @Package: com.whhp.service.impl 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月24日 下午9:33:44 
 * @version: V1.0   
 */
package com.whhp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whhp.mapper.CustomerMapper;
import com.whhp.pojo.Customer;
import com.whhp.service.CustomerService;

/**
 * @ClassName: CustomerServiceImpl
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com
 * @date: 2017年6月24日 下午9:33:44
 */
@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> queryAll() {
		return customerMapper.queryAll();
	}

	@Override
	public int remove(int id) {
		return customerMapper.remove(id);
	}

	@Override
	public Customer showInfo(int id) {
		return customerMapper.showInfo(id);
	}

	@Override
	public int updateInfo(Customer customer) {
		return customerMapper.updateInfo(customer);
	}

	@Override
	public int addInfo(Customer customer) {
		return customerMapper.addInfo(customer);
	}

	@Override
	public long getRows(String deptNo) {
		return customerMapper.getRows(deptNo);
	}

	@Override
	public List<Customer> selectedQuery(String deptNo, long pageNo, long pageSize) {
		Map<String, Object> pbMap = new HashMap<String, Object>();
		pbMap.put("deptNo", deptNo);
		pbMap.put("preLimit",(pageNo-1)*pageSize);
		pbMap.put("aftLimit", pageSize);
		return customerMapper.selectedQuery(pbMap);
	}
}
