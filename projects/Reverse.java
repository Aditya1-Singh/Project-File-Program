import java.util.*;
public class Reverse
{
    static Scanner key = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.println("Enter a Number");
        int n = key.nextInt(), w=0;
        while (n>0){
            w=n%10;
            System.out.print(w);
            n=n/10;
        }
    }
 }