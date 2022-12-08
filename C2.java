import java.util.*;
import java.io.*;
public class C2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char op;
		double a,b,sum=0;
		System.out.println("Enter first number :");
		a=sc.nextDouble();
		sum=a;
		
		for(;;)
		{
			System.out.println("Enter an operator(+,-,*,/)and  '#' to exit ");
			op=sc.next().charAt(0);
			if(op=='+')
			{
				System.out.println("Input the number :");
				b=sc.nextDouble();
				sum+=b;
				System.out.println("Result is:"+sum+"\n\n--------------------");
		}
			else if(op=='-')
			{
				System.out.println("Input the number :");
				b=sc.nextDouble();
				sum-=b;
				System.out.println("Result is:"+sum+"\n\n--------------------");
		}
			else if(op=='*')
			{
				System.out.println("Input the number :");
				b=sc.nextDouble();
				sum*=b;
				System.out.println("Result is:"+sum+"\n\n--------------------");
		}
			else if(op=='/')
			{
				System.out.println("Input the number :");
				b=sc.nextDouble();
				if(b==0) {
					System.out.println("Input invalid\nEnter new number :");
					b=sc.nextDouble();
				}
			
				sum/=b;
				System.out.println("Result is:"+sum+"\n\n--------------------");
		}
			else if(op=='#')
			{
				System.out.println("Result is "+sum+"\n-------------");
				System.out.println("Thanks for using this code\n\n");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid operator");
				continue;
				
			}
	}
	}
}
