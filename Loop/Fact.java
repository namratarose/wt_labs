class logic{
    public int factorial(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return (n*factorial(n-1));
    }
}
class Fact{
    public static void main(String[] args){
        logic obj=new logic();
        System.out.println("factorial is:"+obj.factorial(5));
    }
}