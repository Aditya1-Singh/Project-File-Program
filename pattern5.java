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
            
       