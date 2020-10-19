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