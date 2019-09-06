<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 관리 시스템</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> 
</head>
	
<body>
<div>
 <h2>회원가입</h2>
	 	  <form id="join_form"  action="<%=request.getContextPath()%>/student.do">
	      이름 <input type="text"  name="name" /> <br/>
	      주민번호 <input type="text" name="ssn" /> <br/>
	      학번 <input type="text"  name="hakbun" /> <br/>
	      </form>

</div>
<script>
$('#join_form').submit(function(){
   alert('제출중');
});
	
</script>
</body>
</html>