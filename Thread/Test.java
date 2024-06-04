// Multi Threading using Runnable interface
class A implements Runnable{
    public void run(){
        for(int i=0;i<9;i++)
        {
            try{
                Thread.sleep(10);
            }
            catch(Exception e){}
            System.out.println("Class A method");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<9;i++){
            try{
                Thread.sleep(10);
            }
            catch(Exception e){}
            System.out.println("Class B method");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
