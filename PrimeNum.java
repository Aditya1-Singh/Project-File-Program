/**
 * Write a java program to 
 * check whether the entered 
 * 
 * number is a prime number or not.
 */
import java.util.Scanner;
public class PrimeNum
{
   public static void main (String args[])
   {
       Scanner sc = new Scanner (System.in);  //importing Scanner
       System.out.println("Enter number");  //entering number
       int num = sc.nextInt();  //saving th value of the entered number in this variable
       int count = 0;
       for (int i = 1; i <= num; i++)  //using for loop
       {
           if (num % i == 0)   //using if-else in for
           {
               count++;
            }
        }
           if (count == 2)  //checking number through if-else
           { 
               System.out.println("Your number is prime");
            }
            else 
            {
                System.out.println("Your number is not prime");
            
        }
    }
}

