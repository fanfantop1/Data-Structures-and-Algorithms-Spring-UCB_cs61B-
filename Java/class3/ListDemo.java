import java.util.List;
import java.util.ArrayList;



public class ListDemo {
    void main() {
        List<String> A = new ArrayList<>();
        A.add("hello");
        A.add("world");
        IO.println(A.get(0));
        String s = A.get(0);
        IO.println(s);
    }
}