import java.util.Scanner;
import java.lang.*;
import java.io.*;
// class Excep{
//     public static void main(String[] args){
//         int a,b;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("File is open");
//         System.out.println("Enter first value:");
//         a=sc.nextInt();
//         System.out.println("Enter second value:");
//         b=sc.nextInt();
//         try{
//             int div=a/b;
//             System.out.println("Division is:"+div);   
//             // int ar[]=new int[3];
//             // System.out.println("Element at index 5 is:",ar[5]);         
//         }
//         // The below exception is not working
//         catch(ArrayIndexOutOfBoundsException ex) {
//             System.out.println("The given array index is out of bounds");
//         }
//         // At a time only one exception can be occured
//         // The below class should be at last
//         catch(Exception e){
//             System.out.println("error:"+e.getMessage());
//             // System.out.println("You can't divide a number by 0");
//         }
//         finally{
//             System.out.println("File is closed");            
//         }
//         System.out.println("Bye Bye");
        
//     }
// }

// // Throw and keyword
// class Excep{
//     public static void validate(int age)
//     {
//         if(age>18)
//         {
//             System.out.println("You are valid for Vote");
//         }
//         else
//         {
//             throw new ArithmeticException("You are not valid for vote");
//         }
//     }
//     public static void main(String[] args)
//     {
//         try{            
//             validate(12);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error:"+e.getMessage());
//         }
//         System.out.println("Bye Bye..");
//     }
// }

// Throws keyword
class Excep{
    public static void main(String[] args) throws IOException
    {
        String name;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.print("Enter your Name: ");
        name=br.readLine();
        System.out.println("Name is:"+name);
    }
}
