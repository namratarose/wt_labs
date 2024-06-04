<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>jsp page</title>
</head>
<body bgcolor="lightcyan">
	<h1> This is first jsp page</h1>
	<div align="center">
		<h1>Registraion Form</h1>
		<form action="register.jsp" method="post">
			<table bgcolor="lightyellow" border="1" cellpadding="4">
				<tr>
					<td>Enter your Name</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Enter your password</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td>Enter your Email Id</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Enter your Gender</td>
					<td>Male<input type="radio" name="gender" value="Male"> Female<input type="radio" name="gender" value="Female"></td>
				</tr>
				<tr>
					<td>Enter your City</td>
					<td><select name="city">
						<option value="Prayagraj">Prayagraj</option>
						<option value="Lucknow">Lucknow</option>
						<option value="Varanasi">Varanasi</option>
					</select>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"> <input type="submit" name="submit">  <input type="reset" name="Reset">  </td>
				</tr>
				
			</table>
			
		</form>


	</div>
</html>