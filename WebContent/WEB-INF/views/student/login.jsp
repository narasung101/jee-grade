<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 관리 시스템</title>
</head>
<body>
<div>
	<h2>로그인</h2>
	<form id="login_form" action="<%=request.getContextPath()%>/student.do?action=login">
		ID<input type="text" name="id"/> <br/>
		PASS<input type="password" name="pass"/> <br/>
		<input type="submit" value="전송" />
	</form>
</div>
</body>
</html>