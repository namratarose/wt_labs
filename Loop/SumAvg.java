// Program for sum and  average of digits of a given number
import java.util.Scanner;
class Logic{
    public void sumavg(int n)
    {
        int digit,sum=0,avg,count=0;
        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            count++;
            n=n/10;
        }
        System.out.println( "Sum = "+sum);
        avg=sum/count;
        System.out.println("Average is ="+avg);        
    }    
}

class SumAvg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        Logic obj=new Logic();
        obj.sumavg(n); 
               
    }
}