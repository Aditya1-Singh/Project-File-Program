
/**
 * write a program to have a choice by the user for many types of programs 
 * and ask that do the user want to continue and choose another option.
 */
import java.util.Scanner;
public class Do_While
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter your choice");
        System.out.println("Enter a for Spy Number program");
        System.out.println("Enter b for Tech Number Program");
        System.out.println("Enter c for Armstrong Number Program");
        String s = sc.next();
        char choice=' ';
        choice = s.charAt(0);
        char cd=' ';
        do{
            switch(choice)
            {
                case 'a':    //SPY NUMBER
                int n;
                int product=1;
                int sum=0;
                int num;
                // create object of scanner.
                Scanner scan = new Scanner(System.in);
                // you have to enter number here.
                System.out.print("Enter the number :" );
                // read entered number and store it in "n".
                n=scan.nextInt();
                // calculate sum and product of the number here.
                while(n>0)
                {
                    num=n%10;
                    sum=sum+num;
                    product=product*num;
                    n=n/10;
                }
                // compare the sum and product.
                if(sum==product)
                    System.out.println("Given number is spy number");
                else
                    System.out.println("Given number is not spy number");
                break;
                case 'b':    //TECH NUMBER
                Scanner sca=new Scanner(System.in);
                System.out.println("Enter a four digit number: ");  //to input 4 numbers
                int number=sca.nextInt();
                int temp=number;
                int d=0;
                int e=0;
                int result=0;
                e=number%100;                //to seperate
                System.out.println(e+ " ");
                d=number/100;              //to seperate
                System.out.println(d+ " ");
                sum=e+d;            //to sum
                int sq=(int)Math.pow(sum,2);   //to square
                if(sq==temp)
                    System.out.println("Its a tech number");
                else
                    System.out.println("its not a tech number");
                break;
                case 'c':      //ARMSTRONG NUMBER
                Scanner scann=new Scanner(System.in);
                System.out.println("Enter a number  :");
                int f=scann.nextInt();
                String x=String.valueOf(f);
                int z=x.length();
                int summ=0;
                int g=0;
                int tempo=f;
                while(f>0)  
                {  
                    g=f%10;  
                    f=f/10;  
                    summ=summ+(int)Math.pow(g,z);  
                }  
                if(tempo==summ)  
                    System.out.println("the number input is armstrong number");   
                else  
                    System.out.println("the number input is Not armstrong number");
                break;
                default:
                System.out.println("Invalid Statement");
            }
            System.out.println("Do you want to execute the program again  y/n");
            cd=sc.next().charAt(0);
        }while(cd=='y'||cd=='Y');
    }
}