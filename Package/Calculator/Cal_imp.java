import cal.Math;
import java.util.Scanner;
class First{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Math obj=new Math();
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Addition is:"+obj.Add(a,b));
        System.out.println("Subtraction is:"+obj.Sub(a,b));
        System.out.println("Multiply is:"+obj.Mul(a,b));
        System.out.println("Divide is:"+obj.Divide(a,b));
    }
}