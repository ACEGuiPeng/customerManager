/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: Customer.java 
 * @Prject: standard
 * @Package: com.whhp.entity 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月12日 上午8:28:54 
 * @version: V1.0   
 */
package com.whhp.pojo;

/**
 * @ClassName: Customer
 * @Description: 顾客信息
 * @author: guipeng:guipeng8789502@163.com
 * @date: 2017年6月12日 上午8:28:54
 */
public class Customer {
	private String cusNo;
	private String cusName;
	private String sex;
	private String hireDate;
	private String deptNo;

	private Department dept;
	
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getCusNo() {
		return cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public Customer() {
		super();
	}

	public Customer(String cusNo, String cusName, String sex, String hireDate, String depNo) {
		super();
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.sex = sex;
		this.hireDate = hireDate;
		this.deptNo = depNo;
	}

	@Override
	public String toString() {
		return "Customer [cusNo=" + cusNo + ", cusName=" + cusName + ", sex=" + sex + ", hireDate=" + hireDate
				+ ", deptNo=" + deptNo + ", dept=" + dept + "]";
	}
}
