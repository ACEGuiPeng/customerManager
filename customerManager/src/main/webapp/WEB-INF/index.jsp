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
<link href="<%=basePath%>css/index.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>js/jquery-1.12.4.js"></script>
<title>员工信息列表</title>
</head>
<body>
	<c:if test="${pb.list==null }">
		<jsp:forward page="/spring/controller/queryAll"></jsp:forward>
	</c:if>
	<script type="text/javascript">
	<c:if test="${mess!=null }" >
				alert("${mess }");
	</c:if>
	</script>
	<script type="text/javascript">
		function doPage(pageNo) {
			$("input[name='pageNo']").val(pageNo);
			$("#selectForm").submit();
		}
		function goPage() {
			var pageNo = $("#go_input").val();
			var pattern = /^\d$/;
			if (pattern.test(pageNo)){
				$("input[name='pageNo']").val(pageNo);
				$("#selectForm").submit();
			}else{
				alert("请输入正确的数字");
				var pageNo = $("#go_input").val("");
			}
		}
	</script>
	<h2>员工信息表</h2>
	<p id="add_p">
		<a href="spring/controller/preAddInfo">添加员工</a>
	</p>
	<form action="<%=basePath%>spring/controller/queryAll" method="post" id="selectForm">
	<p id="select_p">
		<select name="deptNo">
			<option value="0">请选择部门</option>
			<c:forEach items="${deptList }" var="obj">
				<option value="${obj.deptNo }"
					<c:if test="${obj.deptNo==deptNo }">
					selected='selected'
					</c:if>
				>${obj.deptName }</option>
			</c:forEach>
		</select>
		<input name="pageNo" value="1" type="hidden">
		<input type="submit" value="查询">
	</p>
	</form>
	<table>
		<thead>
			<th>员工编号</th>
			<th>员工姓名</th>
			<th>性别</th>
			<th>入职时间</th>
			<th>部门编号</th>
			<th>部门名称</th>
			<th>删除</th>
			<th>详细</th>
			<th>修改</th>
		</thead>
		<tbody>
			<c:forEach items="${pb.list}" var="obj">
				<tr>
					<td>${obj.cusNo }</td>
					<td>${obj.cusName }</td>
					<td>${obj.sex }</td>
					<td>${obj.hireDate }</td>
					<td>${obj.deptNo }</td>
					<td>${obj.dept.deptName }</td>
					<td><a
						href="<%=basePath %>spring/controller/remove/${obj.cusNo }">删除</a></td>
					<td><a
						href="<%=basePath %>spring/controller/showInfo/${obj.cusNo }">详细</a></td>
					<td><a
						href="<%=basePath %>spring/controller/preUpdateInfo/${obj.cusNo }">修改</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<td colspan="9"><a href="javascript:doPage(1)">首页</a>&nbsp;&nbsp;
				<a href="javascript:doPage(${pb.pageNo-1 })">上一页</a>&nbsp;&nbsp; <a
				href="javascript:doPage(${pb.pageNo+1 })">下一页</a>&nbsp;&nbsp; <a
				href="javascript:doPage(${pb.totalPages })">末页</a>&nbsp;&nbsp; &nbsp;
				第&nbsp;${pb.pageNo }&nbsp;页/共&nbsp;${pb.totalPages }&nbsp;页
				&nbsp;&nbsp; &nbsp;<input id="go_input" type="text" value="">&nbsp;&nbsp; &nbsp;<input type="button" value="GO" onclick="javascript:goPage()">
				</td>
				
		</tfoot>
	</table>
</body>
</html>