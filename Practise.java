import java.io.*;
public class Practise {

    public static void main(String [] args) throws IOException
    {
       Even e = new Even();
       Odd o = new Odd();
       e.start();
       o.start();
    }
}
class Even extends Thread{
    public void run(){
        for (int i = 0; i < 20; i+=2)
        {
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            System.out.println("Even Thread: "+i);
        }
    }       
}
class Odd extends Thread{
    public void run(){
        for (int i = 1; i < 20; i+=2)
        {
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            System.out.println("Odd Thread: "+i);
        }
    }       
}
