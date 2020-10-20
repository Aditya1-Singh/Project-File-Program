/**
 * Write a program to check to enter a 2 digit number 
 * and check that the number is a special number 
 */
import java.util.Scanner;
public class SpecialNum  //clas name
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);  //importing scanner
        System.out.println("Enter a 2 digit number");  //entering 2 digit number
        int orgnum=in.nextInt();  //inputing the value of digit in this variable
        int num=orgnum; //using a temp variable
        int digit1=num%10;  //seperating
        num/=10;            //digits
        int sum=digit1+num;  //checking the number
        int prod=digit1*num;  //checking the number
        if((sum+prod==orgnum))  //using if-else
        System.out.println("It is a special number");
        else
        System.out.println("Its not a special number");
    }
}