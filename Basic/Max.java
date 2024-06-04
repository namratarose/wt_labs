import java.util.Scanner;
class Max{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Enter third number:");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is maximum");
        }
        else if(b>c)
        {
            System.out.println(b+" is maximum");
        }
        else
        {
            System.out.println(c+" is maximum");
        }
    }
}