<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
<h1>添加货品分类</h1>
<s:form action="saveCategory" method="post">
<s:textfield name="category.categoryName" label="分类名称" />
<s:submit value="确认" />
</s:form>
</center>
</body>
</html>