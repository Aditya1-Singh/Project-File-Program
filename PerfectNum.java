/**
 * write a java program to 
 * check whether the entered 
 * number is a perfect number or not
 */
import java.util.Scanner;
class PerfectNum
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in);   //importing Scanner
           System.out.println("Enter the number");  //entering number
           int n= in.nextInt();  //savin the value of entered number in this number
           int sum = 0;
           for ( int i = 1; i<n;i++)  //using for loop
           { if (n%i==0)  //using if else
               sum=sum+i;
           }
           if (sum==n)  //checking number
           System.out.println("Perfect number");
           else
           System.out.println("Not a Perfect number");
    }
}