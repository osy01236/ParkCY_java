<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
//자바 영역

//  주소? userId=gold&userPw=1234
 // ? 뒤부분은 파라미터 영역이다   파라미터란 ? 메서드 정의 시 외부에서 데이터를 전달받기 위해 선언한 변수가 위치하는 곳
String id = request.getParameter("userId");
String pw = request.getParameter("userPw");
//request 요청
//respon 응답



%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>아이디 : <%=id %></h3>
	<h3>비밀번호 : <%=pw %></h3>

</body>
</html>