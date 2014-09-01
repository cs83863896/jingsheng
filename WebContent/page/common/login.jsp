<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎使用景胜内部系统</title>
</head>
<body>
<h1><font color="red">登陆</font></h1>
<s:form action="loginUser" method="post">
	<s:textfield name="user.userName" label="用户名" />
	<s:password name="user.userPwd" label="密码"/>
	<s:submit value="确定"/>
	<s:reset value="重置" />
</s:form>
<s:property value="#request.logoutSuccess" />
</body>
</html>