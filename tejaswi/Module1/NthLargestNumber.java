package Module2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NthLargestNumber {

    public static int nthLargest(int [] arr , int n){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : arr){
            pq.offer(x);
        }

        int count = 0;

        while(count < n - 1){
            if(!pq.isEmpty())
            {
                pq.poll();
                count++;

            }
            
        }

        return !pq.isEmpty() ? pq.peek() : -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5 , 3 , 2 , 7};

        int n = sc.nextInt();

        int res = nthLargest(arr , n);
        System.out.println(res);
        sc.close();



    }
    
}
