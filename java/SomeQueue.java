
import java.util.PriorityQueue;
import java.util.Queue;

public class SomeQueue {
    public static void main(String[] args) {
        Queue<String> pool = new PriorityQueue<>();
        pool.add("computer A");
        pool.add("laptop B");
        pool.add("IPhone C");
        System.out.println(pool);

        try {
            String rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);

            rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);

            rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);

            rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);

            rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);
           
             rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);

             rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);
             rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);
             rem = pool.remove();
            System.out.println(rem);
            System.out.println(pool);

            
        } catch (Exception e) {
            System.out.println("queue is empty");
        }
    }
    
}
