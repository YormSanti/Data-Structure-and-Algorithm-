
import java.util.Arrays;
import java.util.Collections;



public class Array {
    public static void main(String[] args) {
        int[] arr = {8,4,5,6,10};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);
        // print the sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // revers an array
        System.out.println();
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        // remove first element
        System.out.println();
        int[] newArr = new int[arr.length - 1];
        for(int i = 1; i < arr.length; i++){
            newArr[i - 1] = arr[i];
        }
        // print the new array
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        // reverse the new array
        Integer[] arr1 = {8,9,1,4,6};
        Arrays.sort(arr1);
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        Collections.reverse(Arrays.asList(arr1));
        System.out.println(Arrays.toString(arr1));

        
        
 
    }
    
    
}
