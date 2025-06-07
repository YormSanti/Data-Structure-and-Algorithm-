
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class j {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new  ArrayList<>(Arrays.asList(20,40,39,10,11,23,45,25));

        Collections.sort(arr);
        
        for(int num : arr){
            System.out.print(num+ " ");
        }

        System.out.println("");

        arr.remove(arr.size()-1);

        for(int num : arr){
            System.out.print(num+" ");
        }

        System.out.println(" ");

        Collections.reverse(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }

        
        System.out.println(" ");

        ArrayList<Integer> event = new ArrayList<>();
        for(int num : arr){
            if(num % 2 == 0){
                event.add(num);
                
                
            }
        }
        Collections.sort(event);
        

        for(int num : event){
            System.out.print(num+ " ");
        }
        System.out.println(" ");
        ArrayList<Integer> odd = new ArrayList<>();

        for(int num : arr){
            if(num %2 == 0){
                event.add(num);
            }else{
                odd.add(num);
            }
        }

        Collections.sort(odd);

        for(int num : odd){
            System.out.print(num+ " ");
        }


        

    }
    
}
