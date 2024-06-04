<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>welcome page</title>
</head>
<body bgcolor="lightgreen">

	<h1 align="center">This is Session page</h1>
	<h2> Sessions Passed Successfully..<br>
		Your Deatails are:-
		<%
			String name=session.getAttribute("name");
			String password=session.getAttribute("password");
			String Email=session.getAttribute("Email");
			String gender=session.getAttribute("gender");
			String city=session.getAttribute("city");
		%>

		name: <%= name %>
		password: <%= password %>
		Email: <%= Email %>
		gender: <%= gender %>
		city: <%= city %>
	</h2>
</body>
</html>
