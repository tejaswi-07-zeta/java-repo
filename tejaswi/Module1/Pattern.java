public class Pattern{
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 0 ; i < n ; i++){
            int val = n - i;

            for(int j = i; j < n; j++){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}