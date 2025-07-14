
import java.util.ArrayList;
import java.util.Arrays;

public class ListEx1 {
  public static void main(String[] args) {
    ArrayList<Integer> num = new  ArrayList<>(Arrays.asList(4, 2, 1, 3, 5, 6, 7));
    num.forEach((x) -> System.out.print(x + ","));
    num.add(8);
    System.out.println("\n after add 8: ");
    num.forEach((x) -> System.out.print(x + ","));
    num.remove(0);
    num.forEach((x)->System.out.println(x+","));

  }
}