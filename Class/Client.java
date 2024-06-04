import java.io.*;
import java.net.*;
class Client
{
	public static void main(String[] args) {
		try{
			System.out.println("Client is ready");
			Socket soc=new Socket("127.0.0.1",8088);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number=");
			int cin=Integer.parseInt(br.readLine());
			PrintWriter cout=new PrintWriter(soc.getOutputStream(),true);
			cout.println(cin);
			BufferedReader br1=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(br1.readLine());

			soc.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}