import java.sql.*;

public class FirstExample {
   static final String DB_URL = "jdbc:mysql://localhost/united";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY = "SELECT * FROM cs32";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print(", ROLLNO: " + rs.getInt(1));
            System.out.print("Name: " + rs.getString(2));
            System.out.println(", BRANCH " + rs.getString(3));
         }
         System.out.print(", DOB: " + rs.getInt(4));
            
            
            
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}