<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
pageContext.setAttribute("br", "<br/>");
pageContext.setAttribute("cn", "\n");
%>
<!DOCTYPE HTML>
<html lang="ko">
<head>
<title>고독한 스레드 리스트</title>
</head>	
<body>

<div class="divList">

<table class="box">
	<thead>
	  <tr>
	    <th scope="col">번호</th>
	    <th scope="col">제목</th>
	    <th scope="col">작성일</th>

	  </tr>
	</thead> 
	<tbody>  
		<c:if test="${empty list }">
			<tr>
				<td colspan="6" style="text-align: center">
					스레드가 존재하지 않습니다.
				</td>
			</tr>
		</c:if>
		<c:if test="${!empty list }">
		  	<!--게시판 내용 반복문 시작  -->	
		  	<c:forEach var="vo" items="${list}">
	  			<tr  style="text-align:center">

					<td>${vo.no}</td>
					<td style="text-align:left">
						<a href
					="<c:url value='/godok/post/list.do?no=${vo.no}'/>">
							<!-- 제목이 긴 경우 일부만 보여주기 -->
							<c:if test="${fn:length(vo.title)>30}">	
								${fn:substring(vo.title, 0, 30)}...
							</c:if>
							<c:if test="${fn:length(vo.title)<=30}">
								${vo.title}
							</c:if>								
						</a>
					</td>

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
    <a href='<c:url value="/godok/write.do"/>' >글쓰기</a>
</div>

</body>
</html>

