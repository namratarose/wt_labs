// Java program to find largest digit of the given number
import java.util.Scanner;
class Logic{
    public void printMaxDigit(int n)
    {
        int digit,max=0;
        while(n>0)
        {
            digit=n%10;
            if(digit>max)
            max=digit;
            n/=10;
        }
        System.out.println("The largest digit is:"+max);
    }
}
class MaxDig{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter a Number : ");
        n=sc.nextInt();
        Logic obj=new Logic();
        obj.printMaxDigit(n);                
    }
}