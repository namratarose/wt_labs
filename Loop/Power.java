import java.util.Scanner;
class Power
{
    public static void main(String[] args)
    {
        int base,exp,power=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        base=sc.nextInt();
        System.out.println("Enter  exponent:");
        exp=sc.nextInt();
        for(i=1;i<=exp;i++)
        {
            power=power*base;
        }
        System.out.println(exp+" times power of "+base+" is :"+power);
    }
}