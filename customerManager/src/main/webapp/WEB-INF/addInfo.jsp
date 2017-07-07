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
<title>添加员工信息</title>
</head>
<body>
	<h2>添加员工信息</h2>
	<form action="<%=basePath%>spring/controller/addInfo" method="post">
		<input name="cusNo" type="hidden" value="">
		<table>
			<tr>
				<td>员工姓名</td>
				<td><input name="cusName" type="text" value=""></td>
			</tr>
			<tr>
				<td>性别</td>
				<td id="sex_td"><input type="radio" name="sex" value="男">男&nbsp;&nbsp;&nbsp;
					<input type="radio" name="sex" value="女">女</td>
			</tr>
			<tr>
				<td>入职时间</td>
				<td><input name="hireDate" type="date" value=""></td>
			</tr>
			<tr>
				<td>部门编号</td>
				<td><select name="deptNo">
						<c:forEach items="${deptList }" var="obj">
							<option value="${obj.deptNo }">${obj.deptName }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" id="input_td"><input type="submit" value="确认提交">
					&nbsp;&nbsp; <input type="reset" value="重置"> &nbsp;&nbsp; <input
					type="button" value="返回首页"
					onclick="location.href='<%=basePath%>spring/controller/queryAll'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>