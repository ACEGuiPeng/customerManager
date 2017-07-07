/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: CustomerService.java 
 * @Prject: customerManager
 * @Package: com.whhp.service 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月24日 下午9:32:56 
 * @version: V1.0   
 */
package com.whhp.service;

import java.util.List;

import com.whhp.pojo.Customer;

/** 
 * @ClassName: CustomerService 
 * @Description: 
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月24日 下午9:32:56  
 */
public interface CustomerService {
	
	public List<Customer> queryAll();
	public int remove(int id);
	public Customer showInfo(int id);
	public int updateInfo(Customer customer);
	public int addInfo(Customer customer);
	public long getRows(String deptNo);
	public List<Customer> selectedQuery(String deptNo, long pageNo, long pageSize);
}
