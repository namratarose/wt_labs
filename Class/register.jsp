<!DOCTYPE html>
<%@page import="java.sql.*" %>
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
			String url="jdbc:mysql://localhost:3306/ucer";
			try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,"root","");
					if(con.isClosed())
						{out.println("<br>D/B Connection is closed.");}
					else{out.println("<br>D/B Connection is Esatablished..");}
				PreparedStatement pst=con.prepareStatement("insert into register_std values(?,?,?,?,?)");
				pst.setString(1,name);
				pst.setString(2,password);
				pst.setString(3,Email);
				pst.setString(4,gender);
				pst.setString(5,city);
				int i=pst.executeUpdate();
				out.println(i+ " <br>record is inserted successfully..");
				out.println("<br> Your record Are: -");

					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from register_std");
					while(rs.next())
					{
						out.println("<br>Name : "+rs.getString(1));
						out.println(" Password : "+rs.getString(2));
						out.println(" Email Id : "+rs.getString(3));
						out.println(" Gender : "+rs.getString(4));
						out.println(" City : "+rs.getString(5));
					}

					con.close();

			}catch(Exception e)
			{out.println(e);}


		%>

	</h2>
</body>
</html>