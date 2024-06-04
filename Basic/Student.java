import java.util.Scanner;
class Student{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float p,c,m,total,per;
        System.out.println("Enter physics  marks:");
        p=sc.nextFloat();
        System.out.println("Enter chemistry  marks:");
        c=sc.nextFloat();
        System.out.println("Enter maths  marks:");
        m=sc.nextFloat();
        total=p+c+m;
        per=(total/300)*100;
        System.out.println("Physics:"+p+"\nChemistry:"+c+"\nMaths:"+m);
        System.out.println("Total is:"+total);
        System.out.println("Percentage is:"+per);
        if(per<=30)
        {
            System.out.println("fail");
        }
        else if(per>30 && per<=60)
        {
            System.out.println("Second division");
        }
        else if(per>60)
        {
            System.out.println("First divison");
        }
        

    }
}