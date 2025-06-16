
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array ={2,5,6,7,1,4,6,9};
          // remove fist elemt index 0
        int[] newa = new int[array.length - 1];

        for(int i = 1; i < array.length; i++){
            newa[i-1] = array[i];
        }

        Arrays.sort(newa);
        

        
        for(int item : newa){
            System.out.print(item + " ");
        }
    }
}