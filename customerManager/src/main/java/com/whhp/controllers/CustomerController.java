/**   
 * Copyright © 2017 guipeng. All rights reserved.
 * 
 * @Title: Demo.java 
 * @Prject: customerManager
 * @Package: com.whhp.controllers 
 * @Description: TODO
 * @author: guipeng:guipeng8789502@163.com 
 * @date: 2017年6月23日 下午6:14:15 
 * @version: V1.0   
 */
package com.whhp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.whhp.pojo.Customer;
import com.whhp.pojo.Department;
import com.whhp.service.CustomerService;
import com.whhp.service.DepartmentService;
import com.whhp.util.PageBean;

/**
 * @ClassName: CustomerController
 * @Description: 控制层
 * @author: guipeng:guipeng8789502@163.com
 * @date: 2017年6月23日 下午6:14:15
 */
// 注解控制器
@Controller
// 注解映射
@RequestMapping("controller")
public class CustomerController {
	@Autowired
	@Qualifier("customerServiceImpl")
	CustomerService cusService;
	@Autowired
	@Qualifier("departmentServiceImpl")
	DepartmentService deptService;
	
	@RequestMapping("queryAll")
	public ModelAndView queryAll(String deptNo,String pageNo){
		PageBean pb = new PageBean();
		//如果直接查询，就是查询全部
		if (deptNo==null){
			deptNo="0";
		}
		if (pageNo==null){
			pageNo = "1";
			pb.setPageNo(1);
		}
		//设置页面显示的信息
		pb.setPageSize(8);
		//得到按要求查询的数据条数
		long rows = cusService.getRows(deptNo);
		pb.setRows(rows);
		pb.setPageNo(new Long(pageNo));
		List<Customer> cusList =cusService.selectedQuery(deptNo,pb.getPageNo(),pb.getPageSize());
		pb.setList(cusList);
		List<Department> deptList = deptService.queryAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("deptNo",deptNo);
		mv.addObject("pb", pb);
		mv.addObject("deptList", deptList);
		return mv;
	}
	@RequestMapping("remove/{id}")
	public ModelAndView doRemove(@PathVariable("id") int id) {
		int rows = cusService.remove(id);
		ModelAndView mv = new ModelAndView("forward:/spring/controller/queryAll");
		mv.addObject("mess", rows > 0 ? "删除成功" : "删除失败");
		return mv;
	}
	@RequestMapping("showInfo/{id}")
	public ModelAndView showInfo(@PathVariable("id") int id){
		Customer customer = cusService.showInfo(id);
		ModelAndView mv = new ModelAndView("showInfo");
		mv.addObject("cus",customer);
		return mv;
	}
	@RequestMapping("preUpdateInfo/{id}")
	public ModelAndView preUpdateInfo(@PathVariable("id") int id){
		Customer customer = cusService.showInfo(id);
		ModelAndView mv = new ModelAndView("updateInfo");
		List<Department> deptList = deptService.queryAll();
		mv.addObject("cus",customer);
		mv.addObject("deptList", deptList);
		return mv;
	}
	@RequestMapping("updateInfo")
	public ModelAndView updateInfo(Customer customer){
		int rows = cusService.updateInfo(customer);
		ModelAndView mv = new ModelAndView("forward:/spring/controller/queryAll");
		mv.addObject("mess",rows>0?"修改成功":"修改失败");
		return mv;
	}
	@RequestMapping("preAddInfo")
	public ModelAndView preAddInfo(){
		ModelAndView mv = new ModelAndView("addInfo");
		List<Department> deptList = deptService.queryAll();
		mv.addObject("deptList",deptList);
		return mv;
	}
	@RequestMapping("addInfo")
	public ModelAndView addInfo(Customer customer){
		int rows = cusService.addInfo(customer);
		ModelAndView mv = new ModelAndView("forward:/spring/controller/queryAll");
		mv.addObject("mess",rows>0?"添加成功":"添加失败");
		return mv;
	}
}
