// Super() as a method
class First{
    First(){
        System.out.println("This is super class default constructor");
    }
    First(int n){
        System.out.println("This is super class parameterized constructor");
    }
    public void msg(){
        System.out.println("This is super class message:Hello");
    }
}
class Second extends First{
    Second(){
        //Defalut constructor of parent class called automatically
        System.out.println("This is sub class default constructor");
    }
    Second(int x){
        super(4);   //Calling the parameterized constructor of the parent class
        System.out.println("This is sub class parameterized constructor");
    }
    public void msg(){
        super.msg();    //Calling super class method
        System.out.println("This is child class message:Welcome");
    }
}
class SuperM{
    public static void main(String[] args)
    {
        // First obj1=new First();
        Second obj2=new Second(6);   //default constructor of parent class also be called automatically
        obj2.msg();
    }
}