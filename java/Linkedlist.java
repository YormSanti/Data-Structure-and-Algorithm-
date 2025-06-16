
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("sok");
        names.add("sao");
        names.add("atith");
        names.add("chan");

        //names.remove("sao");

        // for(String item : names){
        //     System.out.println(item);
        // }

        for(int index =0 ; index <names.size(); index++){
            System.out.println(names.get(index));
        }
    }
    
}
