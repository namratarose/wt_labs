import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress; 
import java.net.Socket; 
import java.net.UnknownHostException; 
import java.util.Scanner;
import javax.print.event.PrintEvent; 
  
public class Calc_Client 
{ 
    public static void main(String[] args) throws IOException 
    { 
        InetAddress ip = InetAddress.getLocalHost(); 
        int port = 4444; 
        Scanner sc = new Scanner(System.in); 
  
        // Step 1: Open the socket connection. 
        Socket s = new Socket(ip, port); 
        System.out.println("Connection is established");
               
  
        // Step 2: Communication-get the input and output stream 
        DataInputStream dis = new DataInputStream(s.getInputStream()); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 

        System.out.println("Enter number to find square:");
        int num=sc.nextInt();

        dos.writeInt(num);

        System.out.print("Square of " + num + " number is:");         
        int ans = dis.readInt(); 
        System.out.println(ans);         
        s.close();
    } 
} 