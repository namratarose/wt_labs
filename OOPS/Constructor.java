// Types of constructor 1.Parameterized 2.Non parameterized

import Thread.A;

class A{
    // Constructor
    A()
    {
        // this keyword is used to call one constructor from another constructor in java
        this(22);
        System.out.println("Default Constructor Called");
    }
    A(int n)
    {
        System.out.println("Parameterized  Constructor Called with " + n);
    }
}
class Constructor{
    public static void main(String[] args)
    {
        A obj1=new A();
        A obj2=new A(33);
    }    
}