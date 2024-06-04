import java.net.*;
import java.io.*;
class Client
{
	public static void main(String[] args) {
		
	
	try{
		System.out.println("Client is ready");
		Socket s= new Socket("localhost",8080);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the message ...");
		String str=br.readLine();
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println(str);
		BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("Server Says: "+br1.readLine());		
			
		s.close();

	}catch(Exception e)
	{System.out.println(e);}
	}
}