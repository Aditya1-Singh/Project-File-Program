import java.util.Scanner;
public class PrimeNum
{
   public static void main (String args[])
   {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter number");
       int num = sc.nextInt();
       int count = 0;
       for (int i = 1; i <= num; i++)
       {
           if (num % i == 0) 
           {
               count++;
            }
        }
           if (count == 2)
           { 
               System.out.println("Your number is prime");
            }
            else 
            {
                System.out.println("Your number is not prime");
            
        }
    }
}

