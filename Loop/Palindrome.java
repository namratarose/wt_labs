// Java program to check the number is palindrome or not
import java.util.Scanner;
class PalinLogic{
    public void isPalindrome(int n){
        int num=n;
        int rem=0;
        int digit;
        while(n>0){
            digit = n%10;
            rem = rem*10+digit;
            n=n/10;
        }
        if (rem==num)
            System.out.println(num+" is Palindrome");
        else
            System.out.println(num+" is not Palindrome");
    }
}
class Palindrome{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check palindrome:");
        n=sc.nextInt();
        PalinLogic obj = new PalinLogic();
        obj.isPalindrome(n);
    }
}