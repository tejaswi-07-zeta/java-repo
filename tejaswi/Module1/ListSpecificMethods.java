import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSpecificMethods {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.get(0);
        numbers.set(1 , 23);
        numbers.indexOf(23);
        numbers.add(23);
        numbers.lastIndexOf(23);
        List <Integer> res = numbers.subList(0, 1);
        System.out.println(res);


        LinkedList <Integer> elements = new LinkedList<>();
        elements.add(12);
        elements.add(13);
        elements.add(15);
        elements.add(17);
        int size = elements.size();
        int indexToRemove = 3;

        elements.remove(elements.get(indexToRemove));

        

        

        








    }
    
}
