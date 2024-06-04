import Thread.Test;

class Test{
    static int a=10;
    public void set(){
        a++;
    }
    public void show(){
        System.out.println("The value of a="+a);
    }
    public static void display()
    {
        System.out.println("Hello java");
    }
}
class StaticM{
    public static void display()
    {
        System.out.println("Hello java");
    }
    public static void main(String[] args)
    {
        Test.display(); //can be called without creating object with the classname.method due to calling in other class
        display();  //can be called without creating object and without the class name
    }
}