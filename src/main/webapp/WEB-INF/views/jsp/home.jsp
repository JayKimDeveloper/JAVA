<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<p> 개발자 김용현입니다. </p>
	<button>로그인</button>
	<button onclick="location.href='/member/createAccount'" value="register">회원가입</button>
	<button onclick="location.href='/boardList.do'" value="board">게시판</button>
</body>
</html>
