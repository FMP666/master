<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>生日</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.sid }</td>
				<td>${s.sname }</td>
				<td>${s.sage }</td>
				<td>${s.sbirth }</td>
				<td>
					<a href="#">修改</a>
					<a href="#">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>