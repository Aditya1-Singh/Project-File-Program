# Project-File-Program
this repository contains all the programs i have written on bluej java.


1)
/**
 * Write a program to display the following pattern :  
 *    * 
 *    * # 
 *    * # * 
 *    * # * # 
 *    * # * # * 
 */
import java.util.*;
public class pattern1     //class name
{
    public static void main(String args[])    
    {                                       //using nested for loop
        for(int i=1;i<=5;i++)    //for loop for rows
        {
            for (int j=1;j<=i;j++)         //for loop for columns
            {                              
                if(j%2==0)                  // using if-else    
                    System.out.print("# ");
                else
                    System.out.print("* ");
            }
            System.out.println();// this is for placeing the object in the next line
        }
    }
}

2)

/**
 * Write a program to display the following pattern :
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
import java.util.Scanner;
public class pattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);   //importing Scanner
        for(int i=1;i<=5;i++)  //this for is for rows 
        {
            for(int j=1;j<=i;j++)   //this for is for coloumn
            {
                System.out.print(j+" ");  //to print those numbers
            }
            System.out.println();  //this is for space
        }
    }
}

3)

/**
 * write a program to print:
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
public class pattern3  
{  
    public static void main(String[] args)   
    {  
        int i; 
        int j; 
        for (i = 5; i >= 1; i--)   //this is for the rows
        {  
            for (j = 1; j <= i; j++)   //this is for the coloums
            {  
                System.out.print(j+" ");  
            }  
            System.out.println();  
        }  
        for (i = 2; i <= 5; i++)   //this is for the rows
        {  
            for (j = 1; j <= i; j++)  //this is for the coloums
            {  
                System.out.print(j+" ");  
            }  
            System.out.println();  
        }  
    }  
}  

4)
import java.util.*;
public class pattern4
{
    public static void main (String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        for (i=7;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
             System.out.print(""+j+"");
            }
             System.out.println("");
        }
        for(i=2;i<=7;i++)
        {
            for(j=1;j<=i;j++)
            {
                 System.out.print(""+j+"");
            }
             System.out.println("");
            }
        }
    }
    
    5)
    import java.util.Scanner;
 public class pattern5
 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int j;
            for( j = 1; j<=i;j++){
                System.out.print(j);
                j = j + 1;
            }
            System.out.println();
            
        }
    }
}
            
       6)
       
       import java.util.Scanner;
  
public class pattern6
{            
        public static void main(String[] args) {
            int i, j, k = 1;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j< i + 1; j++) {
                    System.out.print(k++ + " ");
                }
       
                System.out.println();
            }
        }
       
    }
    
    
    7)
    import java.util.Scanner;

public class pattern7
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 0; i--)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<= 5; i++)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}


8)
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


9)
/**
 * Write a program to input a number
 * and check weather the number is spy number.
 */
import java.util.Scanner;
public class SpyNum  //class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); //importing scanner
        System.out.println("Eneter a number :");  //entering number
        int n=sc.nextInt();
        int temp=n;  //using a temp variable
        int sum=0;
        int mult=1;
        for(int i=1;i<=n;i++)  //using for loop
        {  
            n=n%10;  //seperating digits
            n=n/10;  //seperating digits
            sum=sum+n;    //checking number
        }
        if(sum==temp)   //using if-else
        System.out.println("its a spy number");
        else
        System.out.println("Its not a spy number");
    }
}


10)

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


11)
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



12)
/**
 * write a java program to 
 * show that whether the entered 
 * number is a pronic number or not
 */

import java.util.Scanner;
public class PronicNum
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int flag=0;
    int num=0;
    for(int i=1;i<num;i++)
    {
    int product=i*(i+1);
    if(product==num)
    {
     System.out.println("pronic no");
     flag=1;
    }
    else{
        if(flag==0)
        {
        System.out.println("not a pronic no");
    }
}
}
}
}

     
     
     
     
     13)
     
     
     
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



14)


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




15)


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
 
 
 
 
 16)

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





17)


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





18)



//importing Scanner 
import java.util.Scanner;

// the name of our class
public class Shape_area {
    public static void main (String[] args)
    {
        //declaring float
        float a,b,area = 0;
        char choice;
        Scanner input = new Scanner(System.in);

        //Take inputs
        System.out.println("Enter A for circle.");
        System.out.println("Enter B for square.");
        System.out.println("Enter C for rectangle.");
        System.out.println("Enter D for triangle.");
        String s = input.next();
        choice = s.charAt(0);
        char cd;
        do{

            //adding switch statement
            switch(choice)
            {
                case 'A':
                System.out.println("Enter radius:");
                a = input.nextFloat();
                area = 3.14f*a*a;
                break;
                case 'B':
                System.out.println("Enter side:");
                a = input.nextFloat();
                area = a*a;
                break;
                case 'C':
                System.out.println("Enter length and breadth:");
                a = input.nextFloat();
                b = input.nextFloat();
                area = a*b;
                break;
                case 'D':
                System.out.println("Enter base and height:");
                a =input.nextFloat();
                b =input.nextFloat();
                area = 0.5f*a*b;
                break;
                default:
                System.out.println("Error");
            }
            //closing of switch statement
            System.out.println("Area = "+area);
            System.out.println("Do you want to execute the program again  y/n");
            cd=input.next().charAt(0);
        }while(cd=='y'||cd=='Y');
    }
}




19)


//importing Scanner 
import java.util.Scanner;

// the name of our class
public class Shape_area {
    public static void main (String[] args)
    {
        //declaring float
        float a,b,area = 0;
        char choice;
        Scanner input = new Scanner(System.in);

        //Take inputs
        System.out.println("Enter A for circle.");
        System.out.println("Enter B for square.");
        System.out.println("Enter C for rectangle.");
        System.out.println("Enter D for triangle.");
        String s = input.next();
        choice = s.charAt(0);
        char cd;
        do{

            //adding switch statement
            switch(choice)
            {
                case 'A':
                System.out.println("Enter radius:");
                a = input.nextFloat();
                area = 3.14f*a*a;
                break;
                case 'B':
                System.out.println("Enter side:");
                a = input.nextFloat();
                area = a*a;
                break;
                case 'C':
                System.out.println("Enter length and breadth:");
                a = input.nextFloat();
                b = input.nextFloat();
                area = a*b;
                break;
                case 'D':
                System.out.println("Enter base and height:");
                a =input.nextFloat();
                b =input.nextFloat();
                area = 0.5f*a*b;
                break;
                default:
                System.out.println("Error");
            }
            //closing of switch statement
            System.out.println("Area = "+area);
            System.out.println("Do you want to execute the program again  y/n");
            cd=input.next().charAt(0);
        }while(cd=='y'||cd=='Y');
    }
}



20)


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





Thankyou for reading.
