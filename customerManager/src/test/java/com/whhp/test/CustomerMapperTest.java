package com.whhp.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.whhp.pojo.Customer;
import com.whhp.service.CustomerService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/springmvc-servlet.xml")
public class CustomerMapperTest {
	@Autowired
	CustomerService customerservice;
	
	@Test
	public void testQueryAll() {
		List<Customer> list = customerservice.queryAll();
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
	}
}
