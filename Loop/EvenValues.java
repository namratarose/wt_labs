class EvenValues{
    public static  void main(String[] args) {
        int i,sum=0;
        System.out.println("Even values between 1 to 50:");
        for(i=1;i<=50;i++){
            if(i%2==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("Sum of even values between 1 to 50 is:"+sum+"\n");


        System.out.println("Even values between 1 to 100:");
        for(i=1;i<=100;i++){
            if(i%2==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("Sum of even values between 1 to 100 is:"+sum);
    }
}