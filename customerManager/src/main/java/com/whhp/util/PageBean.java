/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: PageBean.java 
 * @Prject: customerManager
 * @Package: com.whhp.util 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月25日 下午3:07:02 
 * @version: V1.0   
 */
package com.whhp.util;

import java.util.List;

import com.whhp.pojo.Customer;

/**
 * @ClassName: PageBean
 * @Description: 页码类
 * @author: guipeng:guipeng8789502@163.com
 * @date: 2017年6月25日 下午3:07:02
 */
public class PageBean {
	private long pageNo; // 当前页
	private long pageSize; // 页面显示信息个数
	private long rows; // 总的信息个数
	private long totalPages;// 总页数
	private List<Customer> list; //存储的数据
	public long getPageNo() {
		return pageNo;
	}
	public void setPageNo(long pageNo) {
		if (pageNo<=0){
			this.pageNo = 1;
		}else if (pageNo>totalPages){
			this.pageNo = totalPages;
		}else {
			this.pageNo = pageNo;
		}
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getRows() {
		return rows;
	}
	public void setRows(long rows) {
		this.rows = rows;
		this.totalPages = rows%pageSize==0?rows/pageSize:rows/pageSize+1;
	}
	public long getTotalPages() {
		return totalPages;
	}
	
	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}
}
