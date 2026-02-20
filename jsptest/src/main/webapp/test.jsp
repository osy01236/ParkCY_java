<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <%-- 페이지 지시어 --%>
 
<%-- 디렉티브 <%@%>  --%>    
  

<% // 스크립트릿 %>    
<%="이순신"  %><%--표현식--%>   
<%! //선언부  변수나 클래스 만드는것만 가능 %>
<%! int num =10; %>
<%
	if(num >5){
		out.write("5보다 크다");
	}
	
	//내장 객체- jsp 페이지에서 사용자의 요청을받거나, 처리하고, 
	//서버의 정보를 제공하고, 인코딩하고, 변환 시켜주기위한 객체들

	//대표적인 내장객체, requset, response, pageContext, session
	
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>나는 동적 페이지입니다.</h1>
	
	
	<form method="get" action="test_result.jsp">
		이름 <input type="text" name="myName"> <br>
		나이 <input type="number" name="age"> <br>
		직업 <input type="text" name="job"> <br>
			<button>등록</button>
	</form>	
		
		<a href="responseTest.jsp"> response객체 테스트</a>

</body>
</html>