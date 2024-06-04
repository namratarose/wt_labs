import java.util.Scanner;
class Series{
    public static void main(String[] args)
    {
        int n,i;
        System.out.println("Enter how many terms to print:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();        
        for(i=0;i<n;i++)
        {
            System.out.print(i%2+" ");
        }        
    }
}