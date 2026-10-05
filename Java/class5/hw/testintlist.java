package hw;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class testintlist {

    @Test 
    public void testincrRecursiveDestructive() {
        intlist L1 = new intlist(5, null);
        L1.rest = new intlist(10, null);
        L1.rest.rest = new intlist(15, null);
        L1.rest.rest.rest = new intlist(20, null);

        intlist L2 = intlist.incrRecursiveDestructive(L1, 3);

        int expect1 = 8;  
        assertThat(L2.first).isEqualTo(expect1);
        assertThat(L1.first).isEqualTo(expect1);

        int expect2 = 13;  
        assertThat(L2.rest.first).isEqualTo(expect2);
        assertThat(L1.rest.first).isEqualTo(expect2);

        int expect3 = 18;  
        assertThat(L2.rest.rest.first).isEqualTo(expect3);
        assertThat(L1.rest.rest.first).isEqualTo(expect3);

        int expect4 = 23;  
        assertThat(L2.rest.rest.rest.first).isEqualTo(expect4);
        assertThat(L1.rest.rest.rest.first).isEqualTo(expect4);


    }   
    
}
