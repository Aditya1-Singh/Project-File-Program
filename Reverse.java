/**
 * write a java program to 
 * reverse the numbere entered
 */
import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  //importing Scanner
        System.out.println("Enter a Number");  //entering number
        int n = sc.nextInt(), w=0;
        while (n>0){  //using while loop
            w=n%10;
            System.out.print(w);
            n=n/10;
        }
    }
 }