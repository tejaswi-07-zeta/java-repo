import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;



public class Map {
    public static void main(String[] args) {
        
        HashMap <String , Integer> map = new HashMap<>();
        HashMap <String , ArrayList <Integer>> newMap = new HashMap<>();
        ArrayList <Integer> primes = new ArrayList<>();

        primes.add(2);
        primes.add(3);
        primes.add(5);

        
        map.put("mango" , 1);
        map.put("apple" , 2);
        map.put("guava" , 3);
        map.put(null , 0);
        map.put(null,null);
        newMap.put("Primes" , new ArrayList<>());
        newMap.get("Primes").add(2);
        newMap.get("Primes").add(3);
        newMap.get("Primes").add(5);
        newMap.get("Primes").add(7);




        ArrayList <Integer> numbers = newMap.get("Primes");

        numbers.add(7);
        numbers.get(0);
        numbers.set(1 , 23);
        numbers.indexOf(23);
        numbers.add(23);
        numbers.lastIndexOf(23);
        List <Integer> res = numbers.subList(0, 1);
        System.out.println(res);

        
        int value = map.get("apple");
        System.out.println(value);
        
        map.remove("guava");
        System.out.println(map.containsKey("guava"));
        System.out.println(map.containsValue(1));

        Set <String> keys = map.keySet();
        System.out.println(keys);

        Collection <Integer> values = map.values();
        System.out.println(values);
        
        System.out.println(map.entrySet());
        System.out.println(newMap);











    }
    
}
