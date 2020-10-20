/**
 * Write a program to check that the number
 * entered is a armstrong number.
 */
import java.util.Scanner;       
public class Armstrong            //class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);   //importing Scanner
        System.out.println("Eneter a number  :");  //Entering number
        int n=sc.nextInt();   //inputing number in this
        int sum=0;   //initialising sum 
        int a=' ';   //initaialising the basic variable
        int temp=n;  //using a temp variable
        while(n>0)   //using while loop
        {  
            a=n%10;  //seperating 
            n=n/10;  //digits
            sum=sum+(a*a*a);  //checking armstrong
        }  
        if(temp==sum)  //using if-else
            System.out.println("armstrong number");   
        else  
            System.out.println("Not armstrong number");   
    }  
}  