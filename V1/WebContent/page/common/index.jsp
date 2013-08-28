<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎进入景胜内部系统</title>
</head>
<s:if test="#session.user.userType == 'ADM'">
<jsp:forward page="/page/admin/adminIndex.jsp" />
</s:if>
<s:elseif test="#session.user.userType == 'FIN'">
<jsp:forward page="/page/finance/financeIndex.jsp" />
</s:elseif>
<s:elseif test="#session.user.userType == 'PUR'">
<jsp:forward page="/page/purchase/purIndex.jsp" />
</s:elseif>
</html>