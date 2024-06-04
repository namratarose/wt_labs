import java.net.*;
import java.io.*;
class Server
{
	public static void main(String[] args) {
		
	try{
		System.out.println("waiting for client request");
		ServerSocket ss=new ServerSocket(8080);
		Socket s=ss.accept();
		System.out.println("connection established successfully");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("Client Says: "+msg);
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Say something..");
		String msg1=br1.readLine();	
		PrintWriter sout=new PrintWriter(s.getOutputStream(),true);
		sout.println(msg1);
		s.close();
	}catch(Exception e)
	{System.out.println(e);}
	}
	
}