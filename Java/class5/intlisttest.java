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
}
