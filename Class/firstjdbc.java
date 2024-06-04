import java.sql.*;
import java.util.Scanner;
class firstjdbc{
	
	public static void main(String a[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/ucer","root","");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
				System.out.println("Id:-"+rs.getInt(1)+" Name"+
				rs.getString(2)+"Age: "+rs.getInt(3));
			
			con.close();
		}catch(Exception e){ System.out.println(e);}
	}
}