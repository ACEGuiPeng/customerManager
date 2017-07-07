<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>css/showInfo.css" rel="stylesheet"
	type="text/css">
<title>员工详细信息</title>
</head>
<body>
	<h2>员工详细信息</h2>
	<table>
		<tr>
			<td>员工编号</td>
			<td>${cus.cusNo }</td>
		</tr>
		<tr>
			<td>员工姓名</td>
			<td>${cus.cusName }</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>${cus.sex }</td>
		</tr>
		<tr>
			<td>入职时间</td>
			<td>${cus.hireDate }</td>
		</tr>
		<tr>
			<td>部门编号</td>
			<td>${cus.deptNo }</td>
		</tr>
		<tr>
			<td colspan="2"  id="input_td"><input type="button" value="返回首页"
				onclick="location.href='<%=basePath%>spring/controller/queryAll'"></td>
		</tr>
	</table>
</body>
</html>