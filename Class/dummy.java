import java.sql.*;
import java.util.Scanner;
class dummy
{
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/united","root","");
			if(con.isClosed())
				System.out.println("Connection is closed");
			else
				System.out.println("Connection is open");
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
			
			System.out.println("Enter the  Emp_id");
			int id=sc.nextInt();

			System.out.println("Enter the name of Emp_name");
			String name=sc.next();
			System.out.println("Enter the name of company");
			String cmp=sc.next();
			System.out.println("Enter the  Salary");
			int sal=sc.nextInt();
			
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3,cmp);
			pst.setInt(4,sal);

			int i=pst.executeUpdate();
			System.out.println(i+"record inserted..");
			ResultSet rs=pst.executeQuery("select *from employee");
			while(rs.next())
			{
				System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Company : "+rs.getString(3)+" Salary: "+rs.getInt(4));

			}
			con.close();
		}catch(Exception e)
		{System.out.println(e);}
	}
}