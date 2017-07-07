/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: Department.java 
 * @Prject: standard
 * @Package: com.whhp.entity 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月12日 上午8:29:27 
 * @version: V1.0   
 */
package com.whhp.pojo;

/** 
 * @ClassName: Department 
 * @Description: 部门类
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月12日 上午8:29:27  
 */
public class Department {
	private String deptNo;
	private String deptName;
	
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department() {
		super();
	}
	public Department(String depNo, String deptName) {
		super();
		this.deptNo = depNo;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
}
