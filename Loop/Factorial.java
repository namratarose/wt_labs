import java.util.Scanner;
class Factorial{
    public static int factorial(int num){
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        {
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args)
    {
        int num,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find factorial:");
        num =sc.nextInt();
        // Factorial obj=new Factorial();   //Due to static method factorial() we dont need to make object
        // res=obj.factorial(num);
        res=factorial(num);
        System.out.println("Factorial is:"+res);

    }
}