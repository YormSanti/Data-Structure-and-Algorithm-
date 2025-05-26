public class List_I {

    public static void main(String[] args) {


        int[] arr = {4, 2, 1};
        int[] newArr = new int[arr.length + 1];
        // add first element
        newArr[0] = 3; // adding first element
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i]; // copying the rest of the elements
        }
        // after add first element
        System.out.println("After adding first element:");
        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println(" ");      
        // add last element, 5
        int[] tempArr = new int[newArr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            tempArr[i] = newArr[i];
        }
        tempArr[tempArr.length - 1] = 5; // add 5 at the end

        // remove last
        int[] arr2 = new int[tempArr.length - 1];
        for (int i = 0; i < tempArr.length - 1; i++) {
            arr2[i] = tempArr[i]; // copying all but the last element
        }
        // after remove last
        System.out.println("After adding 5 and removing last element:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");
        // reverse the array
        int[] reversedArr = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            reversedArr[i] = arr2[arr2.length - 1 - i]; // reversing the array
        }
        // after reverse
        System.out.println("After reversing the array:");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }

       
    
    
        
    }
    
}
