import java.util.Scanner;

public class HotelMenu {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to www.IndianRestaurant.in");
        System.out.println();

        //Creating Menu
        while(true){
            System.out.println("To order Punjabi Dish, Enter 1");
            System.out.println("To order North Indian Dish, Enter 2");
            System.out.println("To order Rajasthani Dish, Enter 3");
            System.out.println("To order Gujrati Dish, Enter 4");
            System.out.println("To order Bengali Dish, Enter 5");
            System.out.println("To order Desserts, Enter 6");
            System.out.println("To Exit, Enter 9");

            System.out.println();
            System.out.println("Enter your choice::");
            int choice = scan.nextInt();

            switch(choice){
                case 1: System.out.println("Welcome to Punjabi Food Court");
                PunjabiFood();
                break;
                case 2: System.out.println("Welcome to North Indian Food Court");
                northIndianFood();
                break;
                case 3: System.out.println("Welcome to Rajasthani Food Court");
                rajasthaniFood();
                break;
                case 4: System.out.println("Welcome to Gujrati Food Court");
                gujratiFood();
                break;
                case 5: System.out.println("Welcome to Bengali Food Court");
                bengaliFood();
                break;			
                case 6: System.out.println("Welcome to Desserts Food Court");
                desserts();
                break;
                case 9: System.out.println("Thanks for ordering from our App. Visit again");
                System.exit(0);
                break;
                default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }
        }

    }

    public static void PunjabiFood(){
        System.out.println("You get:");
        System.out.println("Aloo Paratha : 2 Pieces:");
        System.out.println("Lassi : 1 Glass:");
        System.out.println("Gulab Jamun : 2 Pieces:");

    }

    public static void northIndianFood(){
        System.out.println("You get:");
        System.out.println("Chole Bhature : 2 Pieces:");
        System.out.println("Litti Chokha : 4 Pieces:");
    }

    public static void rajasthaniFood(){
        System.out.println("You get:");
        System.out.println("Dal Baati Churma");
        System.out.println("Laal maas");
        System.out.println("Methi Bajra puri");

    }

    public static void gujratiFood(){
        System.out.println("You get:");
        System.out.println("Dhokla : 2 pieces");
        System.out.println("Khandvi");
        System.out.println("Methi ka Thepla");
    }

    public static void bengaliFood(){
        System.out.println("You get:");
        System.out.println("Maach Bhaat");
        System.out.println("Aalu Luchi");
    }

    public static void desserts(){
        System.out.println("You get:");
        System.out.println("Rasmalai");
        System.out.println("Rasgulla : 2 Pieces");
        System.out.println("Emarti : 2 Pieces");
        System.out.println("Gajar ka halwa");

    }

}