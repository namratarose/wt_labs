import java.util.* ;

class Demo1{
	public static void main(String []args){
		System.out.println("Hello "+args[0]);
	}
}

class Demo2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		System.out.println("a="+a+"\nb="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\nb="+b);
	}
}

class Demo3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a>b?a:b ;
		max = max>c?max:c ;
		System.out.println("Maximum = "+max);
	}
}

class Demo4{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nMarks of P = ");
		int p = sc.nextInt();
		System.out.print("\nMarks of C = ");
		int c = sc.nextInt();
		System.out.print("\nMarks of M = ");
		int m = sc.nextInt();
		int total= p+c+m;
		int percent= total/3;
		System.out.println("TOtal Marks = "+total);
		System.out.println("Percentage = "+percent+"%");
		if(percent>80) 
			System.out.println("Grade = A");
		else if(percent>60) 
			System.out.println("Grade = B");
		else if(percent>40) 
			System.out.println("Grade = C");
		else 
			System.out.println("Grade = F");
	}
}

class Demo5{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int n = sc.nextInt();
		switch(n){
			case 1:
				System.out.print("\nMonday");
				break;
			case 2:
				System.out.print("\nMonday");
				break;
			case 3:
				System.out.print("\nTuesday");
				break;
			case 4:
				System.out.print("\nWednesday");
				break;
			case 5:
				System.out.print("\nThursday");
				break;
			case 6:
				System.out.print("\nFriday");
				break;
			case 7:
				System.out.print("\nSaturday");
				break;
			default :
				System.out.print("\nInvalid Number");
				break;
		}
	}
}

class Demo6{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter first number = ");
		int a = sc.nextInt();
		System.out.print("\nEnter second number = ");
		int b = sc.nextInt();
		System.out.print("\nEnter operator = ");
		char o = sc.nextChar();
		switch(o){
			case '+':
				System.out.print("\na+b="+(a+b));
				break;
			case '-':
				System.out.print("\na-b="+(a-b));
				break;
			case '*':
				System.out.print("\na*b="+(a*b));
				break;
			case '/':
				System.out.print("\na/b="+(a/b));
				break;
			default :
				System.out.print("\nInvalid Operator");
				break;
		}
	}
}

class Demo7{
	public static void main(String []args){
		int sum=0;
		for(int i=0;i<51;i++){
			if (i%2==0)
				sum+=i;
		}
		System.out.println("Sum of even number from 1 to 50 = "+sum);
	}
}

class Demo8{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int n = sc.nextInt(),fact=1;
		for(int i=n;i>0;i--){
			fact*=i;
		}
		System.out.println("Factorial of "+n+" = "+fact);
	}
}

class Demo9{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the base number = ");
		int x = sc.nextInt();
		System.out.print("\nEnter the power = ");
		int n = sc.nextInt(),pow=1;
		for(int i=0;i<n;i++){
			pow*=x;
		}
		System.out.println(n+" power of "+x+" = "+pow);
	}
}

class Demo10{
	public static void main(String []args){
		int sum=0;
		for(int i=0;i<101;i++){
			if (i%2==0)
				sum+=i;
		}
		System.out.println("Sum of even number from 1 to 100 = "+sum);
	}
}

class Demo11{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int n = sc.nextInt();
		System.out.println("\nNumber \t Square");
		for(int i=1;i<=n;i++){
			System.out.println(i+" \t  "+(i*i));
		}
	}
}

class Demo12{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int num = sc.nextInt();
		int numt=num,rev=0;
		while(num){
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		System.out.println("\nReverse of the number = "+rev);
	}
}

class Demo13{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int num = sc.nextInt();
		int numt=num,rev=0;
		while(num){
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		if(numt==rev)
		System.out.println(numt+"is a palindrome number");
		else
		System.out.println(numt+"is not a palindrome number");
	}
}

class Demo14{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int num = sc.nextInt();
		int n=num.length(),numt=num,sum=0;
		while(num){
			sum+=num%10;
			num/=10;
		}
		int avg=sum/n;
		System.out.println("\nSum of the digit = "+sum);
		System.out.println("\nAverage of the digit = "+avg);
	}
}

class Demo15{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number = ");
		int num = sc.nextInt();
		int max=0;
		while(num){
			max=max>num%10?max:num%10;
			num/=10;
		}
		System.out.println("\nMaximum of the digit = "+max);
	}
}