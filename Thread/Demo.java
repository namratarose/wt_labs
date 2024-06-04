// Multi Threading using Thread class
class Even extends Thread{
    public void run(){
        for(int i=0;i<20;i++)
        {
            if(i%2==0)
            {
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){}
                System.out.println("Even Thread:"+i);
            }
        }
    }
}
class Odd extends Thread{
    public void run(){
        for(int i=1;i<20;i+=2)
        {
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
            System.out.println("Odd Thread:"+i);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Even e=new Even();
        Odd o=new Odd();
        e.start();
        o.start();
    }
}