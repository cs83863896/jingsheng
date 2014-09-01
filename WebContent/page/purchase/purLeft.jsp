<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<table>
<tr>
<td><s:a href="getVendor.action" target="purchasemain">添加货品</s:a></td>
</tr>
<tr>
<td><s:a href="getAllCategory.action" target="purchasemain">添加供应商</s:a></td>
</tr>
<tr>
<td><s:a href="purAddCategory.jsp" target="purchasemain">添加货品分类</s:a></td>
</tr>
<tr>
<td><s:a href="getAllCategory.action" target="purchasemain">编辑货品分类</s:a></td>
</tr>
<tr>
<td><s:a href="logoutUser.action" target="_parent">退出登录</s:a></td>
</tr>
</table>
</body>
</html>