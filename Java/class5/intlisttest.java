import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class intlisttest {

    @Test 
    public void testSize() {
        intlist L = new intlist(5, null);
        L.rest = new intlist(10, null);
        L.rest.rest = new intlist(15, null);
        L.rest.rest.rest = new intlist(20, null);

        int expect = 4;
        int result = intlist.sizefor(L);
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void testSize2() {
        intlist L = new intlist(5, null);
        L.rest = new intlist(10, null);
        L.rest.rest = new intlist(15, null);
        L.rest.rest.rest = new intlist(20, null);

        int expect = 4;
        int result = intlist.size(L);
        assertThat(result).isEqualTo(expect);
    }

    @Test 
    public void testget() {
        intlist L = new intlist(5, null);
        L.rest = new intlist(10, null);
        L.rest.rest = new intlist(15, null);
        L.rest.rest.rest = new intlist(20, null);

        int expect = 10;
        int result = intlist.get(L, 1);
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void testgetcurrent() {
        intlist L = new intlist(5, null);
        L.rest = new intlist(10, null);
        L.rest.rest = new intlist(15, null);
        L.rest.rest.rest = new intlist(20, null);

        int expect = 15;
        int result = L.rest.getcurrent(L.rest, 1);
        assertThat(result).isEqualTo(expect);
    }

    
    @Test 
    public void testlistadd() {
        intlist L1 = new intlist(5, null);
        L1.rest = new intlist(10, null);
        L1.rest.rest = new intlist(15, null);
        L1.rest.rest.rest = new intlist(20, null);

        intlist L2 = L1.listadd( 1);
        int expect1 = 6;
        int expect2 = 11;
        int expect3 = 16;
        int expect4 = 21;

        assertThat(L2.first).isEqualTo(expect1);
        assertThat(L2.rest.first).isEqualTo(expect2);
        assertThat(L2.rest.rest.first).isEqualTo(expect3);
        assertThat(L2.rest.rest.rest.first).isEqualTo(expect4);
        assertThat(L1.first).isEqualTo(5);


        intlist L3 = L1.listadd( 2);
        int expect5 = 7;  
        assertThat(L3.first).isEqualTo(expect5);
    }
}
