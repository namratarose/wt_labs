//JDBC program to update and display query using preparedStatement
import java.sql.*;
import java.util.Scanner;

class FirstExample
{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/united";
			Connection con=DriverManager.getConnection(url,"root","1111");
			if(con.isClosed())
				System.out.println("Connection is closed");
			else
				System.out.println(" DB Connection is established");

         //Update the query
         String q="update employee set Salary=? where Name=?";
         PreparedStatement pst=con.prepareStatement(q);
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter Employee name:");
         String name=sc.next();
         System.out.println("Enter Salary:");
         int salary=sc.nextInt();
         pst.setInt(1,salary);
         pst.setString(2,name);
         
         int i=pst.executeUpdate();
         System.out.println(i+ " record updated successfully..");

         //Display the query
         ResultSet rs=pst.executeQuery("select * from employee");
         System.out.println("ID\tName\tCompany\tSalary");
         while(rs.next())
         {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
         }
         con.close();

		}catch(Exception e)
		{System.out.println(e);}
	}
}