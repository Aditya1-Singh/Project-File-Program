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