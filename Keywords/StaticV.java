class Test{
    static int a=10;
    public void set(){
        a++;
    }
    public void show(){
        System.out.println("The value of a="+a);
    }
}
class StaticV{
    public static void main(String[] args)
    {
        Test obj1=new Test();
        Test obj2=new Test();
        Test obj3=new Test();
        obj1.set();
        obj1.show();
        obj2.set();
        obj2.show();
        obj3.set();
        obj3.show();
        // if variable is not static then all of the object get different variable so Same output will be provided 11
        // if variable is static then same copy will be provided to each object
        // obj1.show();
        // obj2.show();
        // obj3.show();
         
    }
}