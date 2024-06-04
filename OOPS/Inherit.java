class First{
    public void fun1(){
        System.out.println("This is first class method");
    }
    
}
class Second extends First{
    public void fun2(){
        System.out.println("This is second class method");
    }    
}
class Third extends Second{
    public void fun3(){
        System.out.println("This is third class method");
    }
}
class Inherit{
    public static void main(String[] args){
        First obj1=new First();
        obj1.fun1();
        // obj1.fun2(); //Can not call child class method
        Second obj2=new Second();
        obj2.fun2();
        obj2.fun1();

        Third obj3=new Third();
        obj3.fun3();
        obj3.fun2();
        obj3.fun1();
    }
}