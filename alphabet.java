
import java.util.*;
class alphabet
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the alphabets");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println((char)(j+96));
			}
		System.out.println();
		}


	}
}