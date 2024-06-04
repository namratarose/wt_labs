final class Super{
    final public void message(){
        System.out.println("This is super method");
    }
}
//Super class can not be inherited due to final keyword
class Sub extends Super{
    //Can not override the message() due to final keyword
    public void message(){
        System.out.println("This is sub class method");
    }
}
class FinalM{
    public static void main(String[] args){
        Sub obj=new Sub();
        obj.message();
    }
}