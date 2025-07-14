
import java.util.HashMap;

//

public class CasheEx2 {
    //
    public static void main(String[] args) {
        new CasheEx2();
       
    }

    public CasheEx2(){
     NumberCacher cache = new NumberCacher();
        long s1 = cache.sum(4_000_000_000L);
        System.out.println("s1 = " + s1);
        for(int i = 0; i < 1000; i++){
            s1 = cache.sum(4_000_000_000L);
            System.out.println("s1 = " + s1);
        }
    }
    
   


}

class NumberCacher {
    HashMap<Long, Long> cache = new HashMap<>();


    long sum(long max){
        if (cache.containsKey(max)) {
            return cache.get(max);
        }else {
            long total = realSum(max);
            cache.put(max, total);
            return total;
        }
    }
    long realSum(long max){
        long total = 0;
        for (long i = 0; i < max; i++) {
            total += i;
        }
        return total;
    }
}


    




    
