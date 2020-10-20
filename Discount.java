
/**
 * Write a program to display the discount
 * When the cost is:
 * less than equal to 10000, discount=5%
 * more than 10000 and less than equal to 20000, discount=10%
 * more than 20000 and less than equal to 35000, discount=15%
 * more than 35000, discount=20%
 */
import java.util.Scanner;  
public class Discount     
{
    public static void main(String args[])  //inputing string
    { 
        Scanner sc=new Scanner(System.in);  //inputing Scanner
        System.out.println("Enter you name: ");  //asking for the users name
        String name=sc.nextLine();
        System.out.println("Enter your mobile number: ");    //asking for the users mobile number
        long num=sc.nextLong();
        System.out.println("Enter the amount: ");   //asking for the amount the user has to pay
        double n=sc.nextInt();
        if(n<=10000)
        {
            n=n*5/100;
            System.out.println("Your amount to be paid after discount is: " +n);   //printing discount
        }
        else if(n>10000 && n<=20000)
        {
            n=n*10/100;
            System.out.println("Your amount to be paid after discount is: " +n);    //printing discount
        }
        else if(n>20000 && n<=35000)
        {
            n=n*15/100;
            System.out.println("Your amount to be paid after discount is: " +n);   //printing discount
        }
        else if(n>35000)
        {
            n=n*20/100;
            System.out.println("Your amount to be paid after discount is: " +n);   //printing discount
        }
        else
        System.out.println("INVALID ");  //if the user inputs a negetive or a wrong value the program will display INVALID
    }
}  //end