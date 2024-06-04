import mathematics.Matrix;
import java.util.Scanner;
class matrixImp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of Matrix : ");
        int n=sc.nextInt();
        System.out.println("Enter The Elements Of First Matrix:");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter The Elements Of Second Matrix:");
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        Matrix obj=new Matrix();
        obj.add(a,b,n);
        obj.subtract(a,b,n);
        
    }
}