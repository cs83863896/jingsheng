<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
	<s:form action="saveUser" method="post">
		<s:textfield name="user.userName" label="用户名" />
		<s:password name="user.userPwd" label="密码" />
		<s:password name="user.userPwd2" label="确认密码" />
		<s:select name="user.userType" list="{'财务员','仓管员','采购员'}" label="用户类型">
		</s:select>
		<s:submit value="提交"/>
		<s:reset value="重置"/>
	</s:form>
	<s:property value="#request.addSuccess"/>
</body>
</html>