import java.util.Scanner;
import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException
    {
        // // Taking string input using command line arguments
        // String name=args[0];
        // String name2=args[1];
        // System.out.println("First Name "+name+" Last Name:"+name2);


        // // write a java program to add wo numbers and take input from command line aggument
        // int a=Integer.parseInt(args[0]);
        // int b=Integer.parseInt(args[1]);
        // System.out.println("Sum is: "+(a+b));

        // Using Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Sum is: "+(a+b));
        System.out.println("Difference is: "+(a-b));
        System.out.println("Multiplication is: "+(a*b));
        System.out.println("Division is: "+(a/b));
        System.out.println("Modulus is: "+(a%b));
        
        // // Using BufferedReafer
        // int a,b;
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(in);
        // System.out.println("Enter first number:");
        // a=Integer.parseInt(br.readLine());
        // System.out.println("Enter second number:");
        // b=Integer.parseInt(br.readLine());
        // System.out.println("Sum is: "+(a+b));
    }
}