
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