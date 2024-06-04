import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.StringTokenizer; 
  
public class Calc_Server 
{ 
    public static void main(String args[]) throws IOException 
    { 
  
        // Step 1: Establish the socket connection. 
        ServerSocket ss = new ServerSocket(4444); 
        Socket s = ss.accept(); 
  
        // Step 2: Processing the request. 
        DataInputStream dis = new DataInputStream(s.getInputStream()); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
   
        int input=dis.readInt();
        int res=input*input;

        dos.writeInt(res);

        s.close();
        ss.close();
    } 
}