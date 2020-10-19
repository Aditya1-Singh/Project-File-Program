
/**
 * write a program to display a tech number
 * a tech numbers is a number in which the number is seperated into two parts 
 * and the square of tghose two parts shold be equal to that number
 */
import java.util.Scanner;
public class TechNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digit number: ");  //to input 4 numbers
        int n=sc.nextInt();
        int temp=n;
        int d=0;
        int e=0;
        int sum=0;
        e=n%100;                //to seperate
        System.out.println(e+ " ");
        d=n/100;              //to seperate
        System.out.println(d+ " ");
        sum=e+d;            //to sum
        int sq=(int)Math.pow(sum,2);   //to square
        if(sq==temp)
        System.out.println("Its a tech number");
        else
        System.out.println("its not a tech number");
    }
}