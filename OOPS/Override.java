// Example of method overrinding
class A{
    public void show()
    {
        System.out.println("method of A class");
    }
}
class B extends A{
    public void show(){
        // Overridden method
        System.out.println("Method of B Class");
    }
}
class Override{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}