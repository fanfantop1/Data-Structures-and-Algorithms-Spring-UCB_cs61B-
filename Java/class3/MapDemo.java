import java.util.*;


public class MapDemo {
    void main() {
        Map<String, Integer> census = new HashMap<>();
        census.put("California", 39538223);
        census.put("Texas", 29145505);
        int num_Texas = census.get("Texas");
        IO.println(num_Texas);
        
    }

}
