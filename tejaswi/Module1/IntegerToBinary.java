package Module2;
public class IntegerToBinary {
    public static void main(String[] args) {
        int n = 2;  
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            sb.append(0);
        }

        while (n > 0) {
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }

        System.out.println(sb.reverse().toString()); // Output: 101
    }
}
