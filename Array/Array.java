import java.util.Scanner;
import java.io.*;
// Count even and odd numbers of the array
class EvenOdd{
    public void evenodd(int arr[]) {
        int n = arr.length;
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            even++;
            else
            odd++;
        }
        System.out.println("Even number is:"+even+" Odd number is:"+odd);
    }
}
class Array1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        EvenOdd obj=new EvenOdd();
        obj.evenodd(arr);
    }
}

// Searching and element from an array
class Search{
    public void search(int arr[],int key)
    {
        int i,n=arr.length;
        for(i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Found at index "+(i+1));
                break; 
            }           
        }
        if(i==n)
            System.out.println("Not Found!");
    }
}

class Array2{
    public static void main(String[] args)
    {
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key to search:");
        key=sc.nextInt();
        Search s1=new Search();
        s1.search(arr,key);
    }
}

// Program for finding the largest element of an array
class Largest{
    public void printLargest(int arr[],int n){
        int i,max=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max is:"+max);
    }
}
class Array3{
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the element of the array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Largest l1=new Largest();
        l1.printLargest(a,n); 
    } 
}

// Program for seletion sort
class Select{
    public void selectionSort(int arr[],int n)
    {
        int i,j,min;
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            if(min!=i)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
class Array4{
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the element of the array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Select l1=new Select();
        l1.selectionSort(a,n);
        System.out.println("The sorted array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}

// Program for printing binary equivalent of given integer value
//Not working
class Binary{
    public void binary(int num)
    {
        int i,digit,count=0;
        int number=num;
        String str="";
        StringBuffer  buf=new StringBuffer(str);
        while(number>0)
        {
            digit=number%2;
            buf.append(digit);
            number/=2;
        }
        // Reverse the string
        System.out.println(buf.reverse);
    }
}
class Array5{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to convert in binary");
        int num=sc.nextInt();
        Binary b1=new Binary();
        b1.binary(num);
    }
}