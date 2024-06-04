import area.Area;
import java.util.Scanner;
class demo{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r=sc.nextInt();
        System.out.println("Enter length:");
        int l=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();
        System.out.println("Enter side of the square:");
        int a=sc.nextInt();

        Area obj=new Area();
        System.out.println("Area of the circle is:"+obj.circle(r));
        System.out.println("Area of the Rectangle is:"+obj.rectangle(l,b));
        System.out.println("Area of the Square is:"+obj.square(a));       

    }
}