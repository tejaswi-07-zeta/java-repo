
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        
        // Runnable r = () -> System.out.println("Hello");
        // r.run();
        //String s = "primeNumber";

        // Function < String , Integer> function = s -> s.length();
        // System.out.println(function.apply("hello")); 

        String [] arr = {"mango" , "apple" , "banana" , "watermelon" , "papaya"};
        int count = 0;
        Predicate <String> isLong = s -> s.length() > 5;

        for(int i = 0; i < arr.length; i++){
            if(isLong.test(arr[i])){
                count += 1;
            }

        }

        System.out.println(count);

    }
    
}
