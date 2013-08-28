<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h1>添加供应商</h1>
<s:form action="saveVendor" method="post">
<s:textfield name="vendor.vendorName" label="供应商"/>
<s:select name="vendor.vendorCategory" list="#request.category" label="货品分类"/>
<s:submit value="确定" />
</s:form>
</body>
</html>