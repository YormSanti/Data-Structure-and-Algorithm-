
public class List_O {

    public static void arr(){
        int[] arr = {4,2,1,3,5,6,7};
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
  
        }
        int newNum = 8;
        newArr[newArr.length - 1] = newNum;
        //after add

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println(); 
       
    }
    public static void main(String[] args) {
        arr();
        
        

        
    }
   


}