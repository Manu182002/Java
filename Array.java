//SUM AND AVG OF AN ARRAY
import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
    int a[];
    int size,i,j,sum;
    float avg;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    size=sc.nextInt();
    a=new int[size];
    System.out.println("Enter the elements of the array");
    for(i=0;i<size;i++)
    {
        a[i]=sc.nextInt();
    }
    //System.out.println("The elements of an array are:"+a);
    sum=0;
    for(i=0;i<size;i++)
    {
        sum=sum+a[i];
    }
    avg=(float)sum/size;//explicit typecasting
    System.out.println("The elements of an array are:");
    for(i=0;i<size;i++)
    {
        System.out.println("Sum is"+sum);
        System.out.println("Avg is"+avg);        
    }

    }
    
    
}
