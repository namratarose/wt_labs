import java.sql.*;
import java.util.Scanner;

class firstbd
{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ucerit";
			Connection con=DriverManager.getConnection(url,"root","");
			if(con.isClosed())
				System.out.println("Connection is closed");
			else
				System.out.println(" DB Connection is established");
			String q="insert into cbs values(?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			Scanner sc=new Scanner(System.in);
			System.out.println("for update the record eneter the name");
			String name=sc.next();
			System.out.println("Enter the id");
			int id=sc.nextInt();
			pst.setString(1,name);
			pst.setInt(2,id);
			int i=	pst.executeUpdate();
			System.out.println(i+ " record updated successfully..");
			con.close();

		}catch(Exception e)
		{System.out.println(e);}
	}
}