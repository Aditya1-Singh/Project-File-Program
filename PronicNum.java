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

     


        
