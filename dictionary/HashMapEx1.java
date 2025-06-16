
import java.util.HashMap;

public class HashMapEx1 {

    public static void main(String[] args) {
        HashMap<String,Object> st = new HashMap<>();
        st.put("id", 101);
        st.put("name", "Sok");
        st.put("score", "75.5");

        System.out.println(st.get("id"));
        System.out.println(st.get("name"));
        System.out.println(st.get("score"));

    }
    
}
