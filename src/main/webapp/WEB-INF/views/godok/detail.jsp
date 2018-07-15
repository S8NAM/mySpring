<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고독한 스레드 디테일</title>
</head>
<body>
	<h1>스레드의 포스트 목록을 여기에 출력하시오</h1>
<h2>글 상세보기</h2>
	<div class="divForm">
		<div class="firstDiv">
			<span class="sp1">제목</span> <span>${vo.no}</span>
		</div>

		<div>
			<span class="sp1">등록일</span> <span>${vo.regdate}</span>
		</div>
		<div>

		</div>

		<div class="center">
			<a href='<c:url value="/godok/edit.do?no=${param.no}"/>'>수정</a> |
        	<a href='<c:url value="/godok/delete.do?no=${param.no}"/>'>삭제</a> |
        	<a href='<c:url value="/godok/list.do"/>'>목록</a>			
		</div>
	</div>
</body>
</html>