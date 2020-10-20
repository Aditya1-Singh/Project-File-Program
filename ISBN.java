/**
 * write a program to check whether the
 * number entered is a ISBN number
 * or not.
 */
import java.util.Scanner;
public class ISBN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  //importing Scanner
        System.out.println("enter a ten digit number");  //entering number
        String s1=sc.nextLine();  //saving value wntered in string
        long w=0;  //using long as it has 10-13 digits
        int k=1;
        for(int i=0;i<s1.length();i++)  //using for loop
        {
            char ch=s1.charAt(i);  //using char
            int ch1=Integer.parseInt(Character.toString(ch));  //changing char to string and then string to int
            w=w+ch1*k;  //formula
            k++;  //increment opperator
        }
        if(w%11==0)  //using if-else
        { 
            System.out.println("this is the isbn number");
        }
        else
        {
            System.out.println("this is not the isbn number");
        }
    }
}

