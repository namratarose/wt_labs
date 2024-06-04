/*
    9.WAP in java which takes a name of a person as an input from
    the user implement the followings:
    ->Find the length of the string.
    ->Create the abbreviation of the name.
    ->Swap the case of all input characters.
 */
import java.util.Scanner;
class Name{
    public void length(String name){
        System.out.println("Length of the name is:"+name.trim().length());
    }
    public void abbreviation(String name)
    {
        int n=name.length();
        System.out.print("Abbreviation of name is:");
        System.out.print(Character.toUpperCase(name.charAt(0)));
        for (int i = 1; i < n - 1; i++){
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
        }
        System.out.println();
    }
    public void swap(String name)
    {
        int n=name.length();
        System.out.print("Swapped Characters are:");
        for (int i=0;i<n;i++)
        {
            if (name.charAt(i) == ' ')
                System.out.print(" ");
            else if(name.charAt(i)>='A' && name.charAt(i)<='Z')
                System.out.print(Character.toLowerCase(name.charAt(i)));

            else if(name.charAt(i)>='a' && name.charAt(i)<='z')
                System.out.print(Character.toUpperCase(name.charAt(i)));
        }
    }
    public static void main(String args[])
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        Name obj=new Name();
        obj.length(name);
        obj.abbreviation(name);
        obj.swap(name);  
    }
}