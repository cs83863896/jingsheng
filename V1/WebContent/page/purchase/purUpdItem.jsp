<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h1>更新货品</h1>
<s:form action="updateItem" method="post">
<s:hidden name="item.itemId" />
<s:hidden name="item.itemCreateUser" />
<s:hidden name="item.itemCreateDate" />
<s:textfield name="item.itemNo" label="货品编号" value="%{item.itemNo}"/>
<s:textfield name="item.itemName" label="货品名称" value="%{item.itemName}"/>
<s:textfield name="item.itemNum" label="货品数量"  value="%{item.itemNum}"/>
<s:textfield name="item.itemPrice" label="货品单价" value="%{item.itemPrice}"/>
<s:textfield name="item.itemModel" label="货品型号"  value="%{item.itemModel}"/>
<s:doubleselect doubleList="#request.vendor[top]" doubleValue="%{item.itemVendor}" value="%{item.itemCategory}" list="#request.vendor.keySet()" doubleName="item.itemVendor" name="item.itemCategory" label="货品分类/供应商"  />
<s:submit value="确认" />
</s:form>
</body>
</html>