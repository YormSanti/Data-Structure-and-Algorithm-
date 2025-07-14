//

import java.util.HashMap;

public class EX3 {
    public static void main(String[] args) {
       EX3 my = new  EX3();
        
    }
    public EX3() {
        // This constructor is intentionally left empty
        NumberCacher cache = new NumberCacher();
        long s1 = cache.sum(10_000_000L);
        long total = 0;
        for(long index = 0; index < 10_000_000L; index += 1000){
            total += cache.sum(index);
            
        }

        System.out.println("Total sum = " + total);
    }
}

class NumberCacher {
    HashMap<Long, Long> cache = new HashMap<>();

    long sum(long max) {
        if (cache.containsKey(max)) {
            return cache.get(max);
        } else {
            long total = realSum(max);
            cache.put(max, total);
            return total;
        }
    }
    long realSum(long max) {
        long total = 0;
        for (long index = 0; index < max; index++) {
            total += index;
            if  (index % 1000 == 0){
                cache.put(index, total); // Cache intermediate results

            }
        }
        return total;
    }
}
