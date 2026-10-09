import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class class7 {


    @Test 
    public void testPizzaList() {
        PizzaList<Integer> L = new PizzaList();
        L.addfirst(1);
        L.addlast(16);
        L.addlast(13);
        int A = L.getfirst();


        PizzaList<String> room = new PizzaList();
        room.addfirst("hexin");

        AList B = new AList();
        B.addlast(1);



         assertThat(1).isEqualTo(A);
         assertThat(13).isEqualTo(L.getlast());
         assertThat("hexin").isEqualTo(room.getfirst());
    } 


    
}
