interface SachinWork{
    boolean palindrome(int n);
    int reverse(int n);
}
class Sachin implements SachinWork{
    public boolean palindrome(int n)
    {
        return n==reverse(n)?true:false;
    }
    public int reverse(int n){
       
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        return rev;
    }
}
class Demo{
    public static void main(String[] args)
    {
        Sachin obj = new Sachin();
        System.out.println(obj.palindrome(1234));
        System.out.println(obj.reverse(1234));
    }
}