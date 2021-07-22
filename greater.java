//to read numbers and which is greater
import java.util.*;
class greater
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number'");
		a=sc.nextInt();
		System.out.println("Enter the Second number");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Greater number is "+a);
		}
		else
		{
			System.out.println("Greater number is "+b);
		}
	}
}