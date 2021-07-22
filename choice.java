import java.util.*;
class choice
{
	public static void main(String[] args)
	{
	int n,rev=0,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  number");
	n=sc.nextInt();
	temp=n;
	
	while(n!=0)
	{
		temp=n%10;
		rev=rev*10+temp;
		n=n/10;
	}
		n=rev;
		while(n!=0)
		{
			temp=n%10;
			switch(temp)
			{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			default:
				System.out.println("Invalid");
			}
			n=n/10;
		}
	}
}