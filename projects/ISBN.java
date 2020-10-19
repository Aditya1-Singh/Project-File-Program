import java.util.Scanner;
public class ISBN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a ten digit number");
        String s1=sc.nextLine();
        long w=0;
        int k=1;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            int ch1=Integer.parseInt(Character.toString(ch));
            w=w+ch1*k;
            k++;
        }
        if(w%11==0)
        {
            System.out.println("this is the isbn number");
        }
        else
        {
            System.out.println("this is not the isbn number");
        }
    }
}

    