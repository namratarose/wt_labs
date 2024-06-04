import java.util.Scanner;
class Array{
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the number of elements you want in array");
        n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        for(i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array element is:");
        for(i=0;i<arr.length;i++)
            System.out.println("Array at index "+i+" is:"+arr[i]);      
    }
}