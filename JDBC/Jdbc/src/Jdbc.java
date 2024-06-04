import java.sql.*;
class Jdbc{
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/United","root","1111");
            Statement stmt=con.createStatement();
            String q="create table Employee(Emp_id int(20) primary key,Name varchar(90),company varchar(90),Salary int(10))";
            stmt.executeUpdate(q);
            System.out.println("Table is created successfully");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}