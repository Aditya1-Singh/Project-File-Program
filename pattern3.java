
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