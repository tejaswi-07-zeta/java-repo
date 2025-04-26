public class LambdaCounterWithThread {
    public static void main(String[] args) throws InterruptedException {
        int[] count = {0};
 
 
        Runnable r = () -> {
            for (int i = 0; i < 100000; i++) {
                count[0]++;
            }
        };
 
 
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        // Thread t3 = new Thread(r);
        // Thread t4 = new Thread(r);
 
 
        t1.start();
        t2.start();
        // t3.start();
        // t4.start();
 
 
        t1.join();
        t2.join();
        // t3.join();
        // t4.join();
 
 
        System.out.println("Count is: " + count[0]);  // Should be 400000
    }
 }
 