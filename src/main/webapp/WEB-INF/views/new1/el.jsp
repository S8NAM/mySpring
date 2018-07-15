<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page contentType="text/html;charset=utf-8"%>
<% request.setCharacterEncoding("utf-8");%>
<HTML>
<HEAD>
	<TITLE>표현언어의 사용예제2</TITLE>
</HEAD>
<BODY> 
	<H3>표현언어 -파라미터값 처리</H3>
	
	<P>
	<FORM action="el.do" method="post">
		이름 : <input type="text" name="name" 
		<%-- value="${param['name'] }" --%>
		>
		<input type="submit" value="확인">
	</FORM>
	
	<P> [이름] <br>
	표현언어 이용 : ${param.name} <br>
	기존 방식 : <%=request.getParameter("name")%>
	
</BODY>
</HTML>
