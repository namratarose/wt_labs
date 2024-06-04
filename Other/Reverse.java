//Overloading with reverse() method
class Reverse {

  public void reverse(int n) {
    int r;
    while (n > 0) {
      r = n % 10;
      System.out.print(r);
      n=n/10;
    }
  }

  public void reverse(String n) {
    System.out.println();
    for (int i = n.length()-1; i >=0; i--) {
        System.out.print(n.charAt(i));
    }
  }

  public static void main(String[] args)
  {
    Reverse obj = new Reverse();
    obj.reverse(543);
    obj.reverse("rose");
  }
}
