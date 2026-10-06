import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;



public class testSLList {

    @Test
    public void testAddlast() {
        SLList L = new SLList(10);
        L.addfirst(5);
        L.addlast(5);

        assertThat(L.getlast()).isEqualTo(5);
        assertThat(L.getfirst()).isEqualTo(5);
        assertThat(L.size()).isEqualTo(3);

        
    }
}