/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: CustomerMapper.java 
 * @Prject: customerManager
 * @Package: com.whhp.mapper 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月24日 下午5:34:05 
 * @version: V1.0   
 */
package com.whhp.mapper;

import java.util.List;
import java.util.Map;

import com.whhp.pojo.Customer;

/** 
 * @ClassName: CustomerMapper 
 * @Description: 用户Mapper
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月24日 下午5:34:05  
 */
public interface CustomerMapper {
	public List<Customer> queryAll();
	public int remove(int id);
	public Customer showInfo(int id);
	public int updateInfo(Customer customer);
	public int addInfo(Customer customer);
	public List<Customer> selectedQuery(Map<String, Object> pbMap);
	public long getRows(String deptNo);
}
