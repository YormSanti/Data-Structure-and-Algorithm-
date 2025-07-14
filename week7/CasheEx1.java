//
public class CasheEx1 {
    public static void main(String[] args) {
        new CasheEx1();
    }

    public CasheEx1(){
    long s1 = sum(4_000_000_000L);
    System.out.println("s1 = " + s1);
    s1 = sum(4_000_000_000L);
    System.out.println("s1 = " + s1);
    s1 = sum(4_000_000_000L);
    System.out.println("s1 = " + s1);


}

long sum(long max){
    long total = 0;
    for (long i = 0; i < max; i++) {
        total += i;
    }
    return total;
}
    
}


