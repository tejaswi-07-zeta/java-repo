import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionPractice2 {
    // public static void indexOf() {


    //     int[][] arrayOfArrays = {
    //         {1, 2},
    //         {3, 4},
    //         {5, 6}
    //     };
       
    //     int[] target = {3, 4};
       
    //     for (int i = 0; i < arrayOfArrays.length; i++) {
    //         if (arrayOfArrays[i].equals(target)) {
    //             System.out.println("Found at index: " + i);
    //         } else {
    //             System.out.println("Not Found");
    //         }
    //     }
    // }


    public static void indexOf() {


       int[][] arrayOfArrays = {
           {1, 2},
           {3, 4},
           {5, 6}
       };
  
       int[] target = {3, 4};
       boolean found = false;
  
       for (int i = 0; i < arrayOfArrays.length; i++) {
           if (Arrays.equals(arrayOfArrays[i], target)) {
               System.out.println("Found at index: " + i);
               found = true;
               break;
           }
       }
    }

 

public static void main(String[] args) {
    indexOf();
    int [][] arr1 = {{1 , 2} , {3 , 4} , {5,6}};
    int [] arr2 = {3 , 4};


    List <List <Integer>> list1 = new ArrayList<>();
    List <Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    List <Integer> subList1 = new ArrayList<>();
    subList1.add(1);
    subList1.add(2);
    list1.add(subList1);
    List <Integer> subList2 = new ArrayList<>();
    subList2.add(3);
    subList2.add(4);
    list1.add(subList2);
    List <Integer> subList3 = new ArrayList<>();
    subList1.add(5);
    subList1.add(6);
    list1.add(subList3);

    System.out.println(list1.indexOf(list2));

    for(List <Integer> list : list1){
        if(list.equals(list2)){
            System.out.println("Element found");

        }
    }

     

    




    
}
    
}
