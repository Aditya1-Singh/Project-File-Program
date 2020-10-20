/**
 * Write a program to input a number
 * and check weather the number is spy number.
 */
import java.util.Scanner;
public class SpyNum  //class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); //importing scanner
        System.out.println("Eneter a number :");  //entering number
        int n=sc.nextInt();
        int temp=n;  //using a temp variable
        int sum=0;
        int mult=1;
        for(int i=1;i<=n;i++)  //using for loop
        {  
            n=n%10;  //seperating digits
            n=n/10;  //seperating digits
            sum=sum+n;    //checking number
        }
        if(sum==temp)   //using if-else
        System.out.println("its a spy number");
        else
        System.out.println("Its not a spy number");
    }
}