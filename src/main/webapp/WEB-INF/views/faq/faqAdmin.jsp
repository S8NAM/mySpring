<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FAQ</title>
<style type="text/css">
ul {
    list-style:none;
    margin: 0 0 0 0;
    padding: 10px;
}

li {
    margin: 0 0 0 0;
    padding: 10px 30px 10px 30px;
    float: left;
    font-weight: bold;
}

a:link {text-decoration: none;  color: WindowText; }
a:active {color:#337ab7;}

</style>
<script type="text/javascript" src="<c:url value='../js/jquery-3.3.1.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='../js/jquery-ui.min.js'/>"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#ctg li').click(function(){
		$("#category").prop('value',$(this).text());
		$(this).css('color','#337ab7');
		
	})
	$('#ctg li').not(':first').css('border-left','1px solid #337ab7')
	
	
	
});
</script>
</head>
<body>
<H1>FAQ</H1>
<hr>
<div id="ctg">
	<ul>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=일반'/>" style="color:none;">
		일반</a></li>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=가입/탈퇴'/>">
		가입/탈퇴</a></li>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=계정/로그인/인증'/>">
		계정/로그인/인증</a></li>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=견적요청'/>">
		견적요청</a></li>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=포트폴리오'/>">
		포트폴리오</a></li>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=결제/환불'/>">
		결제/환불</a></li>
		<li><a href="<c:url value='/faq/faqAdmin.do?category=정산'/>">
		정산</a></li>
	</ul>
</div>

<div id="faq">
<br>
<br>
<hr>
<input type="hidden" id="category" name="category">


	<c:if test="${empty list }">
		<div>등록된 FAQ 게시글이 없습니다</div>
	</c:if>
	<c:if test="${!empty list }">
		<c:forEach var="vo"  items="${list }">
		<table class="faq">
		<c:choose>
		<c:when test="${vo.delflag=='Y' }">
			삭제된글입니다
		</c:when>
		<c:otherwise>
		<tr>
			<td>${vo.faqNo }</td>
			<td>${vo.faqTitle }</td>
		</tr>
		<tr>
			<td colspan=2>${vo.faqContent }</td>
		</tr>
		</table>
			</c:otherwise>
			</c:choose>
		
		<div>내용</div>
		</c:forEach>
	</c:if>

</div>

<input type="button" value="FAQ 작성" onclick="location.href='<c:url value="/faq/write.do"/>'">
</body>
</html>