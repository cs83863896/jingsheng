<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
	function del(){
		if(confirm("确定删除此货品吗？删除将无法恢复。")){
		return true;
		}
		return false;
	}
</script>
</head>
<body>
<center><h1>编辑货品分类</h1></center><br/>
<p><s:property value="#session.saveSuccess"/></p>
<p><s:property value="#session.deleteSuccess"/></p>
<p><s:property value="#session.updateSuccess"/></p>
 <table border="1" width="80%" align="center" cellspacing="0" cellpadding="0">
	<tr>
	
	<td style="border: solid 1px ; height: 20px;">货品分类</td>
	
	<td style="border: solid 1px ; height: 20px;">删除</td>
	<td style="border: solid 1px ; height: 20px;">编辑</td>
	</tr>
	<s:iterator value="#request.list" id="category">
	<s:hidden value="#category.categoryId" />
	<tr>
	
	<td style="border: solid 1px ; height: 20px;">
		<s:property value="#category.categoryName" />
	</td>
	<td style="border: solid 1px ; height: 20px;">
		<s:a href="deleteCategory.action?item.categoryId=%{#category.categoryId}" onclick="return del();">删除</s:a>
	</td>
	<td style="border: solid 1px ; height: 20px;">
		<s:a href="getItemById.action?item.itemId=%{#item.itemId}">编辑</s:a>
	</td>
	</tr>
	
	</s:iterator>
	</table>

</body>
</html>