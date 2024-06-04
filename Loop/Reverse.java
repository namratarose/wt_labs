//Program for reversing the digits of a number
import java.util.Scanner;
class ReverseLogic{
    public void reverse(int n){
        int num;
        while(n>0)
        {
            num=n%10;
            System.out.print(num);
            n=n/10;
        }
    }

}
class Reverse{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to reverse:");
        n=sc.nextInt();
        ReverseLogic r = new ReverseLogic();
        r.reverse(n);
    }
}