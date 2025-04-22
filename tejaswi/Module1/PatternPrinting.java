import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 0 ; i  < n ; i++){

            // ≥≥≥..ofirst stars

            for(int j = 0 ; j < n - i ; j++){
                System.out.print("* " );
            }

            // spaces

            for(int j = 0 ; j <  2 * i - 1; j++){
                System.out.print("  ");
            }

            // second stars
            for(int j = 0 ; j < n - i ; j++){
                if(i == 0 && j == 0)
                continue;
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n - 2; i  >= 0 ; i--){
            // first stars
            for(int j = 0 ; j < n - i ; j++){
                System.out.print("* " );
            }

            // spaces

            for(int j = 0 ; j <  2 * i - 1; j++){
                System.out.print("  ");
            }

            // second stars

            for(int j = 0 ; j < n - i ; j++){
                if(i == 0 && j == 0 )
                continue;
                System.out.print("* " );
            }

            System.out.println();
        }
        
    }
    
}
