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

        AList B = new AList(3);
        B.addlast(1);
        B.addlast(1);
        B.addlast(2);
        int C = B.intSize();
        int D = B.getIndex(2);
        B.addlast(3);


         assertThat(1).isEqualTo(A);
         assertThat(13).isEqualTo(L.getlast());
         assertThat("hexin").isEqualTo(room.getfirst());
         assertThat(3).isEqualTo(C);
         assertThat(4).isEqualTo(B.size);
         assertThat(2).isEqualTo(D);
         assertThat(3).isEqualTo(B.getIndex(3));
    } 


    
}
