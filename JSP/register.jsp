<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>welcome page</title>
</head>
<body bgcolor="lightgreen">

	<h1 align="center">This is Wecome page</h1>
	<h2> Your Registration submitted Successfully..<br>
		Your Deatails are:-
		<%
			String name=request.getParameter("uname");
			String password=request.getParameter("password");
			String Email =request.getParameter("email");
			String gender=request.getParameter("gender");
			String city=request.getParameter("city");

			session.setAttribute("name",name);
			session.setAttribute("password",password);
			session.setAttribute("Email",Email);
			session.setAttribute("gender",gender);
			session.setAttribute("city",city);
		%>

		name: <%= name %>
		password: <%= password %>
		Email: <%= Email %>
		gender: <%= gender %>
		city: <%= city %>

		<a href="session.jsp">session page</a>

	</h2>
</body>
</html>