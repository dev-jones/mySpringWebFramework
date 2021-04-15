<%@page import="java.util.List"%>
<%@page import="com.devjones.web.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>getMemberAllList</h1>

<%

List<MemberDto> list = (List<MemberDto>)request.getAttribute("list");

for(MemberDto dto : list) {
	out.println(dto.toString());
}

%>
</body>
</html>