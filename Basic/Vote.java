import java.util.Scanner;
class Vote {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter number:");
    num = sc.nextInt();
    if (num>=18) 
    System.out.println("Congratulations! You can vote!"); 
    else 
    System.out.println("Hey kid,You can not vote.");
    }
}
