import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating the List
        List<Integer> numbers = new ArrayList<>();
        ArrayList <ArrayList <Integer>> matrix = new ArrayList<>();
        ArrayList <Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        ArrayList <Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        ArrayList <Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        System.out.println(matrix);

        // Adding values to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);


        // Iterating using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator <ArrayList <Integer>> listIter = matrix.iterator();
        int res = 25 & 35;
        res = res & 1;
         
        System.out.println("Answer" + res);
         


        // Iterating using for-each
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Delete the first value
        numbers.remove(0);

        // Adding more values
        numbers.add(9);
        numbers.add(8);

        // Sorting the list
        Collections.sort(numbers);

        // Printing sorted list
        System.out.println(numbers);

        // Working with second list
        List<Integer> secondList = new ArrayList<>();
        secondList.add(34);
        secondList.add(56);

        // Merging second list into numbers
        numbers.addAll(secondList);
        System.out.println(numbers);

        // Removing element at index 3
        numbers.remove(3);
        System.out.println(numbers);

        // Checking second list
        System.out.println(secondList);

        // Removing all elements from secondList in numbers
        boolean result = numbers.removeAll(secondList);
        System.out.println(result);
        System.out.println(numbers);
        System.out.println(secondList);

        // Checking presence
        System.out.println(numbers.contains(77));
        System.out.println(numbers.containsAll(secondList));

        // Adding a value
        System.out.println(numbers.add(2));

        // Clearing the list
        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
    }
}
