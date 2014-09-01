<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript" type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script language="javascript" type="text/javascript" src="js/doubleSelect.js"></script>
</head>
<body>
	<h1>添加货品</h1>
	<s:form action="saveItem" method="post">
		<s:textfield name="item.itemNo" label="货品编号" />
		<s:textfield name="item.itemName" label="货品名称" />
		<s:textfield name="item.itemNum" label="货品数量" />
		<s:textfield name="item.itemPrice" label="货品单价" />
		<s:textfield name="item.itemModel" label="货品型号" />

		<s:select list="item.itemVendorName" label="供应商">
			<s:optgroup>--请选择--</s:optgroup>
		</s:select>
		<s:select list="item.itemCategoryName" label="货品分类">
			<s:optgroup>--请选择--</s:optgroup>
		</s:select>
		<!-- 
		<s:doubleselect doubleList="#request.vendor[top]"
			list="#request.vendor.keySet()" doubleName="item.itemVendor"
			name="item.itemCategory" label="货品分类/供应商" />-->
		<s:submit value="确认" />
	</s:form>
</body>
</html>