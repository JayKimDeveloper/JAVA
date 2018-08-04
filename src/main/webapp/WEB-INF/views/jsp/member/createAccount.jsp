<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	
	function printDate(){
		
		var userId = document.getElementsByName("userId");
		var idSub = document.getElementsbyId("idSub");
		
		
		if(0 < userId.length()){
			
		}
	}
	
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/mail/mailSending" method="post">
			<input type="text" name="userId" style="width: 100%" placeholder="ID">
			<p id="idSub">아이디를 입력해주세요</p>
			<input type="text" name="userPwd" style="width: 100%" placeholder="password">
			<input type="text" name="userMail" style="width: 100%" placeholder="이메일 주소">
	</form>
</body>
</html>