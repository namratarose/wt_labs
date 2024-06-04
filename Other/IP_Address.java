// Java program to get IP address of the device
import java.net.InetAddress;
public class IP_Address 
{
    public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();    //Provides host name and host address both
        System.out.println(IP);
        System.out.println("IP of my system is := "+IP.getHostAddress());
        System.out.println("Host name of my system is := "+IP.getHostName());
    }    
}