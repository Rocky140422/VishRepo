import java.util.Scanner;






public class swapProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter valua of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//int a=10,b=20;
		System.out.println("Before swapping the values are = " + a + " " + b);
		//using three variables
		int t=a;//t=10
		a=b;//a=20
		b=t;//b=10
		System.out.println("After swapping the values are = a is " + a + " b is " + b);
		
		//without using third variable
		      //a=10 b=20,   
		a=a+b;//a=10+20=30,a=30,b=20
		b=a-b;//b=30-20=10,a=30,b=10
		a=a-b;//a=30-10=20,
		System.out.println("After swapping the values are = a is " + a + " b is " + b);
		//
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		System.out.println("After swapping the values are = a is " + a + " b is " + b);
		//bitwise XOR (^)
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping the values are = a is " + a + " b is " + b);
		b=a+b-(a=b);
		System.out.println("After swapping the values are = a is " + a + " b is " + b);
		//10+20
	}

}
