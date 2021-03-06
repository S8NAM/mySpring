<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고독한 스레드 작성</title>
</head>
<body>
	<form name="godokName" method="post"
	action="<c:url value='/godok/write.do'/>"
	onsubmit="return send(this)">
	<fieldset>
		<legend>스레드 작성</legend>
		<div>
			<label for="title">제목</label>
			<input type="text" id="title" name="title"/>
		</div>
		<div>
			<label for="pwd">비밀번호</label>
			<input type="password" id="pwd" name="pwd"/>
		</div>
		<div>
			<label for="notice">내용(500byte)</label><br>
			<textarea id="notice" name="notice" rows="10" cols="50"></textarea>
		</div>
		<div>
		<input type="submit" value="작성하기"/>
		<input type="button" value="스레드 목록"
		onclick="location.href='<c:url value="/godok/list.do"/>'"/>
		</div>
	</fieldset>
	</form>
	
</body>
</html>