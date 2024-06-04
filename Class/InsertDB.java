import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {
   static final String DB_URL = "jdbc:mysql://localhost/record";
   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO student VALUES (119, 'sachin', 'sonker', 18)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO student VALUES (121, 'shivam', 'Mishra', 25)";
         stmt.executeUpdate(sql);
         
         System.out.println("Inserted records into the table successfully...");   	  
      } catch (SQLException e) {
        System.out.println(e);
      } 
   }
}