
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        var numbers = new java.util.ArrayList<Integer>(Arrays.asList(5,4,2,1,6));
        List<Integer> num2 = numbers.stream().filter((x)-> x % 2 == 0).toList();
        num2.forEach((x) -> System.out.print(x + ", "));
        System.out.println();

        List<Integer> num3 = numbers.stream()
                .filter((x) -> x % 2 == 0)
                .sorted()
                .toList();
        num3.forEach((x) -> System.out.print(x + ", "));
    }
    
}
