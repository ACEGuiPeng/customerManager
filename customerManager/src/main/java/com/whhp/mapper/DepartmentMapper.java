/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: DepartmentMapper.java 
 * @Prject: customerManager
 * @Package: com.whhp.mapper 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月25日 上午10:04:16 
 * @version: V1.0   
 */
package com.whhp.mapper;

import java.util.List;

import com.whhp.pojo.Department;

/** 
 * @ClassName: DepartmentMapper 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月25日 上午10:04:16  
 */
public interface DepartmentMapper {
	List<Department> queryAll();

}
