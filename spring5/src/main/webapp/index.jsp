<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
스프링 5 프로젝트입니다.@@@
<h3 style=color:red>게시판 내용입니다.</h3>
<form action="insert.do">
	번호: <input type="text" name="no"><br>
	제목: <input type="text" name="title"><br>
	내용: <input type="text" name="content"><br>
	글쓴이: <input type="text" name="writer"><br>
	<button type="submit">글쓰기 완료</button>
</form>
</body>
</html>