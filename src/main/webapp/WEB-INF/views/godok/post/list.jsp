<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE HTML>
<html lang="ko">
<head>
<title>고독한 포스트 리스트</title>
<style type="text/css">
	#no{color:blue;
		font-size: 15px;
		
	}
	#title{
	font-size:30px;
	}
	#thread td{
	padding:10px;}
</style>
</head>	
<body>

<div class="divList">
<table id="thread">
	<tr>
		<td id="no">${listVo.no }</td>
		<td id="title">${listVo.title }</td>
	</tr>
	<tr colspan=2>
		<td>${listVo.notice }</td>
	</tr>
</table>
<table class="box">
	<thead>
	  <tr>
	    <th scope="col">포스트 번호</th>
	    <th scope="col">작성일</th>
		<th></th>
	  </tr>
 
	<tbody>  
		<c:if test="${empty list }">
			<tr>
				<td colspan="6" style="text-align: center">
					이 스레드에는 포스트가 존재하지 않습니다.
				</td>
			</tr>
		</c:if>
		<c:if test="${!empty list }">
		  	<!--게시판 내용 반복문 시작  -->	
		  	<c:forEach var="vo" items="${list}">
	  			<tr  style="text-align:center">
	
					<td>${vo.postNo}</td>
	
					<td><fmt:formatDate value="${vo.regdate}"
						pattern="yyyy-MM-dd"/> </td>
	
									</tr>
			</c:forEach>
		  	<!--반복처리 끝  -->
	  	</c:if>
	  </tbody>
</table>
<br>	   
</div>

<div class="divBtn">
    <a href="<c:url value='/godok/post/write.do?no=${param.no}'/>">글쓰기</a>
</div>

</body>
</html>
