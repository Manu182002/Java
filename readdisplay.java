//Program to read two numbers and display their sum,difference and product

import java.util.*;
class readdisplay
{
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number'");
		a=sc.nextDouble();
		System.out.println("Enter the Second number");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("The sum of number is "+c);
		c=a-b;
		System.out.println("The difference is" +c);
		c=a*b;
		System.out.println("The product is" +c);

	}

}