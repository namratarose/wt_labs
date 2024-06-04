import java.net.*;
import java.io.*;
class Server
{
	public static void main(String[] args) {
		
		try{
			System.out.println("waiting for client request");
			ServerSocket ss=new ServerSocket(8088);
			Socket soc=ss.accept();
			System.out.println("Connection Established successfully");
			BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			int num=Integer.parseInt(br.readLine());
			
			PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
			out.println("Factorial of number: "+num+" is= "+fact(num));

			soc.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static int fact(int n)
	{
		int f=1,i;
		for(i=1;i<=n;i++)
			{f=f*i;}
		return f;
	}
}