import java.util.*;
public class numbertoword2
{
public static void main(String[] args)
{
	int n....
	....
	....
	m=n;
	count=0;
	while(m!=0)//find the number of digits & store it in count
	{
		count++;
		m=m/10;
	}
	String name[] = new String[count];//create a String array with count no of elements
	i=0;
	while(n!=0)
	{
		temp=n%10;
		n=n/10;
		switch(temp)
		{
			case 0:
				name[i]="Zero";
				break;
			case 1:
				name[i]="One";
				break;
			...
			...
			...
		}
		i++;
	}
	for(i=count-1;i>=0;i--)
	{
		S.o.p(name[i]+"\t");
	}
}
}