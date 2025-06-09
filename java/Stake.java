
import java.util.Stack;

public class Stake {
public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(5);
        num.push(3);
        num.push(1);
        num.push(2);
        System.out.println(num);
        
        
        Integer x = num.pop();
        
        System.out.println(x);

        System.out.println(num);
        System.out.println("");

        
        
        
        x = num.pop();  
        
        System.out.println(x);
        System.out.println(num);


        

    }
    
}
