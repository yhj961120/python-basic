<%@page import="kr.co.aiai.dao.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">



</script>
</head>
<body>
<form action="emp_add_act" method="post" >
	<table border="1px" style="width: 200px">
		<tr>
			<td>사번</td>
			<td>
				자동생성
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name="e_name" value="" />
			</td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<input type="text" name="sex" value="" />
			</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>
				<input type="text" name="addr" value="" />
			</td>
		</tr>	
		<tr>
			<td colspan="2">
				<input type="submit" value="실행" />
			</td>
		</tr>					
	</table>
</form>
</body>
</html>