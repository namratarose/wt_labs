import java.util.Scanner;
class Table
{
    public static void main(String[] args){
        int i;
        System.out.println("Enter number to print table:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(i=1;i<=10;i++)
        {
        System.out.println(n+"*"+i+"="+(n*i));
        } 
    }
    
}